package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.project.ProjectApp; 


public class AppTest {
	
	@Test
	public void testlogin1(){
		ProjectApp myapp = new ProjectApp();
		Assert.assertEquals(1,myapp.userLogin("cse","cse@2024"));
	}
	
	@Test
	public void testlogin2(){
		ProjectApp myapp = new ProjectApp();
		Assert.assertEquals(0,myapp.userLogin("abc","def@2024")); 
	} 
}
