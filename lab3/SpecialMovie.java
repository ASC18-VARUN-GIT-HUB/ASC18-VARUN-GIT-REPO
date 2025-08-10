package com.demo.lab3;

public class SpecialMovie extends Movie {
    private String soundEffects;
    private String visualEffects;

//    Mandatory Constructor
    public SpecialMovie(String moviename,String producedBy,String directedBy,int duration,int year,String category,String soundEffects,String visualEffects){
        super(moviename,producedBy,directedBy,duration,year,category);
//        check for null
        if(moviename=="" || producedBy==""){
            throw new IllegalArgumentException("Movie Name and Produced By cant be Null");
        }
        this.soundEffects=soundEffects;
        this.visualEffects=visualEffects;

    }

    public void splShowDetails() {
        System.out.println("Sound Effects :"+soundEffects+"\n"+"Visual Effects :"+visualEffects);
    }


}
