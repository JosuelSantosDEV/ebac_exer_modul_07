package com.example;

public class Main {
    public static void main(String[] args) {
        FootballPlayer player = new FootballPlayer("FC Barcelona", "ATA");
        player.setGer(88);
        player.setNumber(9);
        //player.increaseAndDecrementNumber(-1); 
        player.changeNumber(-1);
        System.out.println("Team: " + player.getTeam() + " - Posi: " + player.getPosition() +
                " - Number: "+ player.getNumber() + " - GER: " + player.getGer());
    }
}