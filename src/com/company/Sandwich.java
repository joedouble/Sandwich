package com.company;

public class Sandwich {

    private String breadType;
    private String proteinType;
    private String cheeseType;
    private boolean veggies;

    public void setBreadType(String bread){
        breadType = bread;
    }

    public String getBreadType(){
        return breadType;
    }

    public void setProteinType(String protein){
        proteinType = protein;
    }

    public String getProteinType(){
        return proteinType;
    }

    public void setCheeseType(String cheese){
        cheeseType = cheese;
    }

    public String getCheeseType(){
        return cheeseType;
    }

    public void setVeggies(boolean vegge){
        veggies = vegge;
    }

    public boolean getVeggies(){
        return  veggies;
    }

    public void describeSandwich(){
        System.out.println("Your sandwich is on " + breadType + ".\n" +
                "Your protein choice is " + proteinType + ".\n" +
                "Your cheese choice is " + cheeseType + ".\n" +
                "Your veggie choice is " + veggies + ".\n");
    }

    public Sandwich(){
        breadType = "Wheat";
        proteinType = "Chicken";
        cheeseType = "American";
        veggies = true;
    }

    public Sandwich(String bread, String protein, String cheese, boolean vegge){
        breadType = bread;
        proteinType = protein;
        cheeseType = cheese;
        veggies = vegge;
    }

    public Sandwich(String proteinType, String cheese, boolean vegge){
        this.breadType = "Whole Grain";
        this.proteinType = proteinType;
        cheeseType = cheese;
        veggies = vegge;
    }
}
