/**
*Copyright (c) 2012-2013. 2012-2013,All Rights Reserved.

*@File name:  MsgVO.java
*@Create on:  2012-12-11 上午01:56:37
*@Author   :  ZhuZhaowen

*@ChangeList
*---------------------------------------------------
*NO   		Date                     Editor               ChangeReasons
*1.    2012-12-11 上午01:56:37              ZhuZhaowen               Add 
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

public class MsgVO {
	private String cmdId;
	private String cmd;
	private String cmdResult;
	private String sqlId;
	private String sql ;
	private String sqlStatus;
	private String sqlResult;
	private String downloadId;
	private String seedId;
	private String taskId;
	private String downloadPer;
	private String downloadStatus;
	private String isStopDownload;
	private String isAutoDownload;
	private String isUpGrade;
	public String getCmdId() {
		return cmdId;
	}
	public void setCmdId(String cmdId) {
		this.cmdId = cmdId;
	}
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public String getCmdResult() {
		return cmdResult;
	}
	public void setCmdResult(String cmdResult) {
		this.cmdResult = cmdResult;
	}
	public String getSqlId() {
		return sqlId;
	}
	public void setSqlId(String sqlId) {
		this.sqlId = sqlId;
	}
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	public String getSqlStatus() {
		return sqlStatus;
	}
	public void setSqlStatus(String sqlStatus) {
		this.sqlStatus = sqlStatus;
	}
	public String getDownloadId() {
		return downloadId;
	}
	public void setDownloadId(String downloadId) {
		this.downloadId = downloadId;
	}
	public String getSeedId() {
		return seedId;
	}
	public void setSeedId(String seedId) {
		this.seedId = seedId;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getDownloadPer() {
		return downloadPer;
	}
	public void setDownloadPer(String downloadPer) {
		this.downloadPer = downloadPer;
	}
	public String getDownloadStatus() {
		return downloadStatus;
	}
	public void setDownloadStatus(String downloadStatus) {
		this.downloadStatus = downloadStatus;
	}
	public String getSqlResult() {
		return sqlResult;
	}
	public void setSqlResult(String sqlResult) {
		this.sqlResult = sqlResult;
	}
	public String getIsStopDownload() {
		return isStopDownload;
	}
	public void setIsStopDownload(String isStopDownload) {
		this.isStopDownload = isStopDownload;
	}
	public String getIsAutoDownload() {
		return isAutoDownload;
	}
	public void setIsAutoDownload(String isAutoDownload) {
		this.isAutoDownload = isAutoDownload;
	}
	public String getIsUpGrade() {
		return isUpGrade;
	}
	public void setIsUpGrade(String isUpGrade) {
		this.isUpGrade = isUpGrade;
	}
	public String toXML(){
		StringBuilder sb = new StringBuilder();
		sb.append("<CLASS name='" + this.getClass().getName() + "' >");
		sb.append("<cmdId type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(cmdId));
		sb.append("</cmdId>");
		sb.append("<cmd type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(cmd));
		sb.append("</cmd>");
		sb.append("<cmdResult type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(cmdResult));
		sb.append("</cmdResult>");
		sb.append("<sqlId type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(sqlId));
		sb.append("</sqlId>");
		sb.append("<sql type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(sql));
		sb.append("</sql>");
		sb.append("<sqlStatus type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(sqlStatus));
		sb.append("</sqlStatus>");
		sb.append("<downloadId type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(downloadId));
		sb.append("</downloadId>");
		sb.append("<seedId type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(seedId));
		sb.append("</seedId>");
		sb.append("<taskId type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(taskId));
		sb.append("</taskId>");
		sb.append("<downloadPer type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(downloadPer));
		sb.append("</downloadPer>");
		sb.append("<downloadStatus type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(downloadStatus));
		sb.append("</downloadStatus>");
		sb.append("<sqlResult type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(sqlResult));
		sb.append("</sqlResult>");
		sb.append("<isStopDownload type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(this.isStopDownload));
		sb.append("</isStopDownload>");
		sb.append("<isAutoDownload type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(this.isAutoDownload));
		sb.append("</isAutoDownload>");
		sb.append("<isUpGrade type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(this.isUpGrade));
		sb.append("</isUpGrade>");
		sb.append("</CLASS>");
		return sb.toString();
		
	}
	
	public static MsgVO fromXML(Node node) {
		MsgVO aClass = new MsgVO();
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
			} else {
				// getMethod
				String Value = XMLUtil.getNodeTextValue(tempNode);
				if ("cmdId".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setCmdId(ValueParser.parseString(Value));
				}
				if ("cmd".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setCmd(ValueParser.parseString(Value));
				}
				if ("cmdResult".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setCmdResult(ValueParser.parseString(Value));
				}
				if ("sqlId".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setSqlId(ValueParser.parseString(Value));
				}
				if ("sql".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setSql(ValueParser.parseString(Value));
				}
				if ("sqlStatus".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setSqlStatus(ValueParser.parseString(Value));
				}
				if ("downloadId".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDownloadId(ValueParser.parseString(Value));
				}
				if ("seedId".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setSeedId(ValueParser.parseString(Value));
				}
				if ("taskId".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setTaskId(ValueParser.parseString(Value));
				}
				if ("downloadPer".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDownloadPer(ValueParser.parseString(Value));
				}
				if ("downloadStatus".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDownloadStatus(ValueParser.parseString(Value));
				}
				if ("sqlResult".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setSqlResult(ValueParser.parseString(Value));
				}
				if ("isStopDownload".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setIsStopDownload(ValueParser.parseString(Value));
				}
				if ("isAutoDownload".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setIsAutoDownload(ValueParser.parseString(Value));
				}
				if ("isUpGrade".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setIsUpGrade(ValueParser.parseString(Value));
				}
			}
		}

		return aClass;

	}
	
	public static MsgVO fromXML(String content) throws Exception{
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
 