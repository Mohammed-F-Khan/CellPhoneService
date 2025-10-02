package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber(){
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber){
        //this line of code...
        this.serialNumber = serialNumber;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getCarrier(){
        return this.carrier;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void dial(String phoneNumberToCall){
        System.out.println(owner + "'s Phone (" + phoneNumber + ") is calling " + phoneNumberToCall);
        System.out.println("Ring!");
        System.out.println("Ring!");
        System.out.println("Ring!");
    }

    public void dial(CellPhone phone){
        dial(phone.getPhoneNumber());
    }


}