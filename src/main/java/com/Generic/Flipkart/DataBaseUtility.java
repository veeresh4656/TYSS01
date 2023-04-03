package com.Generic.Flipkart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
public Connection con=null;
	public void connectToDataBase() throws Throwable {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(IPathConstants.DBURL,IPathConstants.DBUSERNAME,IPathConstants.DBPASSWORD);
		}
	
	public void disconnectFromDataBase() throws Throwable {
		con.close();
	}
	
}
