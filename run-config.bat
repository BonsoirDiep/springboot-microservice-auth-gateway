@ECHO OFF
set PJDIR=%cd%
cd config-service/target && start java -jar config-0.0.1-SNAPSHOT.jar
cd ../../
