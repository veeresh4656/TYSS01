package com.Generic.Flipkart;

import java.io.FileInputStream;

import java.util.Properties;



public class FileUtility {

	public String readPropertyFile(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Flipkart.property");
	Properties p = new	Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
	
	}

}
