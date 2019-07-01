package com.json;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.apache.commons.io.FileUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 *@author yangshen
 * @date  2019年7月1日
 */
public class JsonReader {
	
	private static final Logger LOGGER = Logger.getLogger(JsonReader.class.getName());
	
	public static Map<String, List<KeyValue>> map = new ConcurrentHashMap<>(28);
	
	private String fileName;
	
	public void readJsonFile() throws IOException {
		
		String filePath = Thread.currentThread().getContextClassLoader().getResource(fileName).getPath();
		File jsonFile = new File(filePath);
		String jsonData = FileUtils.readFileToString(jsonFile);
		
		JSONObject jsonObject = JSONObject.parseObject(jsonData);
		
		Set<String> jsonKeySet = jsonObject.keySet();
		for (String jsonKey : jsonKeySet) {
			
			String jsonArray = jsonObject.getJSONArray(jsonKey).toJSONString();
			List<KeyValue> keyValues = JSONArray.parseArray(jsonArray, KeyValue.class);
			map.put(jsonKey, keyValues);
			LOGGER.info(jsonKey + keyValues);
		}
		LOGGER.info(jsonData);
		
	}
	
	public JsonReader(String jsonFile) {
		this.fileName = jsonFile;
	}

		public JsonReader() {	}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

}
