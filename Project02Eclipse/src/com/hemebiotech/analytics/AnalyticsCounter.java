package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.TreeMap;
import java.util.Set;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		// Set results into a String List
		ReadSymptomDataFromFile readSymptomsList = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptomsList = readSymptomsList.GetSymptoms();

		// Initiate a Tree Map to collect the Results
		TreeMap<String, Integer> mapResults = new TreeMap<String, Integer>();

		// For each Symptom: either add it to the Map or increment the number if already
		// exists
		for (String symptom : symptomsList) {
			if (mapResults.containsKey(symptom)) {
				mapResults.put(symptom, mapResults.get(symptom) + 1);
			} else {
				mapResults.put(symptom, 1);
			}
		}

		// Report the results into a "results.out" file
		FileWriter writer = new FileWriter("result.out");
		Set<String> keys = mapResults.keySet();
		for (String key : keys) {
			writer.write(key + "= " + mapResults.get(key) + "\n");
		}
		writer.close();

	}
}
