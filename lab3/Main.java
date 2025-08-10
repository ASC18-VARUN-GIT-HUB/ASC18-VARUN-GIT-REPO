package com.demo.lab3;

public class Main {
    public static void main(String[] args) {
//        Throw error
//        Movie m1=new Movie("","","rajmouli",2.5,2019,"action");

        Movie m1=new Movie("Bahubali","Prabhas","rajmouli",2.5,2019,"action");
        m1.getMovieId();
        m1.showDetails();
        SpecialMovie s1=new SpecialMovie("Avaatar","ME","Dinosor", 4,2023 ,"Animation","Dolby audio","3D");
        s1.getMovieId();
        s1.showDetails();
        s1.splShowDetails();
        InternationalMovie i1=new InternationalMovie("Train to Busan","Harsh","Kappi",3,2016,"Thriller","Japan","Japanese");
        i1.getMovieId();
        i1.showDetails();
        i1.IntShowDetails();

    }
}
