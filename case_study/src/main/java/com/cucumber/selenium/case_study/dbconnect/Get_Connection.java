package com.cucumber.selenium.case_study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.cucumber.selenium.case_study.bean.Db_bean;

public class Get_Connection {
	public static Connection connection; 
	public PreparedStatement ps1, ps2; 
	public ResultSet rs1, rs2; 
	
	public  Connection getMySqlConnection(Db_bean dbBean) {
		
		try {
			// load
			
			Class.forName(dbBean.getDriver());
			
			connection = DriverManager.getConnection(dbBean.getUrl() , 
					dbBean.getUserName(), dbBean.getPassword());
			
			return connection; 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	
	public  void insertqueryexectute(String query) throws SQLException

	{ 
		
	  ps1=connection.prepareStatement(query);
	  ps1.executeUpdate();
	  
	 
	  
     		
	}
	
	public  List<String> selectqueryexectute(String query) throws SQLException

	{ List<String> l1= new ArrayList<String>();
		
	  ps1=connection.prepareStatement(query);
	  rs1=ps1.executeQuery();
	  while(rs1.next())
	  {System.out.println(rs1.getString(1).toString());
		 l1.add(rs1.getString(1).toString());
	  }	
	  
	  return l1;
	  
	}
	
	
	
	
	

}
