package com.company;

public class Main {

    public static void main(String[] args) {
        double costOfItem= 95;
        double totalCostOfItem= (costOfItem * .085) + costOfItem;
        if(totalCostOfItem < 50) {
            System.out.println("Go for it!");
        } else if (totalCostOfItem < 100) {
            System.out.println("Are you sure about this?");
        } else {
            System.out.println("I'm hiding your credit card.");
        }
    }

}
