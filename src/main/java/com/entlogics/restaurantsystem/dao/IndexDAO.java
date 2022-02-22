package com.entlogics.restaurantsystem.dao;

import org.springframework.stereotype.Component;

@Component
public class IndexDAO implements IIndexDAO{
	
	//create a method to return a test string from the dao
	@Override
	public String testFlow() {
		
		return "Inside Index DAO testFlow():::";
	}
}
