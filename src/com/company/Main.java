package com.company;

public class Main {

    public static void main(String[] args) {

        Robot Ciné[] = new Robot [5];

        Ciné[0] = new Robot("R2-D2");
        Ciné[1] = new Robot("Sentinelle",10,44,"Nord");

        Ciné[2] = new RobotNG("Optimus Prime",12,19,"Ouest");
        Ciné[3] = new RobotNG("Wall-E " );


        for (int i=0;i<4;i++)
        {
            Ciné[i].Afficher();
        }
    }
}

