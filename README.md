# JVM Memory Test (POC)

> Connect to JMX with https://visualvm.github.io/

## [Java Buildpack Memory Calculator](https://github.com/cloudfoundry/java-buildpack-memory-calculator)
```
go run .\main.go --loaded-class-count=750 --thread-count=100 --total-memory=1024M --jvm-options "-Xss1024k"
-XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=17919K -XX:ReservedCodeCacheSize=240M -Xmx672256K

go run .\main.go --loaded-class-count=750 --thread-count=100 --total-memory=512M
-XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=17919K -XX:ReservedCodeCacheSize=240M -Xss1M -Xmx147968K

go run .\main.go --loaded-class-count=7500 --thread-count=200 --total-memory=2G
-XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=56152K -XX:ReservedCodeCacheSize=240M -Xss1M -Xmx1580199K
```

## JVM arguments
-XX:-UseCompressedOops (default Enabled)
-XX:+PrintCodeCache (default Disabled)
-Xmx256M (Max Memory)
-XX:InitiatingHeapOccupancyPercent=50

## Run
Run `JvmMemoryTestApplication.java`

Go to `visualvm`

Use swagger to add/remove/clear `http://localhost:8080/swagger-ui/index.html`