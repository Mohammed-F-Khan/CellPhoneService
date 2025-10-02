package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

        //serial number
        System.out.print("What is the serial number?: ");
        int sn = scanner.nextInt();
        scanner.nextLine();

        myPhone.setSerialNumber(sn);

        //model
        System.out.print("What is the model?: ");
        String model = scanner.nextLine();

        myPhone.setModel(model);

        //carrier
        System.out.print("What is the carrier?: ");
        String carrier = scanner.nextLine();

        myPhone.setCarrier(carrier);

        //phone number
        System.out.print("What is the phone number?: ");
        String phoneNumber = scanner.nextLine();

        myPhone.setPhoneNumber(phoneNumber);

        //owner
        System.out.print("What is the owner?: ");
        String owner = scanner.nextLine();

        myPhone.setOwner(owner);

        //display it:
        display(myPhone);


        myPhone.dial("555-555-5555");


        CellPhone yourPhone = new CellPhone(12345
                , "pixel"
                , "fi"
                , "888-888-8888"
                , "Hignacio");

        myPhone.dial(yourPhone);


        yourPhone.dial(myPhone);
    }

    private static void display(CellPhone phone){
        System.out.println("-------------------");
        System.out.println("CELL PHONE [SN:" + phone.getSerialNumber() + "]");
        System.out.println("  Owner:  " + phone.getOwner());
        System.out.println("  Model:  " + phone.getModel());
        System.out.println("  Number: " + phone.getPhoneNumber());
    }

}