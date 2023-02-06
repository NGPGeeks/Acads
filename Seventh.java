public class Seventh{
	public static void main(String[] args){
		String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		int rnum = (int)(Math.random()*13);
		int snum = (int)(Math.random()*4);
		
		System.out.println("The card you picked is "+rank[rnum]+" of "+suit[snum]);
	}
	
}