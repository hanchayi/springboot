# spring boot

## 环境

``` bash
Java -version
#openjdk version "17.0.3" 2022-04-19
#OpenJDK Runtime Environment Temurin-17.0.3+7 (build 17.0.3+7)
#OpenJDK 64-Bit Server VM Temurin-17.0.3+7 (build 17.0.3+7, mixed mode, sharing)
mvn -v
#Apache Maven 3.8.6 (84538c9988a25aec085021c365c560670ad80f63)
#Maven home: C:\Program Files\Eclipse Adoptium\apache-maven-3.8.6
#Java version: 17.0.3, vendor: Eclipse Adoptium, runtime: C:\Program Files\Eclipse #Adoptium\jdk-17.0.3.7-hotspot
#Default locale: zh_CN, platform encoding: GBK
#OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```

## 运行

``` bash
# mac/linux
./mvnw spring-boot:run
# windos
.\mvnw spring-boot:run
```

运行成功后，访问即可http://localhost:8080/hello

## 打包

``` bash
mvn package
# mac/linux
java -jar ./target/demo-0.0.1.jar
# windos
java -jar .\target\demo-0.0.1.jar
```

运行成功后，访问即可http://localhost:8080/hello
