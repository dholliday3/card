public class Dealer {

    public static void main(String[] args) {
        Card c = new Card(Rank.QUEEN, Suit.HEARTS);
        System.out.println(c);
        c.setRank(Rank.JACK); // modifying c
        System.out.println(c);
    }
}
