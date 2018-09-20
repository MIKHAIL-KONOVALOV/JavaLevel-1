/**
 * Java Level 1. Lesson 3. Homework.
 * @author Mihail Konovalov
 * @version 20.09.2018
*/
import java.util.Random;
import java.util.Scanner;
public class HomeWork3_1 {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);
		int ans = 1;
		do {
			int cpuNumb = rnd.nextInt(10);
			System.out.println("I made a number from 1 to 9. You have 3 trys.");
			for (int countTrys = 1; countTrys <= 3; countTrys++) {
				System.out.println("Enter number: ");
				int a = scn.nextInt();
				if ( a < cpuNumb) {
					System.out.println("Your number is less than mine.");
				} else if (a > cpuNumb) {
					System.out.println("Your number is more than mine");
				} else {
					System.out.println("Congratulations!");
					break;
				}	
			}
			System.out.println("Play Again? 1 - Yes 0 - No");
			ans = scn.nextInt();
		} while (ans != 0);
	}
}