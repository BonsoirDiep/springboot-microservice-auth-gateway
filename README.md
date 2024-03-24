### Step by step [DOCKER]
```bash
mvnw clean install
docker compose up -d
```


### Diagram
<img src="micro.drawio.png">

### Ref from:
https://github.com/aenesgur/springboot-microservice-boilerplate

https://github.com/rajithd/spring-cloud-security-jwt

### Curl
```bash
curl --location 'http://localhost:8080/auth/register' \
--header 'Content-Type: application/json' \
--data-raw '{
    "email": "a@a.com",
    "password": "password",
    "name": "name"
}'

curl --location 'http://localhost:8080/api/products' \
--header 'Authorization: Bearer {{TOKEN}}'

curl --location 'http://localhost:8080/auth/infor' \
--header 'Authorization: Bearer {{TOKEN}}'

```