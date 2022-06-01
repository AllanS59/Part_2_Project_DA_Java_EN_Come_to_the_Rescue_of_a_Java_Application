package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will report results from a Map into a outfile file
 * The name of the file shoud be define with a suitable extension (for example "*.out")
 * 
 */
public interface IMapResults {
	/**
	 * Read a List of string 'symptomList' and will store in the map 'mapResults' of the class the number of occurrence for each different string
	 *  
	 * The keys are the strings and the values are the numbers of occurrences
	 * 
	 */	
	void completeMap(List<String> symptomsList);
	
	
	
	/**
	 * Create a file named with 'fileName' variable and write inside the results of the report.
	 *  
	 * It will do nothing if 'fileName' is empty
	 * 
	 */	
	void reportResultsInFile();
	
}
