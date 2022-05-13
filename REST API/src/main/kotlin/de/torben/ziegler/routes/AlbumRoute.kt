package de.torben.ziegler.routes

import de.torben.ziegler.data.model.Albums
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.randomAlbum() {
    get("/randomalbum") {
        call.respond(
            HttpStatusCode.OK,
            Albums.albums.random()
        )
    }
}

fun Route.albums() {
    route("/albums") {
        get {
            if (Albums.albums.isNotEmpty()) {
                call.respond(Albums.albums)
            } else {
                call.respondText("No albums found", status = HttpStatusCode.OK)
            }
        }
        get("{name?}") {
            val name = call.parameters["name"] ?: return@get call.respondText(
                "Missing name",
                status = HttpStatusCode.BadRequest
            )
            val album = Albums.albums.find { it.name.equals(name, ignoreCase = true) } ?: return@get call.respondText(
                "No album with name $name",
                status = HttpStatusCode.NotFound
            )
            call.respond(album)
        }
    }
}