@ECHO OFF
cd discovery-server/target && start java -jar discovery-server-0.0.1-SNAPSHOT.jar
cd ../../api-gateway/target && start java -jar api-gateway-0.0.1-SNAPSHOT.jar
cd ../../
