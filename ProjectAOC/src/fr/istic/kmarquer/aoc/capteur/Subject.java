package fr.istic.kmarquer.aoc.capteur;

import java.util.Observer;

public interface Subject {
	
	void attach(Observer o);
	void detach(Observer o);

}
