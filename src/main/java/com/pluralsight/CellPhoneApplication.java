package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

        System.out.print("What is the serial number?: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        myPhone.setSerialNumber(serialNumber);

        System.out.print("What is the model?: ");
        String model = scanner.nextLine();

        myPhone.setModel(model);

        System.out.print("What is the carrier?: ");
        String carrier = scanner.nextLine();

        myPhone.setModel(carrier);

        System.out.print("What is the phone number?: ");
        String phoneNumber = scanner.nextLine();

        myPhone.setModel(phoneNumber);

        System.out.print("What is the owner?: ");
        String owner = scanner.nextLine();

        myPhone.setOwner(owner);

        myPhone.dial("555-555-5555");

        CellPhone yourPhone = new CellPhone(12345,"pixel","f1","888-888-8888","Hignacio" );

        myPhone.dial(yourPhone);

        yourPhone.dial(myPhone);
    }

    private static void display(CellPhone phone){
        System.out.println("-------------------------");
        System.out.println("CELL PHONE [SN:" + phone.getSerialNumber() + "]");
        System.out.println("  Owner:  " + phone.getOwner());
        System.out.println("  Model  " + phone.getOwner());
        System.out.println(" Number  " + phone.getPhoneNumber());
    }
}
