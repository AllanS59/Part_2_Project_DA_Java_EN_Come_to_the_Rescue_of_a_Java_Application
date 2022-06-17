package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.Map;

/**
 * Report of the results from a Map into an external text file
 *
 */
public class WriteMapResultsInFile implements IResultsWriter {

	private String filepath;

	/**
	 * @param filepath a full or partial path to file to create/edit to report the
	 *                 results
	 */
	public WriteMapResultsInFile(String filepath) {
		this.filepath = filepath;
	}

	public void reportResults(Map<String, Integer> mapSymptomsResults) {

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
