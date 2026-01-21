package alessioceccarini.entities;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "partecipations")
public class Partecipation {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@ManyToOne
	@JoinColumn(name = "person_id", nullable = false)
	private Person person;
	@ManyToOne
	@JoinColumn(name = "event_id", nullable = false)
	private Event event;
	@Enumerated(EnumType.STRING)
	private PartecipationState state;

	public Partecipation() {
	}

	public Partecipation(Person person, Event event, PartecipationState state) {
		this.person = person;
		this.event = event;
		this.state = state;
	}

	public UUID getId() {
		return id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public PartecipationState getState() {
		return state;
	}

	public void setState(PartecipationState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Partecipation{" +
				"id=" + id +
				", person=" + person +
				", event=" + event +
				", state=" + state +
				'}';
	}
}
