import java.util.*;

public class Fifth{
	public static void main(String[] args){
		int ch;
		String[] game = {"scissor", "rock", "paper"};

		int computer = (int)(Math.random()*3);
		Scanner sc = new Scanner(System.in);
		System.out.println("scissor(0), rock(1), paper(2): ");
		ch = sc.nextInt();
		
		System.out.print("The computer is "+game[computer]+". You are "+game[ch]);
		if(ch==computer){
			System.out.println(". It is draw.");
		}
		else if((computer==0 && ch==1) || (computer==1 && ch==2) || (computer==2 && ch==0)){
			System.out.println(". You won");
		}
		else{
			System.out.println(". You lose");
		}
			
		
	}
}









