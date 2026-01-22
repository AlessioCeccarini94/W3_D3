package alessioceccarini.dao;

import alessioceccarini.entities.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public class EventDao {
	private final EntityManager em;

	public EventDao(EntityManager em) {
		this.em = em;
	}

	public void saveEvent(Event event) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		em.persist(event);

		transaction.commit();

		System.out.println(event.getName() + " è stato salvato!");
	}
	
}
