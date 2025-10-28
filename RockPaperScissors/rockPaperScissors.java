package miniProjects;
import java.util.*;

//Rock Paper Scissors game v1
public class rockPaperScissors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		System.out.println("Rock Paper Scissors Game\n");
		
		while(true) {
		
			System.out.print("Enter rock, paper, or scissors:  ");
			
			String playerMove=sc.nextLine().toLowerCase().trim();
			
			if(playerMove.equals("r")) {
				System.out.println("You entered: rock");
				playerMove="rock";
			}else if(playerMove.equals("p")){
				System.out.println("You entered: paper");
				playerMove="paper";
			}else if(playerMove.equals("s")){
				System.out.println("You entered: scissors");
				playerMove="scissors";
			}else {
				if(!(playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors"))) {
					System.out.println("Invalid choice! Please enter rock, paper, or scissors.\n");
					continue;
				}
			}
			
			int computerMove=random.nextInt(3);
			//O=rock 1=paper 2=scissors
			
			switch (computerMove) {
				case 0:
					if(playerMove.equals("scissors")){
						System.out.println("Computer chose: rock");
						System.out.println("You have lost!");
					}else if(playerMove.equals("rock")) {
						System.out.println("Computer chose: rock");
						System.out.println("Tied!");
						
					}
					break;
					
				case 1:
					if (playerMove.equals("rock")){
						System.out.println("Computer chose: paper");
						System.out.println("You have lost!");
					}else if(playerMove.equals("paper")) {
						System.out.println("Computer chose: paper");
						System.out.println("Tied!");
					}
					break;
				
				case 2:
					if (playerMove.equals("paper")){
						System.out.println("Computer chose: scissors");
						System.out.println("You have lost!");
					}else if(playerMove.equals("scissors")) {
						System.out.println("Computer chose: scissors");
						System.out.println("Tied!");
					}
					break;
		
					}
		
			System.out.print("Play again? (y/n): ");
			String playerChoice=sc.nextLine().toLowerCase().trim();
			if(playerChoice.equals("n") || playerChoice.equals("no")) {
				System.out.println("Thanks for playing!");
				break;
			}
			System.out.println();
		}
		sc.close();
	}
		
}
