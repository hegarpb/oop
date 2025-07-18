package com.java.oop.latihan1;

    // class player
    class Player{
        String name;
        double hp;
        int level;
        
        // object member (has a)
        Weapon weapon ;
        Armor armor;
        
        Player (String name,double hp){
            this.name=name;
            this.hp=hp;
        }
        void equipWeapon(Weapon weapon){
            this.weapon=weapon;
        }
        void equipArmor(Armor armor){
            this.armor=armor;
        }
        void display(){
            System.out.println("Name : "+this.name);
            System.out.println("Healt : "+this.hp);
            this.weapon.display();
            this.armor.display();

        }
    }

    class Weapon{
        double attackPower;
        String name;
        Weapon(String name,double attackPower){
            this.name=name; 
            this.attackPower=attackPower;
        }
        void display(){
            System.out.println("Weapon: "+this.name+" , attack : "+this.attackPower);
        }
    }


    class Armor{
        double defencePower;
        String name;

        Armor(String name,double defencePower){
            this.name=name;
            this.defencePower=defencePower;
        }
        void display(){
            System.out.println("Armor: "+this.name+" , defence : "+this.defencePower);
        }
    }

public class latihan {    

    public static void main(String[] args) {
        
        Player player1= new Player("ucup",100);
        Player player2= new Player("Otong",10);
        Weapon panah = new Weapon("panah",10);
        Weapon pedang =new Weapon("pedang",15);
        Armor antiquiras=new Armor("Antiquiras",10);
        Armor bladearmor=new Armor("Blade Armor",5);

        player1.equipWeapon(pedang);
        player1.equipArmor(antiquiras);
        player1.display();
        player2.equipWeapon(panah);
        player2.equipArmor(bladearmor);
        player2.display();

    }

    
}
