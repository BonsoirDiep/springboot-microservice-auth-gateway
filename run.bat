@ECHO OFF
cd auth-service/target && start java -jar auth-service-0.0.1-SNAPSHOT.jar
cd ../../product-service/target && start java -jar product-service-0.0.1-SNAPSHOT.jar
@REM cd ../../order-service/target && start java -jar order-service-0.0.1-SNAPSHOT.jar
@REM cd ../../product-stock-service/target && start java -jar product-stock-service-0.0.1-SNAPSHOT.jar
cd ../../
