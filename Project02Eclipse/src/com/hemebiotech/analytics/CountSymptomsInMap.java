package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public class CountSymptomsInMap implements ISymptomsCounter {

	public List<String> symptomsList = new ArrayList<String>();

	/**
	 * 
	 * @param symptomsList a list containing the symptoms
	 */
	public CountSymptomsInMap(List<String> symptomsList) {
		this.symptomsList = symptomsList;
	}

	public Map<String, Integer> CountSymptoms() {

		Map<String, Integer> mapSymptomsResults = new TreeMap<String, Integer>();

		for (String symptom : symptomsList) {
			if (mapSymptomsResults.containsKey(symptom)) {
				mapSymptomsResults.put(symptom, mapSymptomsResults.get(symptom) + 1);
			} else {
				mapSymptomsResults.put(symptom, 1);
			}
		}

		return mapSymptomsResults;
	}
}
