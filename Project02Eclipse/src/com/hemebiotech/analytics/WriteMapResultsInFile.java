package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;

public class WriteMapResultsInFile implements IWriteResultsInFile {

	private Map<String, Integer> mapSymptomsResults = new TreeMap<String, Integer>();
	private String filepath;

	/**
	 * @param mapSymptomsResults a map containing the different symptoms as keys and
	 *                           the number of occurrences as values
	 * @param filepath           a full or partial path to file to create/edit to
	 *                           report the results
	 */
	public WriteMapResultsInFile(Map<String, Integer> mapSymptomsResults, String filepath) {
		this.mapSymptomsResults = mapSymptomsResults;
		this.filepath = filepath;
	}

	public void reportResults() {

		if (filepath != null) {
			try {
				FileWriter writer = new FileWriter(filepath);
				Set<String> keys = mapSymptomsResults.keySet();
				for (String key : keys) {
					writer.write(key + "= " + mapSymptomsResults.get(key) + "\n");
				}
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
