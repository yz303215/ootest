package com.json;

import org.junit.Test;

/**
 *@author yangshen
 * @date  2019年7月2日
 */
public class JsonToObjectTest {
	
	@Test
	public void should_print_the_json_string_when_read_the_json_file() throws Exception {
		JsonToObject jsonToObject = new JsonToObject("json.data");
		jsonToObject.jsonToObject();
	}
}
