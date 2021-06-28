# Spring-Boot_2.4

# Config File Processing (application properties and YAML files)
Spring Boot 2.4 has improved the way that application.properties and application.yml files are processed. If you only have a simple application.properties or application.yml file, your upgrade should be seamless. If, however, you’ve have a more complex setup (with profile-specific properties, or profile activation properties) you may need to make some changes if you want to use the new features.

Volume Mounted Config Directory Trees
A new spring.config.import property can be used to import configuration trees that are commonly used with Kubernetes. A configuration tree is an alternative way of providing key/value pairs. Each pair is declared in its own file, with the filename forming the property key, and the file contents providing the value.

# Startup Endpoint
A new startup actuator endpoint is now available that shows information about your applications startup. The endpoint can help you identify beans that are taking longer than expected to start.

This work builds on the application startup tracking feature that was recently added to Spring Framwork 5.3. 

# Origin Chains
The Origin interface has been updated with a new getParent() method. This allows us to provide a full origin chain that can show exactly where an item originated from.

For example, you might use spring.config.import in your application.properties to import a second file. The Origin of properties loaded from this second file will have a parent that points back to the original import declaration.

You can try this yourself by looking at the output of the actuator/env or actuator/configprops actuator endpoints.

# Docker/Buildpack Support
Publishing Images
The Maven plugin’s spring-boot:build-image goal and the Gradle plugin’s bootBuildImage task now have the ability to publish the generated image to a Docker registry.

Authentication
When using Spring Boot’s buildpack support, you can now use a private authenticated Docker registry for your builder or run image. Both username/password and token based authentication are supported.

The Maven and Gradle documentation has been updated to show the new configuration.

# Java 15 support
Spring Boot 2.4 supports Java 15 while also remaining compatible with Java 11 and 8.
