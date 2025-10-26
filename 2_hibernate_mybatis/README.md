Hibernate & MyBatis Without Spring:
===================================
	1. Hibernate: (Main Program)
	   a. XML Configuration.
	   b. Annotation 
	
	2. MyBatis:   (Main Program)
	   a. XML configuratoin.
	   b. Annotation (TODO)
	   b. logging in MyBatis (Log4j,Slf4j)
	   
	3. Pending Stuff:[OLD Learnings]
		a. Hibernate Mapping One-to-one, Many-to-many etc..
		b. Hibernate UseCases. select, inser and different types of querries.
		c. MyBatis Annotation configuration.
	
	4. NOTE: >mvn clean install -Dmaven.test.skip=true 
	 //will give error due to multiple main() found. due to maven-plugin

DB Script:
=========
	create table student(sid serial, sname varchar(100), email varchar(100));