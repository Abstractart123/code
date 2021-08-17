package unit7;
import card.Card;
import java.util.Random;
public class Deck 
{
	//declare instance data
	Card deck[] = new Card[52];
	Random rand = new Random();
	
	//constructor method
	public Deck()
	{
		//instantiate all 52 cards
		for(int i = 0; i < 52; i++)
		{
			deck[i] = new Card(i);
		}
	}
	
	//random card
	public Card randomCard()
	{
		return deck[rand.nextInt(52)];
	}
	
	//shuffle
	public void shuffle()
	{
		Card temp;
		//loop through deck
		for(int i = 0; i < 52; i++)
		{
			int swap = rand.nextInt(52);
			temp = deck[i];
			deck[i] = deck[swap];
			deck[swap] = temp;
		}
	}
	
	//toString
	public String toString()
	{
		String cards = "";
		for (int i = 0; i < 52; i++)
		{
			cards += deck[i].value + " of " + deck[i].suit +"\n";
		}
		return cards;
	}
	
}