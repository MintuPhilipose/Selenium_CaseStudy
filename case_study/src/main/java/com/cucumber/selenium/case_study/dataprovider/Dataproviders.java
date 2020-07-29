package com.cucumber.selenium.case_study.dataprovider;

import org.testng.annotations.DataProvider;
import com.cucumber.selenium.case_study.excelfunc.*;
//import com.training.readexcel.ApachePOIExcelRead;
//import com.training.readexcel.ReadExcel;

public class Dataproviders {
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:/Users/MintuPhilipose/Desktop/DataFile/DataInput_Selenium.xls"; 
		return new ReadExcel().getExcelData(fileName, "Sheet1"); 
	
}
}
