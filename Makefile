.PHONY: all $(MAKECMDGOALS)

RUN_DOCKER = docker run -it --rm -v `pwd`:/usr/src/mymaven -w /usr/src/mymaven -v maven-repo:/root/.m2 maven:3.6.3-openjdk-11
MVN_DOCKER = $(RUN_DOCKER) mvn
JAVA_DOCKER = $(RUN_DOCKER) java

generate:
	$(MVN_DOCKER) archetype:generate -DgroupId=net.unir.devops -DartifactId=unir-maven -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

compile:
	$(MVN_DOCKER) compile

package:
	$(MVN_DOCKER) package

test:
	$(MVN_DOCKER) test

run:
	$(JAVA_DOCKER) -cp target/unir-maven-1.0-SNAPSHOT.jar net.unir.devops.App
	