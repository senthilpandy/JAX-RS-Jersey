package com.rest.main.data;

import java.util.HashMap;
import java.util.Map;

import com.rest.main.model.Message;

public class DataBase {

	private static Map<Long, Message> messageMap = null;

	public static Map<Long, Message> getMessageMap() {
		messageMap = new HashMap<>();
		return messageMap;
	}

}
