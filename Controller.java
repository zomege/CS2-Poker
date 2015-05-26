import java.util.*;

public class Controller
{
   private static Deck deck;
   private static Hand hand1;//players hands
   private static Hand hand2;

   public static void main(String[] args){
      deck = new Deck();//creates deck and hand data types
      System.out.println(deck);
      hand1 = new Hand();
      hand2 = new Hand();

      dealHands(5);//fills both hands with 5 cards
      System.out.println(hand1);
      System.out.println(hand2);

      hand1.sortHand();//orders hand
      hand2.sortHand();
      System.out.println(hand1);
      System.out.println(hand2);

      System.out.println("Best Hand: " + hand1.handValue());//compares
      System.out.println("Best Hand: " + hand2.handValue());
      System.out.println(findWinner());
   }

   public static void dealHands(int x){
      	for(int i=0;i<x;i++){//adds x cards to both hands
			hand1.add(deck.remove());
			hand2.add(deck.remove());
		}
   }

   public static String findWinner(){
      int result = hand1.compareTo(hand2);
      if(result<0)
		return "Player 2 won!";
      if(result==0)
		return "Niether player won.";
	return "Player 1 won!";
   }
}
