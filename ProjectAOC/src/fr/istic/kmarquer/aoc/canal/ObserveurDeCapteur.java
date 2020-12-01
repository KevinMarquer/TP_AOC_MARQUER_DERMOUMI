package fr.istic.kmarquer.aoc.canal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import fr.istic.kmarquer.aoc.capteur.Capteur;

public interface ObserveurDeCapteur {
	//role service
	Future<?> getValue();
	
	void update(Capteur subject);

}
