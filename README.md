### Step by step [VSCODE, WINDOW 10, CMDER(https://cmder.app/)]
```bash
# set PJDIR=%cd%
mvnw clean install
run-config.bat
run-gateway.bat
run.bat
```

### Docker
[Docker mode](https://github.com/BonsoirDiep/springboot-microservice-auth-gateway/tree/short-and-docker)

### Diagram
<img src="micro.drawio.png">

### Ref from:
https://github.com/aenesgur/springboot-microservice-boilerplate/blob/master/README.md
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