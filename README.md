# README

- Simple demo of a multi-module Maven project in Java, using both JUnit and Cucumber tests.
- The JUnit test are in the child modules Add, Mult and Expo.
- The Cucumber tests are in CrossModule, and use the child modules directly.
- All modules are within this project, no jar loads from Nexus needed.
- Most dependencies are managed by the parent pom.