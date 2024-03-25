@ECHO OFF
cd auth-service/target && start java -jar auth-service-0.0.1-SNAPSHOT.jar
cd ../../product-service/target && start java -jar product-service-0.0.1-SNAPSHOT.jar
cd ../../
