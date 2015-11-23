package com.github.fingahoverit.tryout.neo4jhibernateogm.common.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Default persistence entity
 */
public class EntityManagerHelper {

	/** static entity manager. */
	private static EntityManager EM = null;

	/**
	 * Return current entity manager or create a new one if null.
	 * 
	 * @return active entity manager.
	 */
	public static EntityManager getEntityManager() {

		if (EM == null || !EM.isOpen()) {

			synchronized (EntityManagerHelper.class) {
				// Thread Safe
				if (EM == null || !EM.isOpen()) {
					final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ogm-neo4j");

					EM = emf.createEntityManager();
					EM.getTransaction().begin();
				}
			}

			return EM;
		} else

		{
			return EM;
		}

	}

	/**
	 * Close current entity manager.
	 */
	public static void closeEntityManager() {
		if (EM != null && EM.isOpen()) {

			synchronized (EntityManagerHelper.class) {
				// Thread Safe

				if (EM != null && EM.isOpen()) {
					EM.getTransaction().commit();
					EM.close();
					EM = null;
				}
			}
		}
	}
}
