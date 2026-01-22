package alessioceccarini.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("concerts")
public class Concerts extends Event {

	private ConcertType concertType;
	private boolean streaming;


	public Concerts(String name, LocalDate matchDay, EventType type, Location location, ConcertType concertType, boolean streaming) {
		super(name, matchDay, type, location);
		this.concertType = concertType;
		this.streaming = streaming;
	}

	public ConcertType getConcertType() {
		return concertType;
	}

	public void setConcertType(ConcertType concertType) {
		this.concertType = concertType;
	}

	public boolean isStreaming() {
		return streaming;
	}

	public void setStreaming(boolean streaming) {
		this.streaming = streaming;
	}

	@Override
	public String toString() {
		return "Concerts{" +
				"concertType=" + concertType +
				", streaming=" + streaming +
				'}' + super.toString();
	}
}
