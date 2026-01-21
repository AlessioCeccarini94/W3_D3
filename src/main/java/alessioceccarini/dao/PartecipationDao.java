package alessioceccarini.dao;

import alessioceccarini.NotFoundException;
import alessioceccarini.entities.Partecipation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class PartecipationDao {
	private final EntityManager em;

	public PartecipationDao(EntityManager em) {
		this.em = em;
	}

	public void savePartecipation(Partecipation partecipation) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		em.persist(partecipation);

		transaction.commit();

		System.out.println(partecipation.getPerson().getFirstName() + " " + partecipation.getPerson().getLastName()
				+ " parteciperà all' evento " + partecipation.getEvent().getName());
	}

	public Partecipation findById(String partecipationId) {
		Partecipation found = em.find(Partecipation.class, UUID.fromString(partecipationId));
		if (found == null) throw new NotFoundException(partecipationId);
		return found;
	}
}