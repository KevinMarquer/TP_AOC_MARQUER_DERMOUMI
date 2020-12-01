package fr.istic.kmarquer.aoc.capteur;

import fr.istic.kmarquer.aoc.canal.ObserveurDeCapteur;

public interface Subject {
	
	void attach(ObserveurDeCapteur o);
	void detach(ObserveurDeCapteur o);

}
