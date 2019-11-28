# Jahia Kotlin Simple

:rotating_light: Warning: this component is a proof of concept. :rotating_light:

This component is simple example of writing kotlin inside a Java project.

## Build and deploy
Simply use the following command to build the project and deploy to Jahia

```
mvn clean install jahia:deploy -P jahia-profile
```

## What do you need to write Kotlin?
Adding a Kotlin file to an existing Java project is a fairly simple process, all you have to do is add to your POM.xml 
file the following elements

- For the properties section:
```
<kotlin.version>1.3.61</kotlin.version>
```

- For the dependencies section:

```
<dependency>
    <groupId>org.jetbrains.kotlin</groupId>
    <artifactId>kotlin-stdlib-jdk8</artifactId>
    <version>${kotlin.version}</version>
</dependency>
<dependency>
    <groupId>org.jetbrains.kotlin</groupId>
    <artifactId>kotlin-test-junit</artifactId>
    <version>${kotlin.version}</version>
    <scope>test</scope>
</dependency>
```

- For the plugins section:
```
<plugin>
    <groupId>org.jetbrains.kotlin</groupId>
    <artifactId>kotlin-maven-plugin</artifactId>
    <version>${kotlin.version}</version>
    <executions>
        <execution>
            <id>compile</id>
            <phase>compile</phase>
            <goals>
                <goal>compile</goal>
            </goals>
        </execution>
        <execution>
            <id>test-compile</id>
            <phase>test-compile</phase>
            <goals>
                <goal>test-compile</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <jvmTarget>1.8</jvmTarget>
    </configuration>
</plugin>
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <executions>
        <execution>
            <id>compile</id>
            <phase>compile</phase>
            <goals>
                <goal>compile</goal>
            </goals>
        </execution>
        <execution>
            <id>testCompile</id>
            <phase>test-compile</phase>
            <goals>
                <goal>testCompile</goal>
            </goals>
        </execution>
    </executions>
</plugin>

```

Now you can have fun writing kotlin code in your project :D
