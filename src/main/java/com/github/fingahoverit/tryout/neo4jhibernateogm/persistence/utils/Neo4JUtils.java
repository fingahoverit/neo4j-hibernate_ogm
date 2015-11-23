package com.github.fingahoverit.tryout.neo4jhibernateogm.persistence.utils;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.tooling.GlobalGraphOperations;

/**
 * Generic methods for Neo4J DB.
 */
public class Neo4JUtils {

	/** Utils class -> No constructor. */
	private Neo4JUtils() {

	}

	/**
	 * Connects to a specified Neo4J db and print all nodes.
	 * 
	 * @param dbPath
	 */
	public static void printDbContents(String dbPath) {
		final GraphDatabaseService graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(dbPath);

		try (final Transaction tx = graphDb.beginTx()) {

			for (final Node node : GlobalGraphOperations.at(graphDb).getAllNodes()) {
				System.out.print(node.getId() + " ");
				for (final String key : node.getPropertyKeys()) {
					System.out.print(key + " - " + node.getProperty(key) + ", ");
				}
				System.out.print("\n");
			}
			tx.success();
		} finally {

			graphDb.shutdown();
		}
	}
}
