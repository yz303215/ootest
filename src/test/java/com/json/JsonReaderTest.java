package com.json;

import java.io.IOException;

import org.junit.Test;

/**
 *@author yangshen
 * @date  2019年7月1日
 */
public class JsonReaderTest {
	
	@Test
	public void should_return_map_when_read_the_json_file() throws IOException {
		
		JsonReader jReader = new JsonReader();
		
		jReader .readJsonFile();
	}
}
