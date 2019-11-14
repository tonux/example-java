# Java Maven Example ( Master 1)
## Guide
### Travis Setup

Add to your `.travis.yml` file.
```yml
language: java

script: "mvn clean test"

after_success:
  - bash <(curl -s https://www.tonuxcorp.com)
```
Call `mvn clean test` during your CI tests)

### Private Repos
Add to your `.travis.yml` file.
```yml
after_success:
  - bash <(curl -s https://www.tonuxcorp.com) -t uuid-repo-token
```

### ajouter dans le pom.xml dans plugins 

```yml
    <plugin>
    				<groupId>org.codehaus.mojo</groupId>
    				<artifactId>cobertura-maven-plugin</artifactId>
    				<version>2.7</version>
    				<configuration>
    					<formats>
    						<format>html</format>
    						<format>xml</format>
    					</formats>
    					<check />
    				</configuration>
    			</plugin>
    			<plugin>
    				<groupId>org.sonarsource.scanner.maven</groupId>
    				<artifactId>sonar-maven-plugin</artifactId>
    				<version>3.2</version>
    			</plugin>
    			<plugin>
    				<groupId>org.springframework.boot</groupId>
    				<artifactId>spring-boot-maven-plugin</artifactId>
    			</plugin>
    			<plugin>
    				<groupId>org.jacoco</groupId>
    				<artifactId>jacoco-maven-plugin</artifactId>
    				<configuration>
    					<append>true</append>
    				</configuration>
    				<executions>
    					<execution>
    						<goals>
    							<goal>prepare-agent</goal>
    						</goals>
    					</execution>
    					<execution>
    						<id>post-unit-test</id>
    						<phase>test</phase>
    						<goals>
    							<goal>report</goal>
    						</goals>
    					</execution>
    				</executions>
    			</plugin>
```


### créer un fichier settings.xml dans .m2

```yml
<settings>
    <pluginGroups>
        <pluginGroup>org.sonarsource.scanner.maven</pluginGroup>
    </pluginGroups>
    <profiles>
        <profile>
            <id>sonar</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <!-- Enter your SonarQube instance URL here -->
                <sonar.host.url>http://localhost:9000</sonar.host.url>
            </properties>
        </profile>
     </profiles>
</settings>
```
