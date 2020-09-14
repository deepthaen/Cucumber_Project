package com.cucumberFramework.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
/**
 * 
 * @author VIkas Kumar
 *
 */
public class LoggerHelper {

	private static boolean root=false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}
	
	public static void main(String[] args) {
		Logger log = LoggerHelper.getLogger(LoggerHelper.class);
		log.info("I am test");
		log.info("I am test");
		log.info("I am test");
		Logger log2 = LoggerHelper.getLogger(LoggerHelper.class);
		log2.info("I am test");
		log2.info("I am test");
				
	}
}
