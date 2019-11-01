package com.company;

public class Burrito {
    private String rice;
    private String beans;
    private String meat;
    private String veggies;
    private String salsa;

    // default constructor
    public Burrito() {
    }

    // overloaded constructor
    public Burrito(String rice, String beans, String meat, String veggies, String salsa) {
        this.rice = rice;
        this.beans = beans;
        this.meat = meat;
        this.veggies = veggies;
        this.salsa = salsa;
    }
    
    // public encapsulation
    // geter
    public String getRice(){
        return this.rice;
    }
    
    // setter
    public void setRice(String rice){
        this.rice = rice;
    }
    
    public String getBeans(){
        return this.beans;
    }
    
    public void setBeans(String beans){
        this.beans = beans;
    }
    
    public String getMeat(){
        return this.meat;
    }
    
    public void setMeat(String meat){
        this.meat = meat;
    }

    public String getVeggies(){
        return this.veggies;
    }

    public void setVeggies(String veggies){
        this.veggies = veggies;
    }

    public String getSalsa(){
        return this.salsa;
    }

    public void setSalsa(String salsa){
        this.salsa = salsa;
    }

    //if you need a number of the burrito just pass in int x
    public void display(int x){
        System.out.println("Burrito " + x + ": " + rice + ", " + beans + ", " + meat + ", " + salsa + ", " + veggies + ".");
    }


}
