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
$ ./mvnw clean test
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
00:07:20.942 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
00:07:20.959 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
00:07:21.028 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [org.example.spring_demo.StartTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
00:07:21.044 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [org.example.spring_demo.StartTest], using SpringBootContextLoader
00:07:21.048 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [org.example.spring_demo.StartTest]: class path resource [org/example/spring_demo/StartTest-context.xml] does not exist
00:07:21.050 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [org.example.spring_demo.StartTest]: class path resource [org/example/spring_demo/StartTestContext.groovy] does not exist
00:07:21.052 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [org.example.spring_demo.StartTest]: no resource found for suffixes {-context.xml, Context.groovy}.
00:07:21.053 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [org.example.spring_demo.StartTest]: StartTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
00:07:21.104 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [org.example.spring_demo.StartTest]
00:07:21.165 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/home/linghengqian/TwinklingLiftWorks/git/public/sharding-demo/target/classes/org/example/spring_demo/Start.class]
00:07:21.167 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration org.example.spring_demo.Start for test class org.example.spring_demo.StartTest
00:07:21.281 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [org.example.spring_demo.StartTest]: using defaults.
00:07:21.282 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
00:07:21.295 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@45ac5f9b, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@135606db, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@518caac3, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@68034211, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@4f74980d, org.springframework.test.context.support.DirtiesContextTestExecutionListener@6c372fe6, org.springframework.test.context.transaction.TransactionalTestExecutionListener@58594a11, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@2a3888c1, org.springframework.test.context.event.EventPublishingTestExecutionListener@4167d97b, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@14fa86ae, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@6e15fe2, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@68f1b17f, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@1722011b, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@57ad2aa7, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@5b3f61ff]
00:07:21.298 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@5c669da8 testClass = StartTest, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@31920ade testClass = StartTest, locations = '{}', classes = '{class org.example.spring_demo.Start}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@762ef0ea, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6db9f5a4, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@68567e20, org.springframework.boot.test.autoconfigure.actuate.metrics.MetricsExportContextCustomizerFactory$DisableMetricExportContextCustomizer@fd07cbb, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@69fb6037, org.springframework.boot.test.context.SpringBootTestArgs@1, org.springframework.boot.test.context.SpringBootTestWebEnvironment@4bec1f0c], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.15)

2023-08-28 00:07:21.636  INFO 6906 --- [           main] org.example.spring_demo.StartTest        : Starting StartTest using Java 17.0.8 on DESKTOP-PNK8EKR with PID 6906 (started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/sharding-demo)
2023-08-28 00:07:21.639  INFO 6906 --- [           main] org.example.spring_demo.StartTest        : No active profile set, falling back to 1 default profile: "default"
2023-08-28 00:07:23.533  INFO 6906 --- [           main] org.example.spring_demo.StartTest        : Started StartTest in 2.19 seconds (JVM running for 3.714)
2023-08-28 00:07:23.913  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-08-28 00:07:24.213  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Starting...
2023-08-28 00:07:24.361  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Start completed.
2023-08-28 00:07:24.460  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Starting...
2023-08-28 00:07:24.495  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Start completed.
2023-08-28 00:07:24.495  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Starting...
2023-08-28 00:07:24.506  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Start completed.
2023-08-28 00:07:24.506  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-5 - Starting...
2023-08-28 00:07:24.512  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-5 - Start completed.
2023-08-28 00:07:24.513  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-6 - Starting...
2023-08-28 00:07:24.520  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-6 - Start completed.
2023-08-28 00:07:26.390  INFO 6906 --- [           main] com.zaxxer.hikari.pool.PoolBase          : HikariPool-1 - Driver does not support get/set network timeout for connections. (getNetworkTimeout)
2023-08-28 00:07:26.392  INFO 6906 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
line 1:39 token recognition error at: 'T'
line 1:40 token recognition error at: 'IM'
line 1:43 token recognition error at: 'ST'
line 1:42 mismatched input 'E' expecting {VARCHAR_ZH, INTEGER, BIGINT, VARCHAR, DATE}
line 1:46 token recognition error at: 'M'
line 1:47 token recognition error at: 'P'
line 1:61 mismatched input '11' expecting ')'
[ERROR] Tests run: 2, Failures: 2, Errors: 0, Skipped: 0, Time elapsed: 6.981 s <<< FAILURE! - in org.example.spring_demo.StartTest
[ERROR] searchByMap  Time elapsed: 4.149 s  <<< FAILURE!
java.lang.AssertionError: 
type mismatch:
ref:
JavaType(class java.lang.String)
input:
JavaType(class java.sql.Timestamp)
        at org.example.spring_demo.StartTest.searchByMap(StartTest.java:51)

[ERROR] searchByMap1  Time elapsed: 0.11 s  <<< FAILURE!
java.lang.AssertionError: 
type mismatch:
ref:
JavaType(class java.lang.String)
input:
JavaType(class java.sql.Timestamp)
        at org.example.spring_demo.StartTest.searchByMap1(StartTest.java:32)

2023-08-28 00:07:27.872  INFO 6906 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2023-08-28 00:07:27.876  INFO 6906 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   StartTest.searchByMap:51 type mismatch:
ref:
JavaType(class java.lang.String)
input:
JavaType(class java.sql.Timestamp)
[ERROR]   StartTest.searchByMap1:32 type mismatch:
ref:
JavaType(class java.lang.String)
input:
JavaType(class java.sql.Timestamp)
[INFO] 
[ERROR] Tests run: 2, Failures: 2, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  12.673 s
[INFO] Finished at: 2023-08-28T00:07:29+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.2:test (default-test) on project sharding-demo: There are test failures.
[ERROR] 
[ERROR] Please refer to /home/linghengqian/TwinklingLiftWorks/git/public/sharding-demo/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```