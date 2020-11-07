# harbor-client-java ![CI](https://github.com/hinyinlam-pivotal/harbor-client-java/workflows/CI/badge.svg)
Java Client for Harbor open source trusted cloud native registry  https://github.com/goharbor/harbor

# How to mvn install to your local repo?
Go to release page: https://github.com/hinyinlam-pivotal/harbor-client-java/releases

Download the `client-java.jar`

`unzip client-java.jar`

`mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile=client-java-2.0.jar -DpomFile=META-INF/maven/io.goharbor/client-java/pom.xml`

#Example
Available in `example` module
