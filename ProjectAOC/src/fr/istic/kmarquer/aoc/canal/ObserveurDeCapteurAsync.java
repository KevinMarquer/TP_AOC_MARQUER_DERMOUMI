package fr.istic.kmarquer.aoc.canal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public interface ObserveurDeCapteurAsync {
	//role service
	Future<?> getValue();

}
