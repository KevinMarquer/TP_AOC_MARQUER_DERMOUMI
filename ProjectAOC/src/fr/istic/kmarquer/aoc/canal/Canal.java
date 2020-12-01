package fr.istic.kmarquer.aoc.canal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import fr.istic.kmarquer.aoc.capteur.Capteur;
import fr.istic.kmarquer.aoc.capteur.CapteurImpl;

public class Canal implements ObserveurDeCapteur{

	//role Proxy
	private final ExecutorService executorService = Executors.newFixedThreadPool(1);
	private Capteur capteur = new CapteurImpl();
	
	@Override
	public Future<?> getValue(){
		return executorService.submit(() -> {
            capteur.getValue();
        });
	}

	public void update(Capteur subject) {
		// TODO Auto-generated method stub
		
	}
}
