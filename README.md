Gradle and Maven
Maven and Gradle are both Java development and building tools for managing dependencies, compiling code, packaging and automating workflows.

----------

Why use build tools 

- To automate repetitive tasks and processes compiling, testing, packaging.
- To manage project dependencies.
- To standardize project structures.

Maven and Gradle do many of the same things but with quite different approaches.

Python Equivalents

- Python has no direct equivalence in terms of build tooling however there are tools that python uses to build and distribute packages.
1. `pip` - package installer
2. `setuptools` and `build` - standard tools for building and distributing python packages
3. `venv` - for isolating python environments ensuring that dependencies for different projects don’t cause conflicts.
4. `invoke` and `nox` - task runners that automate project processes like testing, linting and building.

C# Equivalents

1. `Nuget` - Package manager for .NET
2. `MS Build` - similar to Maven\Gradle’s build automation and project lifecycle management. also has Cake Build and Nuke Build.

Why Java needs such tooling
Python might have similar tools used in its development cycle, but they are not quite direct equivalents to Gradle and Maven as much as C# tools are. Both Java and C# being a strongly typed and compiled languages necessitates such tools. For Java in particular which can often have complex project structures makes tools like Gradle and Maven are needed to standardize the way software packages are pushed from development to production in a seamless way.

Core Idea Breakdown

| Tooling           | Maven                           | Gradle                                  |
| ----------------- | ------------------------------- | --------------------------------------- |
| Design Philosophy | “Convention over configuration” | “Flexibility over conventions”          |
| Configuration     | Using Declarative (XML)         | Programmatic style: (Groovy/Kotlin DSL) |
| Performance       | Slower (full rebuilds)          | Faster (incremental builds)             |
| Extensibility     | Limited (plugins only)          | High (custom tasks/scripts)             |

Project Setups

Maven Typical Layout


    project/
    ├── src/
    │   ├── main/
    │   │   ├── java/       # Production code
    │   │   └── resources/  # Config files
    │   └── test/
    │       ├── java/       # Test code
    │       └── resources/  # Test configs
    └── pom.xml             # Project config

Gradle Typical Layout


    project/
    ├── src/
    │   ├── main/
    │   │   ├── java/       # Production code
    │   │   └── resources/  # Config files
    │   └── test/
    │       ├── java/       # Test code
    │       └── resources/  # Test configs
    └── build.gradle        # Build script

Common Commands

| Action                                                                  | Maven                 | Gradle                |
| ----------------------------------------------------------------------- | --------------------- | --------------------- |
| Clean build - Deleting previously generated files from previous builds. | `mvn clean install`   | `gradle clean build`  |
| Run tests                                                               | `mvn test`            | `gradle test`         |
| Starting Spring Boot                                                    | `mvn spring-boot:run` | `gradle bootRun`      |
| Dependency tree                                                         | `mvn dependency:tree` | `gradle dependencies` |
| Custom task execution                                                   | `mvn exec:exec`       | `gradle myTask`       |


Maven

- A project management and comprehension tool, it manages the entire lifecycle of a software project
- Build lifecycle, conventions, and dependency management.
- Key Features:
1. POM (Project Object Model) XML based file structure.
2. Dependency management and repositories.
3. Plugins and goals.
4. “Convention over configuration” - strict standards, less flexibility.
5. Cycles include: clean, compile, test, package, install
6. Makes use of coordinates to manage dependencies. (groupId, artifactId, version)
7. Makes Use of a variety of plugins to extend functionality. e.g. maven-surefire-plugin for testing
8. Best suited for large enterprise projects where standardization is particularly useful.

Gradle

- An open-source build automation tool used for multi-language software development.
- Used for Java, Android, and Kotlin projects.
- Used by mobile development tools like React-Native and Flutter.
- Automates tasks like compilation, packaging, testing, and deployment

Key Features:

1. Flexibility and performance, and
2. A Groovy/DSL-based configuration.
3. Build scripts (build.gradle).
4. Dependency management and repositories.
5. Custom tasks and plugins.

Maven and Gradle Compared:

- Performance: Gradle’s incremental builds vs. Maven’s full builds.
- Flexibility: Gradle’s scripting vs. Maven’s XML configuration.
- Community and ecosystem.

When to Use Which

- Maven: Convention over configuration, simpler projects.
- Gradle: Complex builds, custom logic, and performance-critical projects.
----------


    
----------

1. Setting Up the Environment

- Objective: Ensure all participants have the necessary tools installed and configured.
- Steps:
    - Verify JDK installation (`java -version`).
    - Install Maven (`mvn -v` to check installation).
    - Install Gradle (`gradle -v` to check installation).
    - Set up an IDE (IntelliJ IDEA or Eclipse) with Maven and Gradle support.
    

2. Simple Java Project with Maven With Command line

- Objective: Demonstrate how to create and build a basic Java project using Maven.
- Steps:
    - Use the Maven archetype to generate a project: 
    - `bash mvn archetype:generate -DgroupId=com.example -DartifactId=bookstore-api -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`
    - Navigate to the project directory: 
    - `bash cd bookstore-api`
    - Build the project: 
    - `bash mvn clean install`
    - Run the project: 
    - `bash java -cp target/bookstore-api-1.0-SNAPSHOT.jar com.example.App`
    

3. Creating a Simple Java Project with Gradle

- Objective: Demonstrate how to create and build a basic Java project using Gradle.
- Steps:
    - Use Gradle to initialize a new Java project: 
    - `bash gradle init --type java-application`
    - Navigate to the project directory: 
    - `bash cd <project-name>`
    - Build the project: 
    - `bash gradle build`
    - Run the project: 
    - `bash gradle run`
    

4. Converting a Maven Project to Gradle

- Objective: Show how to migrate an existing Maven project to Gradle.
- Steps:
    - Navigate to the Maven project directory.
    - Run the Gradle init command to convert the project: 
    - `bash gradle init --type pom`
    - Review the generated `build.gradle` file.
    - Build the project using Gradle: 
    - `bash gradle build`
    

5. Adding a Custom Task in Gradle

- Objective: Demonstrate how to add a custom task in a Gradle build script.
- Steps:
    - Open the `build.gradle` file.
    - Add a custom task: 
    - `groovy task hello { doLast { println 'Hello, Gradle!' } }`
    - Run the custom task: 
    - `bash gradle hello`
    

6. Adding a Plugin in Maven

- Objective: Demonstrate how to add and configure a plugin in a Maven project.
- Steps:
    - Open the `pom.xml` file.
    - Add a plugin, for example, the Maven Surefire Plugin: 
    - `xml <build> <plugins> <plugin> <groupId>org.apache.maven.plugins</groupId> <artifactId>maven-surefire-plugin</artifactId> <version>3.0.0-M5</version> </plugin> </plugins> </build>`
    - Run the plugin: 
    - `bash mvn surefire:test`

Using Spring Initializr

1. Using the VS Code Extension
2. Search `Spring Initializr: Create a Maven Project`
3. Fill in the options

`Language`: Java
`Group ID`: com.<Package Name>
`Artifact ID`: <Package ID>
`Packaging`: jar
`Java Version`: 17
`Dependencies`: <Search and Select Dependencies>

Additional Reading

- https://maven.apache.org/guides/index.html
- https://docs.gradle.org/current/userguide/userguide.html
- Maven: The Definitive Guide - O’reilly
- Gradle In Action