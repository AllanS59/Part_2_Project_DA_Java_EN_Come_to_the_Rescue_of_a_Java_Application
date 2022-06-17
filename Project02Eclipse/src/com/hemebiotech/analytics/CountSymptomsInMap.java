package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;
import java.util.List;

/**
 * Count of symptoms from a list of string to a Map
 *
 */
public class CountSymptomsInMap implements ISymptomsCounter {

	public CountSymptomsInMap() {
	}

	public Map<String, Integer> countSymptoms(List<String> symptomsList) {

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
