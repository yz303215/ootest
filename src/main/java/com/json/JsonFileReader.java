package com.json;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 *@author yangshen
 * @date  2019年7月2日
 */
public class JsonFileReader {
	private String jsonFileName;
	private String jsonFilePath;
	private File jsonFile;
	private String jsonString;
	
	public JsonFileReader(String fileName) throws IOException {
		 jsonFilePath = Thread.currentThread().getContextClassLoader().getResource(fileName).getPath();
		 jsonFile = new File(jsonFilePath);
		 jsonString = FileUtils.readFileToString(jsonFile);
		 jsonFileName = fileName;
	}
	
	public String getFileName() {
		return jsonFileName;
	}
	public void setFileName(String fileName) {
		this.jsonFileName = fileName;
	}
	public File getJsonFile() {
		return jsonFile;
	}
	public void setJsonFile(File jsonFile) {
		this.jsonFile = jsonFile;
	}

	public String getJsonFileName() {
		return jsonFileName;
	}

	public void setJsonFileName(String jsonFileName) {
		this.jsonFileName = jsonFileName;
	}

	public String getJsonFilePath() {
		return jsonFilePath;
	}

	public void setJsonFilePath(String jsonFilePath) {
		this.jsonFilePath = jsonFilePath;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
}
