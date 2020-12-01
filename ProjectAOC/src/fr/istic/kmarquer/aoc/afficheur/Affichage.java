package fr.istic.kmarquer.aoc.afficheur;

import org.junit.jupiter.api.Test;

import fr.istic.kmarquer.aoc.canal.ObserveurDeCapteurAsync;
import fr.istic.kmarquer.aoc.capteur.Capteur;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Logger;

public class Affichage implements ObserveurDeCapteurAsync{

	//Client
	@Test
	public void update(Capteur subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Future<?> getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
