package com.hemebiotech.analytics;

import java.util.List;
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
	 * @param symptomsList a list containing the symptoms
	 *
	 * @return a Map containing the different Symptoms as keys and the number of
	 *         occurrences as values
	 * 
	 */
	Map<String, Integer> countSymptoms(List<String> symptomsLis);
}
