/**
 *Copyright (c) 2012-2013. 2012-2013,All Rights Reserved.

 *@File name:  ScanTargetVO.java
 *@Create on:  2012-12-12 上午10:17:00
 *@Author   :  ZhuZhaowen

 *@ChangeList
 *---------------------------------------------------
 *NO   		Date                     Editor               ChangeReasons
 *1.    2012-12-12 上午10:17:00              ZhuZhaowen               Add 
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

public class ScanTargetVO {
//	private String optType;
	private String targetName;
	private String targetValue;

	/*public String getOptType() {
		return optType;
	}

	public void setOptType(String optType) {
		this.optType = optType;
	}*/

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getTargetValue() {
		return targetValue;
	}

	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
	}

	public String toXML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<CLASS name='" + this.getClass().getName() + "' >");
		/*sb.append("<optType type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(optType));
		sb.append("</optType>");*/
		sb.append("<targetName type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(targetName));
		sb.append("</targetName>");
		sb.append("<targetValue type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(targetValue));
		sb.append("</targetValue>");
		sb.append("</CLASS>");
		return sb.toString();
	}

	public static ScanTargetVO fromXML(Node node) {
		ScanTargetVO aClass = new ScanTargetVO();
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
//				int tempNodeListLength = tempNodeList.getLength();
			} else {
				// getMethod
				String Value = XMLUtil.getNodeTextValue(tempNode);
				/*if ("optType".equals(tempNode.getNodeName()) || "".equals(type)) {
					aClass.setOptType(ValueParser.parseString(Value));
				}*/
				if ("targetName".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setTargetName(ValueParser.parseString(Value));
				}
				if ("targetValue".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setTargetValue(ValueParser.parseString(Value));
				}
			}
		}
		return aClass;
	}
	
	public static ScanTargetVO fromXML(String content) throws Exception{
		if(content == null || "".equals(content)){
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
