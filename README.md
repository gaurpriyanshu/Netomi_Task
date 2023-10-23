# Netomi_Task

# Spring Boot Petstore Application with MongoDB (Atlas) Integration

Welcome to the Spring Boot Petstore Application project! This README file will guide you through the setup, usage, and deployment of this project. This project is a simple CRUD application for managing a pet store, with MongoDB (Atlas) as the database.

## Table of Contents
1. Prerequisites
2. Project Structure
3. Getting Started
    - MongoDB Atlas Setup
    - Running the Application Locally
4. Usage
    - API Endpoints
5. Deployment
6. Contributing

1. Prerequisites

Before you get started, make sure you have the following tools and services installed and configured:

- Java Development Kit (JDK) 8 or later
- Maven
- MongoDB Atlas account and a database created
- GitHub account (for version control)

2. Project Structure

The project structure follows the standard Maven Spring Boot application layout. Here are some key directories and files:

- `src/` - The source code of the Spring Boot application.
- `src/main/resources` - Configuration files and application.properties.
- `pom.xml` - Maven configuration file.
- `README.md` - This file.

3. Getting Started

3.1 MongoDB Atlas Setup

A. [Sign up](https://www.mongodb.com/cloud/atlas/register) for a MongoDB Atlas account if you don't have one already.

B. Create a new cluster in MongoDB Atlas and configure your network access to allow your application's IP address.

C. Create a database and note down the connection string provided. You'll need this in the application's configuration.

3.2 Running the Application Locally

A. Clone this GitHub repository to your local machine.

   ```bash
   git clone https://github.com/yourusername/spring-boot-petstore.git
   ```

B. Open the project in your preferred IDE or use a text editor.

C. Navigate to the `src/main/resources/application.properties` file and configure your MongoDB Atlas connection string:

   ```application.properties
   spring.data.mongodb.uri=mongodb+srv://your-connection-string-here
   ```

D. Build and run the Spring Boot application using Maven. In the project directory, run:

   ```bash
   mvn spring-boot:run
   ```

E. The application will start on `http://localhost:8080`.

4. Usage

4.1 API Endpoints

The following RESTful API endpoints are available for managing the Petstore:

- `GET pets/all` - Get a list of all pets.
- `GET pets/{id}` - Get a pet by ID.
- `POST pets/insert` - Create a new pet.
- `PUT pets/update/{id}` - Update a pet by ID.
- `DELETE pets/delete/{id}` - Delete a pet by ID.

Example API usage:

- Create a pet:
  ```

  // http://localhost:8080/pets/insert
  POST pets/insert
  {
    "id": 2,
    "name": "Bullu",
    "photoUrl": "www.bullu.com",
    "category": "German Shephard",
    "status": "Not available"
}
  ```

- Get all pets:
  ```
  GET /pets/all
  ```

- Update a pet:
  ```
  PUT /pets/1
  {
    "name": "Fido",
    "species": "Dog",
    "age": 3
  }
  ```

- Delete a pet:
  ```
  DELETE /pets/1
  ```

## Deployment

To deploy this Spring Boot application to a production environment, follow these steps:

A. Build the application using Maven:

   ```bash
   mvn clean package
   ```

B. Copy the generated JAR file (found in the `target/` directory) to your server.

C. Configure the application properties with your production MongoDB Atlas connection string.

D. Run the JAR file on your server:

   ```bash
   java -jar Netomi.jar
   ```

E. Set up a reverse proxy (e.g., Nginx or Apache) to route incoming HTTP traffic to your application.

F. Secure your application using HTTPS and configure your server's firewall rules as needed.

6. Contributing

We welcome contributions to this project. If you find a bug, have a feature request, or want to contribute code, please create an issue or submit a pull request on GitHub.
