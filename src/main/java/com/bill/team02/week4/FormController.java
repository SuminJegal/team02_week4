package com.bill.team02.week4;

public class FormController {

    ClientAccountData clientAccountData;

    public FormController(String[] accountData) {
        clientAccountData = new ClientAccountData(accountData);
    }

    public void printClientBill() {
        System.out.println("=================================================");
        System.out.println("		Here is your Bill");
        System.out.println("-------------------------------------------------");
        System.out.println("              < Your Information >");
        System.out.println("Your Plan 			: " + clientAccountData.getPlan().getPlanName());
        System.out.println("Number of your member           : " + clientAccountData.getArrayLine().length);
        System.out.println("Your total used minutes         : " + clientAccountData.getTotalMinutes());
        System.out.println("-------------------------------------------------");
        System.out.println("           < Rate for used minutes >");
        System.out.println("Your basic monthly rate		: $" + clientAccountData.getPlan().getBasicRate());
        // System.out.println("Your additional minuter rate : $" +
        // additionalMinuterRate);
        System.out.println("-------------------------------------------------");
        System.out.println("Your total account rate		: $" + clientAccountData.calculateRate());
        System.out.println("=================================================");
    }
}
