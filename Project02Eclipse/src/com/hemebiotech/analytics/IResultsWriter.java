package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will report results into an output file. The name of the file
 * should be define with a suitable extension (for example "*.out")
 * 
 */

public interface IResultsWriter {

	/**
	 * Report results from from a Map
	 * 
	 * @param mapSymptomsResults a map containing the different symptoms as keys and
	 *                           the number of occurrences as values
	 */
	void reportResults(Map<String, Integer> mapSymptomsResults);
}
