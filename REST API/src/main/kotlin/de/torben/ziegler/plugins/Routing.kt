package de.torben.ziegler.plugins

import de.torben.ziegler.routes.albums
import de.torben.ziegler.routes.randomAlbum
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {


    routing {
        albums()
        randomAlbum()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
