package com.hemebiotech.analytics;

/**
 * Anything that will report results into an output file The name of the file
 * should be define with a suitable extension (for example "*.out")
 * 
 */

public interface IWriteResultsInFile {

	/**
	 * Create a file named with 'filepath' variable and write inside the results
	 * from the map 'mapSymptomsResults'.
	 * 
	 * It will do nothing if 'fileName' is empty
	 * 
	 */
	void reportResults();

}
