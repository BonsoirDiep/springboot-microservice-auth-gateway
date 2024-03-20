@ECHO OFF
cd discovery-server/target && start java -jar discovery-server-0.0.1-SNAPSHOT.jar
cd ../../api-gateway/target && start java -jar api-gateway-0.0.1-SNAPSHOT.jar
cd ../../auth-service/target && start java -jar auth-service-0.0.1-SNAPSHOT.jar
cd ../../product-service/target && start java -jar product-service-0.0.1-SNAPSHOT.jar
@REM cd ../../order-service/target && start java -jar order-service-0.0.1-SNAPSHOT.jar
@REM cd ../../product-stock-service/target && start java -jar product-stock-service-0.0.1-SNAPSHOT.jar
cd ../../
