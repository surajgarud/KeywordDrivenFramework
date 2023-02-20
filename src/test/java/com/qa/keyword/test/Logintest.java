package com.qa.keyword.test;

import org.testng.annotations.Test;

import com.qa.keyword.engine.KeywordEngine;

public class Logintest {

public KeywordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeywordEngine();
		keyWordEngine.startExecution("Sheet1");
	}
	
//	@Test
//	public void signUpTest(){
//		keyWordEngine = new KeywordEngine();
//		keyWordEngine.startExecution("signup");
//	}
}
