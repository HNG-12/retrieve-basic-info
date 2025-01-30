# Public API to Retrieve Basic Information
This is a public API project to retrieve basic information and return it as a JSON object. The API is deployed on Heroku.

## Tools Used
- Java 23
- Spring Boot (for creating the API)
- Maven (for dependency management)
- Heroku (for deployment)
- Postman (for testing the API)
- Git (for version control)
- IntelliJ IDEA (as the IDE)
- GitHub (for storing the code)
- Markdown (for writing the README file)

## API Endpoints
```http
GET /api/basicinfo
```
This endpoint returns the basic information as a JSON object.

## Installation
1. Clone the repository
```bash
git clone https://github.com/HNG-12/retrieve-basic-info
```
2. Change into the project directory
```bash
cd retrieve-basic-info
```
3. Run the project
```bash
mvn spring-boot:run
```
4. Open Postman and test the API
```http
GET http://localhost:8080/api/basicinfo
```

## Response
The response is a JSON object with the following structure:
```json
{
  "github_url": "https://github.com/HNG-12/hng-task-0-retrieve-basic-information",
  "email": "aniebietafia@gmail.com",
  "current_datetime": "2025-01-30T11:03:28.7455584"
}
```

## Deployment
The API is deployed on Heroku. You can access it using the following URL:
```http
https://hng-stage-0-39627ad62da6.herokuapp.com/api/basicinfo
```
* View the public API: [Live URL](https://hng-stage-0-39627ad62da6.herokuapp.com/api/basicinfo)