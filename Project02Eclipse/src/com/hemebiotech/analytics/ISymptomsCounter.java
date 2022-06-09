package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will read a list of symptoms to count each symptoms and return
 * the results
 * 
 */

public interface ISymptomsCounter {
	/**
	 * Read a List of string 'symptomList' and return the results in a Map.
	 * 
	 * @return a Map containing the different Symptoms as keys and the number of
	 *         occurrences as values
	 * 
	 */
	Map<String, Integer> CountSymptoms();
}
