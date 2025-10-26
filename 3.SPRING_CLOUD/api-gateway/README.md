[api-gateway:5000]
--------------
	>http://localhost:5000/default-application/hello  [See LoadBalance in Action]
	>http://localhost:5000/hello
	>http://localhost:5000/default-application/service-instances/default-application

[default-application:9000,9001]
-------------------------------
	>http://localhost:9000/
	>http://localhost:9000/service-instances/default-application
	
[eureka:8761]
-------------
	>http://localhost:8761/
	
[admin:8080]
------------
	>http://localhost:8080/wallboard