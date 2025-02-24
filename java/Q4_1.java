/*
Author: Brighton Dutson
Date: 02/24/25

Sample input/output:
	distance = 100,  cost = $5.00
	distance = 500,  cost = $8.00
	distance = 550,  cost = $10.00
	distance = 1000, cost = $12.00
*/
class Q4_1 {
	public static void main(String[] args) {
		int distance = 100;
		float cost = 0;
		if(distance<0){
			cost = 0;
		}else if(distance >= 0 && distance <= 100){
			cost = 5;
		}else if(distance > 100 && distance <= 500){
			cost = 8;
		}else if(distance > 500 && distance < 1000){
			cost = 10;
		}else{
			cost = 12;
		}
		// Insert your code here
		// Each if statement is worth 2 pts
		
		
		// Turn this print statement into a printf statement
		// Distance should be printed without any trailing zeroes
		// Cost should be printed with 2 trailing zeroes
		// The printf statement is worth 2 pts
		System.out.printf("For the package to travel " + distance + " miles it would cost $" + cost + "0");
	}
}