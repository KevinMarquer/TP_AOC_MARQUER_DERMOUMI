package fr.istic.kmarquer.aoc.capteur;

import java.util.Observer;

public interface Capteur extends Subject{

	//role servant
	void attach(Observer o);
	void detach(Observer o);
    Integer getValue();
    void tick();
}
