package com.seleniumtest;

import java.io.IOException;



public class Wrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WrapperMethods wm = new WrapperMethods();
		  
		  wm.insertapp1("https://www.flipkart.com/");
		  
		  wm.enterbyid1();
		  
		  wm.clickbyId1();
		  //wm.click();//
		  wm.click1();

	}

}
