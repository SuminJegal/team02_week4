package com.bill.team02.week4;

import java.io.IOException;

public class AppController {

	private AppView appView;
	private FormController formController;
	
	public AppController() {
		this.appView = new AppView();
	}
	
	public void run() {
        String[] accountData;
		try {
			accountData = this.appView.scanFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		formController = new FormController(accountData);
	}
}
