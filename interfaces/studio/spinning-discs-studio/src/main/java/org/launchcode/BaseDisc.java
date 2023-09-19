package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private Double storageCapacity;
    private Double storageAvailable;
    private Double storageUsed;
    private ArrayList<String> contents;
    private String type;


    public BaseDisc(String name, Double storageCapacity, Double storageUsed, String type) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.storageAvailable = storageCapacity - storageUsed;
        this.storageUsed = storageUsed;
        this.type = type;
    }



    public void writeData(Double dataSize){

        if(storageAvailable<dataSize){
            System.out.println("Data size too large!!!");
        }else{
            storageAvailable -= dataSize;
            storageUsed += dataSize;
            System.out.println("Success!!!  The current available storage is: " + storageAvailable + "MB's");
        }
    }

    public String getDiscInfo() {
        String output = String.format("\nDisk name: %s\nCapacity: %s MB" +
                "\nSpace used: %s MB" +
                "\nType: %s MB\n", name, storageCapacity, storageUsed, type );
        return output;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Double getStorageAvailable() {
        return storageAvailable;
    }

    public void setStorageAvailable(Double storageAvailable) {
        this.storageAvailable = storageAvailable;
    }

    public Double getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(Double storageUsed) {
        this.storageUsed = storageUsed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
