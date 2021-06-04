package seleniumbasics2021;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.util.Properties;

public class GlobalProperties {

public static void main(String[] args) throws IOException {

	Properties prop=new Properties();
	
	FileInputStream fis =new FileInputStream("/Users/harsha/eclipse-workspace/SeleniumMastery2021/src/data.properties");
	
	prop.load(fis);
	
	System.out.println(prop.getProperty("browser"));
	
	System.out.println(prop.getProperty("url"));
	
	prop.setProperty("browser", "firefox");
	
	System.out.println(prop.getProperty("browser"));
	
	FileOutputStream fos =new FileOutputStream("C:\\Users\\Owner\\CoreJava\\CoreJava\\src\\data.properties");
	
	prop.store(fos, null);

}

}

