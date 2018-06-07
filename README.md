# SpringBootRESTPOC

This is a sample Spring Boot project. Spring Boot has been used to expose REST Endpoints. This application has a connectivity to mysql database.

This project uses following technologies:

Spring Boot v1.5.9
Maven
MySql

# Deployment

 One can simply import this project into Spring Tool Suite IDE and run it. Make sure it has changes according to your database details.
 
# MySql Query

I have used MySql as Database. One can choose anything they want. Below is the simple MySql query which is used in this project.

CREATE TABLE regions ( id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, region_id INT(3) , country_names varchar(25) not null )

ALTER TABLE regions ADD region_names varchar(25) not null;

# Author
https://github.com/KAILASH08
