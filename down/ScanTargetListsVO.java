/**
*Copyright (c) 2012-2013. 2012-2013,All Rights Reserved.

*@File name:  ScanTargetListsVO.java
*@Create on:  2012-12-13 上午07:49:03
*@Author   :  ZhuZhaowen

*@ChangeList
*---------------------------------------------------
*NO   		Date                     Editor               ChangeReasons
*1.    2012-12-13 上午07:49:03              ZhuZhaowen               Add 
*/   
package com.yonyou.vo;   

import java.io.StringReader;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

//import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import com.yonyou.util.XMLUtil;
  
/**   
 * @author <a href="mailto:zhuzhaowen@yonyou.com">zhuzhaowen</a>  
 * @version 1.0   
 */

public class ScanTargetListsVO {
	private ScanTargetListVO[] items;

	public ScanTargetListVO[] getItems() {
		return items;
	}

	public void setItems(ScanTargetListVO[] items) {
		this.items = items;
	}
	/**
     * vo转xml
     * @return
     */
	public  String toXML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<CLASS name='" + this.getClass().getName() + "' >");
		sb.append("<CLASS name=\"com.yonyou.vo.ScanTargetListVO\" type=\"com.yonyou.vo.ScanTargetListVO\" isArray=\"true\" >");
		for (int i = 0; items != null && i < items.length; i++) {
			sb.append((items[i] == null) ? "" : items[i].toXML());
		}
		sb.append("</CLASS>");
		sb.append("</CLASS>");
	
		return sb.toString();
	}
	/**
	 * xml转VO
	 * @param node
	 * @return
	 */
	public static ScanTargetListsVO fromXML(Node node) {
		ScanTargetListsVO aClass = new ScanTargetListsVO();
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
				int tempNodeListLength = tempNodeList.getLength();

				if ("items".equals(tempNode.getNodeName())
						|| "com.yonyou.vo.ScanTargetListVO"
								.equals(type)) {
					ScanTargetListVO[] temps = new ScanTargetListVO[tempNodeListLength];
					for (int j = 0; tempNodeList != null
							&& j < tempNodeList.getLength(); j++) {
						Node tempNode1 = tempNodeList.item(j);
						String Value = XMLUtil.getNodeTextValue(tempNode1);
						temps[j] = ScanTargetListVO.fromXML(tempNode1);
					}
					aClass.setItems(temps);
				}

			} else {
				// getMethod
				String Value = XMLUtil.getNodeTextValue(tempNode);
			}

		}

		return aClass;
	}
	
	public static ScanTargetListsVO fromXML(String content) throws Exception{
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
 