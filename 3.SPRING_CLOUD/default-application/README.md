	[api-gateway:5000]
	>http://localhost:5000/default-application/hello  [See LoadBalance in Action]
	>http://localhost:5000/hello
	>http://localhost:5000/default-application/service-instances/default-application
	
	[default-application:9000,9001]
	>http://localhost:9000/
	>http://localhost:9000/service-instances/default-application
	
	feign client
	routes
	admin
	circuuit breaker(Resilience forj ==> hysterix)
	