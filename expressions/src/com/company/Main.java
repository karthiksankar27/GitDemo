package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int score = 100;
        int levelcompleted = 3;
        int bonus = 10;
        boolean gameover = true;
        if (gameover) {
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("the final score is" + " " + finalscore);
        }
        score=100;
        levelcompleted=8;
        bonus = 100;
        if(gameover){
            int finalscore = score + (levelcompleted * bonus);
            System.out.println(finalscore);
        }

    }
}

