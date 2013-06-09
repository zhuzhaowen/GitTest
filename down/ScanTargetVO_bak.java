/**
 *Copyright (c) 2012-2013. 2012-2013,All Rights Reserved.

 *@File name:  ScanTargetVO.java
 *@Create on:  2012-12-3 上午03:52:34
 *@Author   :  ZhuZhaowen

 *@ChangeList
 *---------------------------------------------------
 *NO   		Date                     Editor               ChangeReasons
 *1.    2012-12-3 上午03:52:34              ZhuZhaowen               Add 
 */
package com.yonyou.vo;

import java.io.StringReader;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import com.yonyou.util.ValueParser;
import com.yonyou.util.XMLUtil;

/**
 * @author <a href="mailto:zhuzhaowen@yonyou.com">zhuzhaowen</a>
 * @version 1.0
 */

public class ScanTargetVO_bak {
	private String entityCode;// 经销商编号
	private String hostName;// 主机名
	private String appVersion;// 应用版本号
	private String appUsable;// 应用是否连通
	private String diskCTotal;// c盘容量
	private String diskDTotal;// d盘容量
	private String diskETotal;// e盘容量
	private String diskFTotal;// f盘容量
	private String sysType;// 系统类型
	private String memoryTotal;// 内存大小
	private String diskCRate;// c盘使用率
	private String diskDRate;// d盘使用率
	private String diskERate;// e盘使用率
	private String diskFRate;// f盘使用率
	private String memoryRate;// 内存使用率
	private String temperature;// 温度
	private String humidty;// 湿度
	private String isDoorClosed;// 机柜是否关闭
	private String isValiLibSucc;// 校验库执行是否成功
	private String ascDate;// 下端时间
	private String isDiskOnline;// 硬盘是否在线
	private String ip;// 下端ip
	private String oemIp;// 上端ip
	private String optType;//上报类型
	private String cpuRate;//cpu使用率
	private String mqContent;//mq显示内容，icream用
	private String mqStatus;//mq状态
	
	private String dbImpStatus_icr;
	private int deExCount_icr;
	private int taskExCount_icr;
	private int dbImpExCount_icr;
	private String valibVer_icr;
	//private int appVer_icr;
	private String dbBackStatus;// 数据库备份是否成功
	private String dealerId;
	public String getEntityCode() {
		return entityCode;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	
	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppUsable() {
		return appUsable;
	}

	public void setAppUsable(String appUsable) {
		this.appUsable = appUsable;
	}

	public String getDiskCTotal() {
		return diskCTotal;
	}

	public void setDiskCTotal(String diskCTotal) {
		this.diskCTotal = diskCTotal;
	}

	public String getDiskDTotal() {
		return diskDTotal;
	}

	public void setDiskDTotal(String diskDTotal) {
		this.diskDTotal = diskDTotal;
	}

	public String getDiskETotal() {
		return diskETotal;
	}

	public void setDiskETotal(String diskETotal) {
		this.diskETotal = diskETotal;
	}

	public String getDiskFTotal() {
		return diskFTotal;
	}

	public void setDiskFTotal(String diskFTotal) {
		this.diskFTotal = diskFTotal;
	}

	public String getSysType() {
		return sysType;
	}

	public void setSysType(String sysType) {
		this.sysType = sysType;
	}

	public String getMemoryTotal() {
		return memoryTotal;
	}

	public void setMemoryTotal(String memoryTotal) {
		this.memoryTotal = memoryTotal;
	}

	public String getDiskCRate() {
		return diskCRate;
	}

	public void setDiskCRate(String diskCRate) {
		this.diskCRate = diskCRate;
	}

	public String getDiskDRate() {
		return diskDRate;
	}

	public void setDiskDRate(String diskDRate) {
		this.diskDRate = diskDRate;
	}

	public String getDiskERate() {
		return diskERate;
	}

	public void setDiskERate(String diskERate) {
		this.diskERate = diskERate;
	}

	public String getDiskFRate() {
		return diskFRate;
	}

	public void setDiskFRate(String diskFRate) {
		this.diskFRate = diskFRate;
	}

	public String getMemoryRate() {
		return memoryRate;
	}

	public void setMemoryRate(String memoryRate) {
		this.memoryRate = memoryRate;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidty() {
		return humidty;
	}

	public void setHumidty(String humidty) {
		this.humidty = humidty;
	}

	public String getIsDoorClosed() {
		return isDoorClosed;
	}

	public void setIsDoorClosed(String isDoorClosed) {
		this.isDoorClosed = isDoorClosed;
	}

	public String getIsValiLibSucc() {
		return isValiLibSucc;
	}

	public void setIsValiLibSucc(String isValiLibSucc) {
		this.isValiLibSucc = isValiLibSucc;
	}

	public String getAscDate() {
		return ascDate;
	}

	public void setAscDate(String ascDate) {
		this.ascDate = ascDate;
	}

	public String getIsDiskOnline() {
		return isDiskOnline;
	}

	public void setIsDiskOnline(String isDiskOnline) {
		this.isDiskOnline = isDiskOnline;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOemIp() {
		return oemIp;
	}

	public void setOemIp(String oemIp) {
		this.oemIp = oemIp;
	}

	public String getOptType() {
		return optType;
	}

	public void setOptType(String optType) {
		this.optType = optType;
	}
	
	public String getCpuRate() {
		return cpuRate;
	}

	public void setCpuRate(String cpuRate) {
		this.cpuRate = cpuRate;
	}
	
	public String getMqContent() {
		return mqContent;
	}

	public void setMqContent(String mqContent) {
		this.mqContent = mqContent;
	}

	public String getMqStatus() {
		return mqStatus;
	}

	public void setMqStatus(String mqStatus) {
		this.mqStatus = mqStatus;
	}
	
	public String getDbImpStatus_icr() {
		return dbImpStatus_icr;
	}

	public void setDbImpStatus_icr(String dbImpStatus_icr) {
		this.dbImpStatus_icr = dbImpStatus_icr;
	}

	public int getDeExCount_icr() {
		return deExCount_icr;
	}

	public void setDeExCount_icr(int deExCount_icr) {
		this.deExCount_icr = deExCount_icr;
	}

	public int getTaskExCount_icr() {
		return taskExCount_icr;
	}

	public void setTaskExCount_icr(int taskExCount_icr) {
		this.taskExCount_icr = taskExCount_icr;
	}

	public int getDbImpExCount_icr() {
		return dbImpExCount_icr;
	}

	public void setDbImpExCount_icr(int dbImpExCount_icr) {
		this.dbImpExCount_icr = dbImpExCount_icr;
	}
	
	public String getValibVer_icr() {
		return valibVer_icr;
	}

	public void setValibVer_icr(String valibVer_icr) {
		this.valibVer_icr = valibVer_icr;
	}
	
	public String getDbBackStatus() {
		return dbBackStatus;
	}

	public void setDbBackStatus(String dbBackStatus) {
		this.dbBackStatus = dbBackStatus;
	}

	/**
	 * 转换成对应的xml
	 * 
	 * @return
	 */
	public String toXML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<CLASS name='" + this.getClass().getName() + "' >");
		sb.append("<entityCode type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(entityCode));
		sb.append("</entityCode>");
		sb.append("<dealerId type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(dealerId));
		sb.append("</dealerId>");
		sb.append("<hostName type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(hostName));
		sb.append("</hostName>");
		sb.append("<appVersion type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(appVersion));
		sb.append("</appVersion>");
		sb.append("<appUsable type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(appUsable));
		sb.append("</appUsable>");
		sb.append("<diskCTotal type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(diskCTotal));
		sb.append("</diskCTotal>");
		sb.append("<diskDTotal type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(diskDTotal));
		sb.append("</diskDTotal>");
		sb.append("<diskETotal type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(diskETotal));
		sb.append("</diskETotal>");
		sb.append("<diskFTotal type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(diskFTotal));
		sb.append("</diskFTotal>");
		sb.append("<sysType type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(sysType));
		sb.append("</sysType>");
		sb.append("<memoryTotal type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(memoryTotal));
		sb.append("</memoryTotal>");
		sb.append("<diskCRate type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(diskCRate));
		sb.append("</diskCRate>");
		sb.append("<diskDRate type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(diskDRate));
		sb.append("</diskDRate>");
		sb.append("<diskERate type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(diskERate));
		sb.append("</diskERate>");
		sb.append("<diskFRate type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(diskFRate));
		sb.append("</diskFRate>");
		sb.append("<memoryRate type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(memoryRate));
		sb.append("</memoryRate>");
		sb.append("<temperature type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(temperature));
		sb.append("</temperature>");
		sb.append("<humidty type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(humidty));
		sb.append("</humidty>");
		sb.append("<isDoorClosed type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(isDoorClosed));
		sb.append("</isDoorClosed>");
		sb.append("<isValiLibSucc type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(isValiLibSucc));
		sb.append("</isValiLibSucc>");
		sb.append("<ascDate type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(ascDate));
		sb.append("</ascDate>");
		sb.append("<isDiskOnline type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(isDiskOnline));
		sb.append("</isDiskOnline>");
		sb.append("<ip type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(ip));
		sb.append("</ip>");
		sb.append("<oemIp type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(oemIp));
		sb.append("</oemIp>");
		sb.append("<optType type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(optType));
		sb.append("</optType>");
		sb.append("<cpuRate type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(cpuRate));
		sb.append("</cpuRate>");
		sb.append("<mqContent type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(mqContent));
		sb.append("</mqContent>");
		sb.append("<mqStatus type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(mqStatus));
		sb.append("</mqStatus>");
		sb.append("<dbImpStatus_icr type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(dbImpStatus_icr));
		sb.append("</dbImpStatus_icr>");
		sb.append("<deExCount_icr type=\"int\" isArray=\"false\">");
		sb.append(ValueParser.getValue(deExCount_icr));
		sb.append("</deExCount_icr>");
		sb.append("<taskExCount_icr type=\"int\" isArray=\"false\">");
		sb.append(ValueParser.getValue(taskExCount_icr));
		sb.append("</taskExCount_icr>");
		sb.append("<dbImpExCount_icr type=\"int\" isArray=\"false\">");
		sb.append(ValueParser.getValue(dbImpExCount_icr));
		sb.append("</dbImpExCount_icr>");
		sb.append("<valibVer_icr type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(valibVer_icr));
		sb.append("</valibVer_icr>");
		sb.append("<dbBackStatus type=\"String\" isArray=\"false\">");
		sb.append(ValueParser.getValue(dbBackStatus));
		sb.append("</dbBackStatus>");
		sb.append("</CLASS>");
		return sb.toString();
	}

	public static ScanTargetVO_bak fromXML(Node node) {
		ScanTargetVO_bak aClass = new ScanTargetVO_bak();
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
				if ("entityCode".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setEntityCode(ValueParser.parseString(Value));
				}
				if ("dealerId".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDealerId(ValueParser.parseString(Value));
				}
				if ("hostName".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setHostName(ValueParser.parseString(Value));
				}
				if ("appVersion".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setAppVersion(ValueParser.parseString(Value));
				}
				if ("appUsable".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setAppUsable(ValueParser.parseString(Value));
				}
				if ("diskCTotal".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDiskCTotal(ValueParser.parseString(Value));
				}
				if ("diskDTotal".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDiskDTotal(ValueParser.parseString(Value));
				}
				if ("diskETotal".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDiskETotal(ValueParser.parseString(Value));
				}
				if ("diskFTotal".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDiskFTotal(ValueParser.parseString(Value));
				}
				if ("sysType".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setSysType(ValueParser.parseString(Value));
				}
				if ("memoryTotal".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setMemoryTotal(ValueParser.parseString(Value));
				}
				if ("diskCRate".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDiskCRate(ValueParser.parseString(Value));
				}
				if ("diskDRate".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDiskDRate(ValueParser.parseString(Value));
				}
				if ("diskERate".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDiskERate(ValueParser.parseString(Value));
				}
				if ("diskFRate".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDiskFRate(ValueParser.parseString(Value));
				}
				if ("memoryRate".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setMemoryRate(ValueParser.parseString(Value));
				}
				if ("temperature".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setTemperature(ValueParser.parseString(Value));
				}
				if ("humidty".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setHumidty(ValueParser.parseString(Value));
				}
				if ("isDoorClosed".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setIsDoorClosed(ValueParser.parseString(Value));
				}
				if ("isValiLibSucc".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setIsValiLibSucc(ValueParser.parseString(Value));
				}
				if ("ascDate".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setAscDate(ValueParser.parseString(Value));
				}
				if ("isDiskOnline".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setIsDiskOnline(ValueParser.parseString(Value));
				}
				if ("ip".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setIp(ValueParser.parseString(Value));
				}
				if ("oemIp".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setOemIp(ValueParser.parseString(Value));
				}
				if ("optType".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setOptType(ValueParser.parseString(Value));
				}
				if ("cpuRate".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setCpuRate(ValueParser.parseString(Value));
				}
				if ("mqContent".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setMqContent(ValueParser.parseString(Value));
				}
				if ("mqStatus".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setMqStatus(ValueParser.parseString(Value));
				}
				if ("dbImpStatus_icr".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDbImpStatus_icr(ValueParser.parseString(Value));
				}
				if ("deExCount_icr".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDeExCount_icr(ValueParser.parseInt(Value));
				}
				if ("taskExCount_icr".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDeExCount_icr(ValueParser.parseInt(Value));
				}
				if ("dbImpExCount_icr".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setDeExCount_icr(ValueParser.parseInt(Value));
				}
				if ("valibVer_icr".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setValibVer_icr(ValueParser.parseString(Value));
				}
				if ("dbBackStatus".equals(tempNode.getNodeName())
						|| "".equals(type)) {
					aClass.setValibVer_icr(ValueParser.parseString(Value));
				}
			}
		}

		return aClass;

	}
	
	public static ScanTargetVO_bak fromXML(String content) throws Exception{
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

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}
}
