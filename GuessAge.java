// Angela Wong
// 10/7/16
// Guesses your age.
// Guessing trick credit: Magic Murray Youtube Channel
//                        url: https://www.youtube.com/watch?v=-ENkHDxiAgQ

import java.util.Scanner;

class GuessAge{
	public static void main(String[] args){
		int number, number1, multtwo, addfive, multfifty, addseventeen, yearborn;
		Scanner sc = new Scanner(System.in);
		System.out.println("The following is a guessing game.");
		System.out.println("Assuming calculations are done accurately,"); 
		System.out.println("I will be able to guess your age at the end of the game.");
		System.out.print("Enter a number from 1 to 10: ");
		while(true){
			// check if input is a number
			while(!sc.hasNextInt()){
				sc.next();
				System.out.print("Please enter a number from 1 to 10: ");
			}
			number = sc.nextInt();
			// check if input is from 1 to 10
			if(number>=1 && number<=10){
				break;
			}else{
				System.out.print("Please enter a number from 1 to 10: ");
			}
		}
		System.out.println("Your number is " + number + ".");
		System.out.println("Multiply your number by 2.");
		System.out.print("Enter your number after calculation: ");
		multtwo = sc.nextInt();
		System.out.println("Your number is " + multtwo + ".");
		System.out.println("Add 5 to your number.");
		System.out.print("Enter your number after calculation: ");
    		addfive = sc.nextInt();
		System.out.println("Your number is " + addfive + ".");
    		System.out.println("Multiply your number by 50.");
    		System.out.print("Enter your number after calculation: ");
    		multfifty = sc.nextInt();
    		System.out.println("Your number is " + multfifty + ".");
    		System.out.println("If you had your birthday this year, add 1766. If not, add 1765.");
    		System.out.print("Enter your number after calculation: ");
    		addseventeen = sc.nextInt();
    		System.out.println("Your number is " + addseventeen + ".");
    		System.out.println("Subtract the year you were born from your number.");
    		System.out.print("Enter your number after calculation: ");
    		yearborn = sc.nextInt();
    		System.out.println("Now you have a three-digit number: " + yearborn + ".");
    		System.out.println("Assuming calculations were done accurately:");
    		System.out.println("The first digit is the number you chose at the beginning.");
    		System.out.println("The other two numbers is your age.");
	}
}
