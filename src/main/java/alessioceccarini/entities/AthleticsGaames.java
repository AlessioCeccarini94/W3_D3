package alessioceccarini.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@DiscriminatorValue("athletics_games")
public class AthleticsGaames extends Event {
	private List<Object> athlets = new ArrayList<>();
	private String winner;

	public AthleticsGaames() {
	}

	public AthleticsGaames(String name, LocalDate matchDay, EventType type, Location location, List<Object> athlets, String winner) {
		super(name, matchDay, type, location);
		this.athlets = athlets;
		this.winner = winner;
	}

	public List<Object> getAthlets() {
		return athlets;
	}

	public void setAthlets(List<Object> athlets) {
		this.athlets = athlets;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "AthleticsGaames{" +
				"athlets=" + athlets +
				", winner='" + winner + '\'' +
				'}' + super.toString();
	}
}
