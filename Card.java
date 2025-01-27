public class card
{
    // instance variables - replace the example below with your own
    private String suit;
    private String rank;
    private int pointValue;

    /**
     * Constructor for objects of class elevens
     */
    public card(String cardRank, String cardSuit, int cardPointValue)
    {
        this.rank = cardRank;
        this.suit = cardSuit;
        this.pointValue = cardPointValue;
    }

    
    public String suit()
    {
        // put your code here
        return suit;
    }
    
    public String rank()
    {
        return rank;
    }
    
    public int pointValue()
    {
        return pointValue;
    }
    
    public boolean matches(card otherCard)
    {
        if(rank.compareTo(otherCard.rank()) == 0 && suit.compareTo(otherCard.suit()) == 0 && pointValue == otherCard.pointValue())
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString()
    {
        String format = rank + " of " + suit + "(point value + " + pointValue + ")";
        return format;
    }
}
    
