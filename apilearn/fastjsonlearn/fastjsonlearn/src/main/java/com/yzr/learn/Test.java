package com.yzr.learn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yzr.pojo.Grade;
import com.yzr.pojo.Student;

public class Test {
	
	@org.junit.Test
	public void test1() {
		String result = "{\"message\":{"
								+ "\"status\":\"0\","
								+ "\"message\":\"�ɹ�\","
								+ "\"payload\":["
								+ "{"
								+ 	"\"time\":\"201906\","
								+   "\"entryQty\":2,"
								+ 	"\"mistakeEntryQty\":0,"
								+ 	"\"denyEntryQty\":0,"
								+ 	"\"cancelEntryQty\":0,"
								+ 	"\"offlineEntrustEntryQty\":0"
								+ "}"
								+ "]"
								+ "},"+ 
							"\"code\":\"0\""
								+ "}\r\n";
		
		JSONObject parseObject = JSON.parseObject(result);
		System.out.println(parseObject.get("message"));
	}
}