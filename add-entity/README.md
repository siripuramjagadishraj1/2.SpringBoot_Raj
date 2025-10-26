Hibernate:
----------
	Various types of Mapping:
		1. Simple Mapping
		2. Collection Mapping
		3. Inheritance Mapping
			a. Table per sub class
			b. Table per class
			c. Table per Concrete class
		4. Association Mapping
			a. One to One Mapping
			b. One to Many Mapping
			c. Many to Many Mapping
		5. Other Mapping
	
	Hibernate has support for Various Querrry Languages:
		a. HQL(*)
		b. QBC(*)
		c. QBE
		d. Native SQL
		e. Named SQL
		
	Hibernate Supports two ways to manage connections:
		a. DriverManager connections
		b. DataSource Connections(*)
	
	Hibernate Supports two ways to Manage Transactions:
		a. JDBC Transactions.
		b. JTA Transactions.
		
	Hibernate has Caching Mechanism

REST API:
--------
	curl --location --request PUT 'localhost:5000/add/querryFromDB/querryPathVariable?param1=param1&param2=param2' \
	--header 'Content-Type: application/json' \
	--data '{
	    "cost": 100,
	    "name": "Apple"
	}'