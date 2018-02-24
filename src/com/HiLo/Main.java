package com.HiLo;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userNumber=0;
        String playAgain= "";

	// Generating random numbers
        int randNumber = (int)(Math.random()*100+1);

        Scanner scan = new Scanner(System.in);



        System.out.println(userNumber+ " "+randNumber);

        do
        {
            while(userNumber != randNumber || userNumber == 101) {
                //Requiring user guess
                System.out.println("Guess a  number between 1 and 100: ");
                userNumber = scan.nextInt();

                System.out.println("You enter: " + userNumber + ".");

                //Comparing user guess and random number
                if (userNumber > randNumber) {
                    System.out.println(userNumber + " is too High. Try again!");
                } else if (userNumber < randNumber) {
                    System.out.println(userNumber + " is too Low. Try again!");
                } else {
                    System.out.println("CORRECT!");

                }
            }

            //Restarting userNumber
            userNumber = 0;

            //Ask if player wan to play again
            System.out.println("Would like to play again (y/n)? ");

            playAgain = scan.next();

        }while(playAgain.equalsIgnoreCase("y"));

    }
}
