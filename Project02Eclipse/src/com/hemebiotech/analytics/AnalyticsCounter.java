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

		
		// Create a class MapResults and complete the map with results
		MapResults reportSymptoms = new MapResults();
		reportSymptoms.completeMap ( symptomsList);
		
		//Report the results Map into a "results.out" file
		reportSymptoms.reportResultsInFile();

	}
}
