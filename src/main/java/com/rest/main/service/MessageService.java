package com.rest.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rest.main.data.DataBase;
import com.rest.main.model.Message;

public class MessageService {

	private static Map<Long, Message> messageMap = DataBase.getMessageMap();

	public MessageService() {
		Message msg = new Message(1L, "Senthil Kumar", "Pandiyarajan");
		Message msg1 = new Message(2L, "Sheelaw", "Senthil Kumar");
		messageMap.put(1l, msg);
		messageMap.put(2l, msg1);
	}

	public Message addMessage(Message message) {
		if (null == message) {
		}
		messageMap.put((long) (messageMap.size() + 1), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (null != message.getId()) {
			return null;
		}
		messageMap.put(message.getId(), message);
		return message;
	}

	public Message getMessage(Long id) {
		return messageMap.get(id);
	}

	public List<Message> getMessageList() {
		List<Message> messageList = new ArrayList<>(messageMap.values());
		return messageList;
	}

}
