NEO4J integrated with Hibernate OGM
===============

Integrating neo4j with Hibernate OGM on worldcup dataset.

Why Hibernate OGM ?

Because it's JPA compatible and it has not much other concepts to learn that neo4j and JPA.

## Installation

### Prepare IDE

1. Clone the project (or get the zip)
2. Add it to your IDE
3. Use maven automation to configure your project
4. Ready to go!

### Prepare Data
* with external db injection

1. Install [neo4j](http://neo4j.com/download/)
2. Use scripts from directory : TODO
3. 5! 5! 5!

* OR with db injection with Java

1. TODO
 
Rock 'n Roll!

## FAQ
* I need to connect to me neo4j remotely through an URL!

I may be wrong but I think that actually Hibernate OGM only connects to embedded neo4j dbs. Maybe one day, they will give support for remote connection and then maybe i'll update the project.
If you really need remote connection check [neo4j-ogm](https://github.com/neo4j/neo4j-ogm)

## License

Covered with [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)