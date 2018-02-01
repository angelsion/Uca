package com.uca.websocket;

import net.sf.json.JSONObject;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint("/websocket")
public class ChatServer {

	private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	private static Vector<Session> sys = new Vector<Session>();
	private static Map<String, Session> userMap = new ConcurrentHashMap<String, Session>();
	private static Map<String, Session> sysMap = new ConcurrentHashMap<String, Session>();


	/**
	 * 用户接入
	 * @param session 可选
	 */
	@OnOpen
	public void onOpen(Session session){
	    String identity = session.getQueryString();
        System.out.println("identity:"+identity);
	    if ("0".equals(identity)){
            System.out.println("******客服连接******");
//            sys.addElement(session);
			sysMap.put(session.getId(),session);
        }
		if ("1".equals(identity)){
            System.out.println("******游客连接******");
//	        user.addElement(session);
            userMap.put(session.getId(),session);
        }
	}

	/**
	 * 接收到来自用户的消息
	 * @param message
	 * @param session
	 */
	@OnMessage
	public void onMessage(String message,Session session){

        String identity = session.getQueryString();
		//把用户发来的消息解析为JSON对象
		JSONObject obj = JSONObject.fromObject(message);
		System.out.println("obj:"+obj);
		//向JSON对象中添加发送时间
		obj.put("date", df.format(new Date()));

        /*System.out.println("身份:"+session.getQueryString());
        System.out.println(obj.toString());*/

        if ("1".equals(identity)){
            obj.put("sessionId",session.getId());
            List<Session> sysList = new ArrayList<Session>(sysMap.values());
            Session sysSe = sysList.get(0);
            System.out.println("syslist:"+sysSe);
            sysSe.getAsyncRemote().sendText(obj.toString());
        }
        if ("0".equals(identity)){
            String sessionId = (String) obj.get("sessionId");
            System.out.println("游客sessionId:"+sessionId);
            Session se = userMap.get(sessionId);
            se.getAsyncRemote().sendText(obj.toString());
        }

		//遍历聊天室中的所有会话
		/*for(Session se : sys){
			//设置消息是否为自己的
			obj.put("isSelf", se.equals(session));
			//发送消息给远程用户
			se.getAsyncRemote().sendText(obj.toString());
		}*/
	}

	/**
	 * 用户断开
	 * @param session
	 */
	@OnClose
	public void onClose(Session session){
		userMap.remove(session.getId());
		sysMap.remove(session.getId());
	}

	/**
	 * 用户连接异常
	 * @param t
	 */
	@OnError
	public void onError(Throwable t){

	}
}
