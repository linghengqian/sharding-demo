# For https://github.com/apache/shardingsphere/issues/25320

- Execute the following command on the new Ubuntu 22.04 instance to verify.
```shell
cd /tmp
sudo apt install unzip zip curl sed -y
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 17.0.8-ms
sdk use java 17.0.8-ms

cd ~
git clone git@github.com:linghengqian/sharding-demo.git
cd ./sharding-demo/
./mvnw clean test
```

- Log.
```shell
./mvnw clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< org.example:sharding-demo >----------------------
[INFO] Building sharding-demo 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ sharding-demo ---
[INFO] Deleting /home/linghengqian/TwinklingLiftWorks/git/public/sharding-demo/target
[INFO] 
[INFO] --- resources:3.2.0:resources (default-resources) @ sharding-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 3 resources
[INFO] 
[INFO] --- compiler:3.10.1:compile (default-compile) @ sharding-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/linghengqian/TwinklingLiftWorks/git/public/sharding-demo/target/classes
[INFO] 
[INFO] --- resources:3.2.0:testResources (default-testResources) @ sharding-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/sharding-demo/src/test/resources
[INFO] 
[INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ sharding-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/linghengqian/TwinklingLiftWorks/git/public/sharding-demo/target/test-classes
[INFO] 
[INFO] --- surefire:2.22.2:test (default-test) @ sharding-demo ---
[WARNING] Parameter 'localRepository' is deprecated core expression; Avoid use of ArtifactRepository type. If you need access to local repository, switch to '${repositorySystemSession}' expression and get LRM from it instead.
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.example.spring_demo.StartTest
00:31:46.150 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
00:31:46.160 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
00:31:46.205 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [org.example.spring_demo.StartTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
00:31:46.216 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [org.example.spring_demo.StartTest], using SpringBootContextLoader
00:31:46.221 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [org.example.spring_demo.StartTest]: class path resource [org/example/spring_demo/StartTest-context.xml] does not exist
00:31:46.222 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [org.example.spring_demo.StartTest]: class path resource [org/example/spring_demo/StartTestContext.groovy] does not exist
00:31:46.223 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [org.example.spring_demo.StartTest]: no resource found for suffixes {-context.xml, Context.groovy}.
00:31:46.224 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [org.example.spring_demo.StartTest]: StartTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
00:31:46.278 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [org.example.spring_demo.StartTest]
00:31:46.335 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/home/linghengqian/TwinklingLiftWorks/git/public/sharding-demo/target/classes/org/example/spring_demo/Start.class]
00:31:46.336 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration org.example.spring_demo.Start for test class org.example.spring_demo.StartTest
00:31:46.415 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [org.example.spring_demo.StartTest]: using defaults.
00:31:46.416 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
00:31:46.429 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@4c012563, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@14a50707, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@4d518b32, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@4bd31064, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@e3c0e40, org.springframework.test.context.support.DirtiesContextTestExecutionListener@329dbdbf, org.springframework.test.context.transaction.TransactionalTestExecutionListener@7354b8c5, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@20d7d6fb, org.springframework.test.context.event.EventPublishingTestExecutionListener@4ef782af, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@11d8ae8b, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@479cbee5, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@59e2d8e3, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@2b72cb8a, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@7f8a9499, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@5d43661b]
00:31:46.434 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@6b6776cb testClass = StartTest, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@1863d2fe testClass = StartTest, locations = '{}', classes = '{class org.example.spring_demo.Start}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@23348b5d, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6200f9cb, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@7530ad9c, org.springframework.boot.test.autoconfigure.actuate.metrics.MetricsExportContextCustomizerFactory$DisableMetricExportContextCustomizer@6a2f6f80, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@5c90e579, org.springframework.boot.test.context.SpringBootTestArgs@1, org.springframework.boot.test.context.SpringBootTestWebEnvironment@3e6fa38a], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.15)

2023-08-28 00:31:46.780  INFO 11254 --- [           main] org.example.spring_demo.StartTest        : Starting StartTest using Java 17.0.8 on DESKTOP-PNK8EKR with PID 11254 (started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/sharding-demo)
2023-08-28 00:31:46.783  INFO 11254 --- [           main] org.example.spring_demo.StartTest        : No active profile set, falling back to 1 default profile: "default"
2023-08-28 00:31:48.791  INFO 11254 --- [           main] org.example.spring_demo.StartTest        : Started StartTest in 2.322 seconds (JVM running for 3.464)
2023-08-28 00:31:49.163  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-08-28 00:31:49.456  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Starting...
2023-08-28 00:31:49.609  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Start completed.
2023-08-28 00:31:49.726  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Starting...
2023-08-28 00:31:49.750  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Start completed.
2023-08-28 00:31:49.751  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Starting...
2023-08-28 00:31:49.758  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Start completed.
2023-08-28 00:31:49.758  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-5 - Starting...
2023-08-28 00:31:49.770  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-5 - Start completed.
2023-08-28 00:31:49.770  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-6 - Starting...
2023-08-28 00:31:49.775  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-6 - Start completed.
2023-08-28 00:31:51.250  INFO 11254 --- [           main] com.zaxxer.hikari.pool.PoolBase          : HikariPool-1 - Driver does not support get/set network timeout for connections. (getNetworkTimeout)
2023-08-28 00:31:51.252  INFO 11254 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-08-28 00:31:52.651  INFO 11254 --- [           main] ShardingSphere-SQL                       : Logic SQL: SELECT * FROM `logic_db`.`member` WHERE `ID` = ? AND `CREATE_TIME` = ?
2023-08-28 00:31:52.651  INFO 11254 --- [           main] ShardingSphere-SQL                       : Actual SQL: member_slave ::: SELECT * FROM `member` WHERE `ID` = ? AND `CREATE_TIME` = ? ::: [1, 2023-04-26 11:21:26]
2023-08-28 00:31:52.672  INFO 11254 --- [           main] ShardingSphere-SQL                       : Logic SQL: SELECT * FROM `logic_db`.`info` WHERE `MEMBER_ID` = ?
2023-08-28 00:31:52.672  INFO 11254 --- [           main] ShardingSphere-SQL                       : Actual SQL: info_slave ::: SELECT * FROM `info` WHERE `MEMBER_ID` = ? ::: [1]
2023-08-28 00:31:52.904  INFO 11254 --- [           main] ShardingSphere-SQL                       : Logic SQL: SELECT * FROM `logic_db`.`member` WHERE CAST(`ID` AS SIGNED) = 1 AND CAST(`CREATE_TIME` AS DATETIME) = TIMESTAMP '2023-04-26 11:21:26'
2023-08-28 00:31:52.904  INFO 11254 --- [           main] ShardingSphere-SQL                       : Actual SQL: member_slave ::: SELECT * FROM `member` WHERE CAST(`ID` AS SIGNED) = 1 AND CAST(`CREATE_TIME` AS DATETIME) = TIMESTAMP '2023-04-26 11:21:26'
2023-08-28 00:31:52.910  INFO 11254 --- [           main] ShardingSphere-SQL                       : Logic SQL: SELECT * FROM `logic_db`.`info` WHERE CAST(`MEMBER_ID` AS SIGNED) = 1
2023-08-28 00:31:52.910  INFO 11254 --- [           main] ShardingSphere-SQL                       : Actual SQL: info_slave ::: SELECT * FROM `info` WHERE CAST(`MEMBER_ID` AS SIGNED) = 1
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.859 s - in org.example.spring_demo.StartTest
2023-08-28 00:31:52.973  INFO 11254 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2023-08-28 00:31:52.984  INFO 11254 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  13.085 s
[INFO] Finished at: 2023-08-28T00:31:54+08:00
[INFO] ------------------------------------------------------------------------
```