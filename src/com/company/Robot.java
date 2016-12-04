package com.company;

/**
 * Created by vaio on 04/12/2016.
 */
public class Robot {

        private String Nom;
        private int x ;
        private int y ;
        private String Direction ;

        public Robot(){}

        public Robot (String Nom,int x,int y,String Direction)
        {
            this.Nom=Nom;
            this.x=x;
            this.y=y;
            this.Direction=Direction;
        }

        public Robot (String Nom)
        {
            this.Nom=Nom;
            this.x=0;
            this.y=0;
            this.Direction="East";
        }

        public void setDirection(String direction)
        {
            Direction = direction;
        }

        public void setNom(String nom)
        {
            Nom = nom;
        }

        public void setX(int x)
        {
            this.x = x;
        }

        public void setY(int y)
        {
            this.y = y;
        }

        public int getX()
        {
            return x;
        }

        public int getY()
        {
            return y;
        }

        public String getDirection()
        {
            return Direction;
        }

        public String getNom()
        {
            return Nom;
        }

        public void Avance()
        {
            switch(Direction)
            {
                case "East":{
                    x++;
                }break;
                case "Ouest":{
                    x--;
                }break;
                case "Nord":{
                    y++;
                }break;
                case "sud":{
                    y--;
                }break;
            }
        }

        public void Droit() {
            switch (Direction) {
                case "East": {
                    Direction = "Sud";
                }
                break;
                case "Ouest": {
                    Direction = "Nord";
                }
                break;
                case "Nord": {
                    Direction = "East";
                }
                break;
                case "sud": {
                    Direction = "Ouest";
                }
                break;
            }
        }

        public void Afficher()
        {
            System.out.println("---- le Robot  "+this.Nom+" \n position = ("+this.x+","+this.y+") \n direction =  "+this.Direction);
        }

    }
