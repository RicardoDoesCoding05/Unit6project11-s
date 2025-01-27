import java.util.list;
import java.util.ArrayList;

public class Deck
{
    // instance variables - replace the example below with your own
    private int<card> cards;
    private int size;

    /**
     * Constructor for objects of class Deck
     */
    public Deck(String[] ranks, String[] suits, int[] values)
    {
        cards = new ArrayList<Card>();
        for(int i= 0; i< suite.length; i++)
        {
            for(int j = 0; j<ranks.length; j++)
            {
                cards.add(new Card(ranks[j], suite[i], values[j]));
            }
        }
        this.size = cards.size();
        shuffle();
    }

    
    public boolean isEmpty()
    {
        if(cards.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int size()
    {
        return size;
    }
    
    public void shuffle()
    {
        for(int k = size - 1; k >= 1; k--){
            int r = ((int) Math.random()) * (k + 1);
            Card temp = cards.get(r);
            cards.set(r, cards.get(k));
            cards.set(k, temp);
        }
        
    }
    
    public Card deal(){
        if(size == 0)
        {
            return null;
        }
        else{
            size--;
            return cards.get(size);
        }
        
    }
    
    public String toString(){
        for(int k = size - 1; k == 0; k--){
            rtn = rtn + cards.get(k);
            if(k!=0){
                rtn = rtn + ", ";
            }
            if((size - k) % 2 == 0){
                rtn = rtn + "\n";
            }
        }
        
        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - i; k == size; k--)
        {
            rtn = rtn + cards.get(k);
            if(k != size){
                rtn = rtn + "\nDealt cards: \n";
            }
        }
    }
}
