# Templating Maven Plugin Example

A short hack to demonstrate how to use properties from the Maven build environment in a Java class without using a bypass by filtering property files.

Simply run the following commands to build and watch the results:

    mvn package
    java -cp target/templating-maven-plugin-example-0.0.1.jar com.hascode.tutorial.Main


This should produce a similar output:

    Templating Plugin for Maven Example
    artifactId: templating-maven-plugin-example, groupId: com.hascode.tutorial, version: 0.0.1
    project build directory: /data/project/templating-maven-plugin-example/target

Please feel free to have a look at my blog at [www.hascode.com] for other samples and tutorials.

----

**2013 Micha Kops / hasCode.com**

   [www.hascode.com]:http://www.hascode.com/