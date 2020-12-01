package fr.istic.kmarquer.aoc.capteur;


import fr.istic.kmarquer.aoc.canal.ObserveurDeCapteur;

public interface Capteur extends Subject{

	//role servant
	void attach(ObserveurDeCapteur o);
	void detach(ObserveurDeCapteur o);
    Integer getValue();
    void tick();
}
