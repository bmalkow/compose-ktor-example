# Kotlin Compose Multiplatform with Ktor Backend

This is simple application using [Compose Multiplatform][compose-mpp] for frontend and [Ktor][ktor] as backend.

The main goal of the project was to obtain a simple web application served by Ktor and built with a single command.

## Structure

* `shared` contains code shared among frontend and backend;
* `web` contains simple web application wrote in Compose Multiplatform;
* `backend` contains Ktor server with REST API.

## Running application

To run sample execute:

```
./gradlew run
```

then go with your browser to http://127.0.0.1:8080/.

## Build distribution package

To create distribution package, execute:

```
./gradlew distZip
```

It builds frontend, backend and packs everything together.
File will be stored in `./backend/build/distributions/backend.zip`


[compose-mpp]: https://www.jetbrains.com/lp/compose-mpp/

[ktor]: https://ktor.io

