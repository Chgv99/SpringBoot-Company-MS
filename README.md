<h1 align="center">
  Company Project
</h1>

<p align="center">
  <b>A Spring Boot project</b><br><br>
</p>

This repository contains one of the many microservices developed for the "Company project". This is the result of [EmbarkX's Spring Boot Course "Monolithic to Microservices"](https://youtu.be/BLlEgtp2_i8?si=eKc6eWA-jvB6mcfw).

The project is a CRUD for companies, jobs and reviews. These three entities are related with each other, for example: A user can post a review against a company, and a job may be posted for a company.

To run the project you may clone this repository and execute `docker compose up` in the root folder (you need docker installed in your machine). This will deploy the containers needed for the project to run.

<!-- TODO: Continue with the endpoints available (I need to check that they work first, because I haven't tested them yet since I dockerize every microservice) -->
