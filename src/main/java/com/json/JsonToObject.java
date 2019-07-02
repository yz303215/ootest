package com.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.entity.Employee;

/**
 *@author yangshen
 * @date  2019年7月2日
 */
public class JsonToObject extends JsonFileReader{
	
	private static final Logger LOGGER = Logger.getLogger(JsonFileReader.class.getName());

	public void jsonToObject() throws Exception {
		Employee employee = JSON.parseObject(getJsonString(), Employee.class);
		LOGGER.info(employee.toString());
		/*
		 * Stack<JSONObject> jStack = new Stack<JSONObject>(); jStack.push(userJson);
		 * Employees employees = JSON.toJavaObject(userJson, Employees.class);
		 * Map<String, Object> jsMap = new HashMap<String, Object>(); jsMap =
		 * parseJSON2Map(jsMap,super.getJsonString());
		 * LOGGER.info(employees.toString());
		 */
	}
	
	public JsonToObject(String fileName) throws IOException {
		super(fileName);
	}
	
	@SuppressWarnings("unused")
	private static Map<String, Object> parseJSON2Map( Map<String, Object>  map,String jsonStr) {
		// 最外层解析
		JSONObject json = JSONObject.parseObject(jsonStr);
		for (Object key : json.keySet()) {
		    Object value = json.get(key);
		    // 判断内层对象类型，如果还是数组的话，继续解析
		    if (value instanceof JSONArray) {
		        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		        Iterator<Object> it = ((JSONArray) value).iterator();
		        while (it.hasNext()) {
		            JSONObject json2 = (JSONObject)it.next();
		            list.add(parseJSON2Map(map,json2.toString()));
		        }
		        map.put(key.toString(), list);
		    } else {
		        map.put(key.toString(),value);
		    }
		}
		return map; } 
	
}