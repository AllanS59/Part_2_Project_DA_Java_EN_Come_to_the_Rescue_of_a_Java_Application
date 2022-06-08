package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		// Set results into a String List
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptomsList = readSymptomDataFromFile.GetSymptoms();

		// Count each symptoms and store the results in a Map
		CountSymptomsInMap countSymptomsInMap = new CountSymptomsInMap(symptomsList);
		Map<String, Integer> mapSymptomsResults = countSymptomsInMap.CountSymptoms();

		// Report the result in an output file
		WriteMapResultsInFile writeResultsInFile = new WriteMapResultsInFile(mapSymptomsResults, "results.out");
		writeResultsInFile.reportResults();

	}
}
