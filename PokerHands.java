package unit7;
import card.Card;
public class PokerHands 
{
	public static void main(String args [])
	{
		Card hand1[] = new Card[5];
		Card hand2[] = new Card[5];
		Deck d = new Deck();
		d.shuffle();
		hand1[0] = d.deck[0];
		hand1[1] = d.deck[2];
		hand1[2] = d.deck[4];
		hand1[3] = d.deck[6];
		hand1[4] = d.deck[8];
		
		hand1[0] = d.deck[1];
		hand1[1] = d.deck[3];
		hand1[2] = d.deck[5];
		hand1[3] = d.deck[7];
		hand1[4] = d.deck[9];
		
		System.out.println("Player 1 Hand: ");
		printHand(hand1);	
		
		System.out.println("\n\n Player 2 Hand: ");
		printHand(hand2);	
	}
	
	public static void printHand(Card arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "   ");
		}
	}
	

}
