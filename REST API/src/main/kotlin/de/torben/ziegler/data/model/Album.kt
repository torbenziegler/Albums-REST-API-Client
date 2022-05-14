package de.torben.ziegler.data.model

import de.torben.ziegler.utils.Constants

@kotlinx.serialization.Serializable
data class Album(
    val name: String,
    val artist: String,
    val releaseYear: Int,
    val imageUrl: String,
    val dominantColors: List<String>?,
    val songs: List<Song>
)

object Albums {
    val albums = listOf(
        Album(
            "Rodeo",
            "Travis Scott",
            2015,
            "${Constants.BASE_URL}/album_covers/rodeo.jpg",
            listOf(
                "#593a28",
                "#313a34",
                "#a56446",
                "#efbbac",
                "#201e19"
            ),
            listOf(
                Song("Pornography", "3:51"),
                Song("Oh My Dis Side (feat. Quavo)", "5:51"),
                Song("3500 (feat. Future & 2 Chainz)", "7:41"),
                Song("Wasted (feat. Juicy J)", "3:55"),
                Song("90210 (feat. Kacy Hill)", "5:39"),
                Song("Pray 4 Love (feat. The Weeknd)", "5:07"),
                Song("Nightcrawler (feat. Swae Lee & Chief Keef)", "5:21"),
                Song("Piss On Your Grave (feat. Kanye West)", "2:46"),
                Song("Antidote", "4:22"),
                Song("Impossible", "4:02"),
                Song("Maria I'm Drunk (feat. Justin Bieber & Young Thug)", "5:49"),
                Song("Flying High (feat. Toro y Moi)", "3:28"),
                Song("I Can Tell", "3:55"),
                Song("Apple Pie", "3:39"),
                Song("Ok Alright (feat. ScHoolboy Q)", "6:57"),
                Song("Never Catch Me", "2:56"),

                )
        ),
        Album(
            "Birds In The Trap Sing McKnight",
            "Travis Scott",
            2016,
            "${Constants.BASE_URL}/album_covers/birds.jpg",
            listOf(
                "#242d3d",
                "#b97c78",
                "#595158",
                "#040407",
                "#93332a"
            ),
            listOf(
                Song("the ends", "3:21"),
                Song("way back", "4:32"),
                Song("coordinate", "3:46"),
                Song("through the late night", "4:46"),
                Song("beibs in the trap", "3:33"),
                Song("sdp interlude", "3:11"),
                Song("sweet sweet", "3:42"),
                Song("outside", "2:56"),
                Song("goosebumps", "4:03"),
                Song("first take", "5:13"),
                Song("pick up the phone", "4:12"),
                Song("lose", "3:20"),
                Song("guidance", "3:27"),
                Song("wonderful", "3:36")
            )
        ),
        Album(
            "ASTROWORLD",
            "Travis Scott",
            2018,
            "${Constants.BASE_URL}/album_covers/astroworld.jpg",
            listOf(
                "#b08854",
                "#6baada",
                "#bf5b10",
                "#551e0d",
                "#edc767"
            ),
            listOf(
                Song("STARGAZING", "4:30"),
                Song("CAROUSEL", "3:00"),
                Song("SICKO MODE", "5:12"),
                Song("R.I.P SCREW", "3:05"),
                Song("STOP TRYING TO BE GOD", "5:38"),
                Song("NO BYSTANDERS", "3:38"),
                Song("SKELETONS", "2:25"),
                Song("WAKE UP", "3:51"),
                Song("5% TINT", "3:16"),
                Song("NC-17", "2:36"),
                Song("ASTROTHUNDER", "2:22"),
                Song("YOSEMITE", "2:30"),
                Song("CAN'T SAY", "3:18"),
                Song("WHO? WHAT!", "2:56"),
                Song("BUTTERFLY EFFECT", "3:10"),
                Song("HOUSTONFORNICATION", "3:37"),
                Song("COFFEE BEAN", "3:29")
            )
        ),
        Album(
            "JACKBOYS",
            "Travis Scott",
            2019,
            "${Constants.BASE_URL}/album_covers/jackboys.jpg",
            listOf(
                "#5c4e0c",
                "#98657b",
                "#383302",
                "#d9d1b9",
                "#ab8605"
            ),
            listOf(
                Song("HIGHEST IN THE ROOM (feat. ROSALÍA & Lil Baby) - REMIX", "4:04"),
                Song("JACKBOYS", "0:46"),
                Song("GANG GANG", "4:04"),
                Song("HAD ENOUGH (feat. Quavo & Offset)", "2:37"),
                Song("OUT WEST (feat. Young Thug)", "2:37"),
                Song("WHAT TO DO? (feat. Don Doliver)", "4:10"),
                Song("GATTI", "3:01")
            )
        ),
        Album(
            "Un Verano Sin Ti",
            "Bad Bunny",
            2022,
            "${Constants.BASE_URL}/album_covers/unveranosinti.jpg",
            null,
            listOf(
                Song("Moscow Mule", "4:05"),
                Song("Después de la Playa", "3:50"),
                Song("Me Porto Bonito", "2:58"),
                Song("Tití Me Preguntó", "4:03"),
                Song("Un Ratito", "2:56"),
                Song("Yo No Soy Celoso", "3:50"),
                Song("Tarot", "3:57"),
                Song("Neverita", "2:53"),
                Song("La Corriente", "3:18"),
                Song("Efecto", "3:33"),
                Song("Party", "3:47"),
                Song("Aguacero", "3:30"),
                Song("Enséñame a Bailar", "2:56"),
                Song("Ojitos Lindos", "4:18"),
                Song("Dos Mil 16", "3:28"),
                Song("El Apagón", "3:21"),
                Song("Otro Atardecer", "4:04"),
                Song("Un Coco", "3:16"),
                Song("Andrea", "5:39"),
                Song("Me Fui de Vacaciones", "3:00"),
                Song("Un Verano Sin Ti", "2:28"),
                Song("Agosto", "2:19"),
                Song("Callaita", "4:10")
            )
        )
    )
}
