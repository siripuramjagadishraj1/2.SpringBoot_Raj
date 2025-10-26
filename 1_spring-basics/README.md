Setup DB:
=========
	https://www.postgresonline.com/article_pfriendly/172.html
	1. Download portable postgresql, unzip & create a data folder.
	2. prepare bat & run.
	@ECHO ON
	REM The script sets environment variables helpful for PostgreSQL
	@SET PATH="%~dp0\bin";%PATH%
	@SET PGDATA=%~dp0\data
	@SET PGDATABASE=postgres
	@SET PGUSER=postgres
	@SET PGPORT=5439
	@SET PGLOCALEDIR=%~dp0\share\locale
	REM "%~dp0\bin\initdb" -U postgres -A trust
	"%~dp0\bin\pg_ctl" -D "%~dp0/data" -l logfile start
	ECHO "Click enter to stop"
	pause
	"%~dp0\bin\pg_ctl" -D "%~dp0/data" stop
	3. Scripts
	 create database GE_RENEWABLES;
	 create table country(id serial, name varchar(100));
	 insert into country (id, name)values (1,'Japan'),(2,'Indian');
	4. NOTE: >mvn clean install -Dmaven.test.skip=true 
	 //will give error due to multiple main() found. due to maven-plugin

Spring Basics:
==============
	1. XML Configuration:(spring.xml)
		a. Dependency injection (Setter, Constructor)
		b. Wiring(3) (NAME,TYPE,CONSTUCTOR)
		c. Bean Scopes(5) (singleton,prototype,request,session,global-session)
		d. Bean LifeCycle Methods, Annotations, Interfaces, Hooks (Please check Apple.java)
			* BeanNameAware, //-->setBeanName
			* BeanFactoryAware, //-->setBeanFactory
			* BeanPostProcessor, //-->postProcessBeforeInitialization
			* InitializingBean, //-->afterPropertiesSet
			* DisposableBean //-->destroy
			* @PostConstruct
			* @PreDestroy
			(https://howtodoinjava.com/spring-core/spring-bean-life-cycle)
		e. Enable @Autowiring <context:annotation-config/>
			@Qualifier(value="ambigousBean"), @Resource(name="amibigousBean")
		f. Enable Properties <context:property-placeholder location="classpath:application.properties"/>
			@Value("${server.port}") private String testEnv;
		g. Import Spring resources <import resource="spring2.xml"/>
		h. DriverManagerDataSource, HikariDataSource, JdbcTemplate
	
	2. Zero-XML Configuration:(SpringBeanConfiguration.java)
		a. Dependency injection (Setter, Constructor)
		b. Wiring - No Importance
		c. @Configuration, @Autowired, @Bean, @Scope (SpringBeanConfiguration.java)
		d. Bean LifeCycle Methods, as in XML.
		e. Auto-wiring enabled by default.
		f. @PropertySource("classpath:application.properties")
			@Value("${server.port}") private String testEnv;
			@Autowired private Environment env;
		g. @Import(value= {Apple.class})
		h. DriverManagerDataSource, HikariDataSource, JdbcTemplate
		
	3. Enable/Disable Log back Logging:
		a. logback-test.xml
	4. Spring+Hibernate with EntityManager(New way) vs Session(Old Way).
	5. Spring+MyBatis (TODO)
	6. Spring test cases mocking..(TODO)

## INFO
1. Types of <a href="https://www.javatpoint.com/spring-JdbcTemplate-tutorial">JDBCTemplate</a> (JdbcTemplate,SimpleJdbcTemplate,NamedParameterJdbcTemplate,SimpleJdbcInsert ,SimpleJdbcInsert )
	
