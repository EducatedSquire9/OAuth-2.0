This repository contains a Spring Boot application created for the purpose of having authorization done by OAuth 2.0.
From the main branch the zip file can be downloaded to your PC and be opened in Eclipse IDE (The version used for creating this application is Eclipse 2020-03).
When the zip file downloaded from main brach is extracted, there will be 3 directories, namely '.metadata', 'client', and 'server'.
Once the directories are extracted, the Java and Maven dependencies have to be installed and calibrated appropriately.
After all the dependencies are installed, the 'client' and 'server' projects can be run.
When both 'client' and 'server' are running, in a browser 'localhost:8082/ui/' has to be executed, in order to get the index page of the application up and running.
From there the link has to be clicked.
The OAuth 2.0 secured page will be loaded (server side), which is running in port 8081, where the username and password 'Chamith' and 'chamith' respectively.
Only the authorized users are able to log in.
