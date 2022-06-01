package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.List;
import java.util.Set;

public class MapResults implements IMapResults {

	private TreeMap<String, Integer> mapResults = new TreeMap<String, Integer>();
	private String fileName;

	/**
	 * @param fileName (optional) the name of the file to create/update to report the symptoms list with number of occurrence (default value 'results.out')
	 * @param mapResults (optional) map in which the results are stored (keys for symptoms and values for occurrences)(default value is an empty map)              
	 */
		//Primary constructor of the class MapResults
	public MapResults(TreeMap<String, Integer> mapResults, String fileName) {
		this.mapResults = mapResults;
		this.fileName = fileName;
	}
	
	/**
	 * @param fileName (optional) the name of the file to create/update to report the symptoms list with number of occurrence (default value 'results.out')
	 * @param mapResults (optional) map in which the results are stored (keys for symptoms and values for occurrences)(default value is an empty map)            
	 */
	//Secondary constructor of the class MapResults (with no preselected map)
		public MapResults(String fileName) {
			this.fileName = fileName;
	}
	
	/**
	* @param fileName (optional) the name of the file to create/update to report the symptoms list with number of occurrence (default value 'results.out')
	* @param mapResults (optional) map in which the results are stored (keys for symptoms and values for occurrences)(default value is an empty map)               
	*/		
	//Secondary constructor of the class MapResults (with no preselected filename)
		public MapResults(TreeMap<String, Integer> mapResults) {
			this.mapResults = mapResults;
			this.fileName = "results.out";
	}
	
	/**
	* @param fileName (optional) the name of the file to create/update to report the symptoms list with number of occurrence (default value 'results.out')
	* @param mapResults (optional) map in which the results are stored (keys for symptoms and values for occurrences)(default value is an empty map)               
	*/
	//Secondary constructor of the class MapResults (with no selected map nor filename)
		public MapResults() {
			this.fileName = "results.out";
	}
		
	public void completeMap (List<String> symptomsList)	{
		for (String symptom : symptomsList) {
			if (mapResults.containsKey(symptom)) {
				mapResults.put(symptom, mapResults.get(symptom) + 1);
			} else {
				mapResults.put(symptom, 1);
			}
		}
	}
	
	
	
	public void reportResultsInFile() {

		if (fileName != null) {
			try {
				FileWriter writer = new FileWriter(fileName);
				Set<String> keys = mapResults.keySet();
				for (String key : keys) {
					writer.write(key + "= " + mapResults.get(key) + "\n");
				}
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
