package com.calc.Main;

import com.calc.Module.MyModule;
import com.calc.Request.Request;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new MyModule());
		Request request = injector.getInstance(Request.class);
		request.makeRequest();
	}

}
