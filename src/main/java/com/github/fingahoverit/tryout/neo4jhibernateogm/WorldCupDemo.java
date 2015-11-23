package com.github.fingahoverit.tryout.neo4jhibernateogm;

import java.util.List;

import javax.persistence.EntityManager;

import com.github.fingahoverit.tryout.neo4jhibernateogm.persistence.entity.Country;
import com.github.fingahoverit.tryout.neo4jhibernateogm.persistence.utils.EntityManagerHelper;

/**
 * neo4j demo with world cup dataset
 */
public class WorldCupDemo {

	public static void main(String[] args) {

		EntityManager em = EntityManagerHelper.getEntityManager();

		String queryCountry = "MATCH ( n:Country ) RETURN n";
		List<Country> countryList = em.createNativeQuery(queryCountry, Country.class).getResultList();

		System.out.println("Result size : " + countryList.size());

		EntityManagerHelper.closeEntityManager();

		// Neo4JUtils.printDbContents("C:/temp/neo4j/neo4j_worldcup");
	}

}
