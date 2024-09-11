package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Starting Amount: ");
		double startAmount = in.nextDouble();
		
		System.out.println("Winning chances: ");
		double winChance = in.nextDouble();
		
		System.out.println("Limit: ");
		double winLimit = in.nextDouble();
		
		System.out.println("Total Simulations: ");
		int totalSimulations = in.nextInt();
		
		int count = 0;
		int numberofGames = 0;
		int Win = 0;
		int Lose = 0;
		

		while(startAmount <= winLimit && startAmount > 0 && count <= totalSimulations) {
			if(Math.random() < winChance) {
				Win++;
				startAmount++;
			} else {
				Lose++;
				startAmount = startAmount - 1;
			}
			count++;
			
			
		}
		if(startAmount > 0) {
			System.out.println("Simulation " + count + numberofGames + "WIN");
		} else {
			System.out.println("Simulation " + count + numberofGames + "LOSE");
		}
		
	}

}
