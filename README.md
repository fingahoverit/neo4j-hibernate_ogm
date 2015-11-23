NEO4J integrated with Hibernate OGM
===============

Integrating neo4j with Hibernate OGM on worldcup dataset.

Why Hibernate OGM (Object/Grid Mapping) ?

Because it's JPA compatible and it has not much other concepts to learn than neo4j and JPA.

> **Note about Neo4J Version :**

> This tryout requires version **2.1.8** of Neo4j because the dependency from the latest Hibernate OGM version (4.2.0.Final)

## Installation

### Prepare IDE

1. Clone the project (or get the zip)
2. Add it to your IDE
3. Use maven automation to configure your project
4. Ready to go!

### Prepare Data
* with external db injection

1. Install version 2.1.8 of [neo4j](http://neo4j.com/download/)
2. Use scripts from directory : TODO
3. 5! 5! 5!

Rock 'n Roll!

## FAQ
* I need to connect to neo4j remotely through an URL!

I may be wrong but I think that actually Hibernate OGM only connects to an embedded neo4j database. Maybe one day, they will give support for remote connection and then maybe i'll update the project.
If you really need remote connection check [neo4j-ogm](https://github.com/neo4j/neo4j-ogm)

## Resources
* Dataset is from [mneedham's neo4j-worldcup](https://github.com/mneedham/neo4j-worldcup)
* Source code is inspired from [TimmyStorms' s hibernate-ogm-neo4j-example](https://github.com/TimmyStorms/hibernate-ogm-neo4j-example)

## License

Covered with [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)