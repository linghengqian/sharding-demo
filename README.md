# For https://github.com/apache/shardingsphere/issues/25320

- Execute the following command on the new Ubuntu 22.04 instance to verify.
```shell
cd /tmp
sudo apt install unzip zip curl sed -y
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 17.0.6-ms
sdk use java 17.0.6-ms

cd ~
git clone git@github.com:linghengqian/sharding-demo.git
cd ./sharding-demo/
./mvnw clean test
```

- Log.
```shell
[ERROR] Tests run: 2, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 6.341 s <<< FAILURE! - in org.example.spring_demo.StartTest
[ERROR] searchByMap  Time elapsed: 3.615 s  <<< ERROR!
java.sql.SQLException: exception while executing query: class java.lang.String cannot be cast to class java.lang.Long (java.lang.String and java.lang.Long are in module java.base of loader 'bootstrap')
        at org.example.spring_demo.StartTest.searchByMap(StartTest.java:51)
Caused by: java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Long (java.lang.String and java.lang.Long are in module java.base of loader 'bootstrap')
        at org.example.spring_demo.StartTest.searchByMap(StartTest.java:51)

2023-05-09 00:25:48.283  INFO 20062 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2023-05-09 00:25:48.285  INFO 20062 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   StartTest.searchByMap:51 » SQL exception while executing query: class java.lan...
[INFO] 
[ERROR] Tests run: 2, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  12.038 s
[INFO] Finished at: 2023-05-09T00:25:49+08:00
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