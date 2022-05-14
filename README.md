# Albums REST API

This is a sample project to demonstrate Ktor as working REST API server with an android application client.
You can access albums from artists and receive general information such as related artist, color schemes, songs and their duration.

<p float="left">
  <img src="https://github.com/torbenziegler/Albums-REST-API/blob/main/Images/readme_1.jpg" width="250" />
  <img src="https://github.com/torbenziegler/Albums-REST-API/blob/main/Images/readme_2.jpg" width="250" />
</p>

## Client

- Jetpack Compose
- MVVM
- Dagger Hilt
- Coroutines
- Retrofit

## REST API

Ktor was used to create this simple REST API

- Content Negotiation
- Call Logging
- Kotlinx Serialization
- Routing
- Monitoring

### Endpoints

Possible available endpoints:

``` kotlin
/randomalbum // retrieve one random album
/albums // retrieve all albums
/albums/{name} // retrieve a specific album by its name
```

Sample response:

``` json
{
  "name": "Birds In The Trap Sing McKnight",
  "artist": "Travis Scott",
  "releaseYear": 2016,
  "imageUrl": "http://192.168.0.102:8100/album_covers/birds.jpg",
  "dominantColors": [
    "#242d3d",
    "#b97c78",
    "#595158",
    "#040407",
    "#93332a"
  ],
  "songs": [
    {
      "title": "the ends",
      "duration": "3:21"
    },
    {
      "title": "way back",
      "duration": "4:32"
    },
    {
      "title": "coordinate",
      "duration": "3:46"
    },
    {
      "title": "through the late night",
      "duration": "4:46"
    },
    {
      "title": "beibs in the trap",
      "duration": "3:33"
    },
    {
      "title": "sdp interlude",
      "duration": "3:11"
    },
    {
      "title": "sweet sweet",
      "duration": "3:42"
    },
    {
      "title": "outside",
      "duration": "2:56"
    },
    {
      "title": "goosebumps",
      "duration": "4:03"
    },
    {
      "title": "first take",
      "duration": "5:13"
    },
    {
      "title": "pick up the phone",
      "duration": "4:12"
    },
    {
      "title": "lose",
      "duration": "3:20"
    },
    {
      "title": "guidance",
      "duration": "3:27"
    },
    {
      "title": "wonderful",
      "duration": "3:36"
    }
  ]
}
```
