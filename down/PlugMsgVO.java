/**
 *Copyright (c) 2012-2013. 2012-2013,All Rights Reserved.

 *@File name:  PlugMsgVO.java
 *@Create on:  2012-12-11 上午06:58:26
 *@Author   :  ZhuZhaowen

 *@ChangeList
 *---------------------------------------------------
 *NO   		Date                     Editor               ChangeReasons
 *1.    2012-12-11 上午06:58:26              ZhuZhaowen               Add 
 */
package com.yonyou.vo;

import java.io.StringReader;


import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

//import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import com.yonyou.util.ValueParser;
import com.yonyou.util.XMLUtil;

/**
 * @author <a href="mailto:zhuzhaowen@yonyou.com">zhuzhaowen</a>
 * @version 1.0
 */

public class PlugMsgVO {
	private String msgId;
	private String dealerId;
	private String entityCode;
	private int status;
	private MsgVO items;

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getEntityCode() {
		return entityCode;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public MsgVO getItems() {
		return items;
	}

	public void setItems(MsgVO items) {
		this.items = items;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	/**
	 * vo转xml
	 * 
	 * @return
	 */
	public String toXML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<CLASS name='" + this.getClass().getName() + "' >");
		sb.append("<msgId type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(msgId));
		sb.append("</msgId>");
		sb.append("<dealerId type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(dealerId));
		sb.append("</dealerId>");
		sb.append("<entityCode type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(entityCode));
		sb.append("</entityCode>");
		sb.append("<status type=\"int\" isArray=\"false\">");
		sb.append(ValueParser.getValue(status));
		sb.append("</status>");
		sb
				.append("<CLASS name=\"com.yonyou.vo.MsgVO\" type=\"com.yonyou.vo.MsgVO\" isArray=\"false\" >");

		sb.append((items == null) ? "" : items.toXML());

		sb.append("</CLASS>");
		sb.append("</CLASS>");
		return sb.toString();
	}

	/**
	 * xml转VO
	 * 
	 * @param node
	 * @return
	 */
	public static PlugMsgVO fromXML(Node node) {
		PlugMsgVO aClass = new PlugMsgVO();
		NodeList nodeList = node.getChildNodes();
		for (int i = 0; nodeList != null && i < nodeList.getLength(); i++) {
			Node tempNode = nodeList.item(i);
			String isArray = XMLUtil.getNodeAttributeValue(tempNode, "isArray");
			String type = XMLUtil.getNodeAttributeValue(tempNode, "type");
			if (isArray == null && type == null) {
				type = XMLUtil.getNodeAttributeValue(tempNode, "name");
			}
			if ("true".equals(isArray)) {
				NodeList tempNodeList = tempNode.getChildNodes();
				if (tempNodeList == null) {
					continue;
				}
	/*			int tempNodeListLength = tempNodeList.getLength();

				if ("items".equals(tempNode.getNodeName())
						|| "com.yonyou.vo.MsgListVO".equals(type)) {
					MsgVO[] temps = new MsgVO[tempNodeListLength];
					for (int j = 0; tempNodeList != null
							&& j < tempNodeList.getLength(); j++) {
						Node tempNode1 = tempNodeList.item(j);
						String Value = XMLUtil.getNodeTextValue(tempNode1);
						temps[j] = MsgVO.fromXML(tempNode1);
					}
					
					aClass.setItems(temps);
				}*/

			} else {
				// getMethod
				String Value = XMLUtil.getNodeTextValue(tempNode);
				if ("msgId".equals(tempNode.getNodeName()) || "".equals(type)) {
					aClass.setMsgId(ValueParser.parseString(Value));
				}
				if ("dealerId".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDealerId(ValueParser.parseString(Value));
				}
				if ("entityCode".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setEntityCode(ValueParser.parseString(Value));
				}
				if ("status".equals(tempNode.getNodeName()) || "".equals(type)) {
					aClass.setStatus(ValueParser.parseInt(Value));
				}
				if ("items".equals(tempNode.getNodeName())
						|| "com.yonyou.vo.MsgVO".equals(type)) {
					aClass.setItems(MsgVO.fromXML(tempNode.getChildNodes().item(0)));
				}
			}

		}

		return aClass;
	}

	public static PlugMsgVO fromXML(String content) throws Exception {
		if (content == null || "".equals(content)) {
			return null;
		}
		StringReader sr = new StringReader(content);
		DOMParser parser = new DOMParser();
		InputSource is = new InputSource(sr);
		parser.parse(is);
		Document document = parser.getDocument();
		Node rootNode = document.getDocumentElement();
		return fromXML(rootNode);

	}
}
