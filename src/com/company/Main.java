package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // object is lowercase
	    Burrito burrito1 = new Burrito();
	    burrito1.setRice("White rice");
	    burrito1.setBeans("Black beans");
	    burrito1.setMeat("Chicken");
	    burrito1.setSalsa("Hot salsa");
	    burrito1.setVeggies("Fajitas");

        System.out.println("Burrito 1: " + burrito1.getRice() + burrito1.getBeans() + burrito1.getMeat()
                + burrito1.getSalsa() + burrito1.getVeggies());

        burrito1.display(1);

        // this is how you initialize an arraylist of the burrito class
		ArrayList<Burrito> burritos = new ArrayList<>();

		// initialize an array of the burrito class (size 25)
		Burrito[] burritos1 = new Burrito[25];
    }
}
