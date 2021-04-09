package edu.wctc.pocker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Deck deck = new Deck();
        List<Card> hand = new ArrayList<Card>();
        Poker poker = new Poker();
        hand.add(deck.getCard(4));
        hand.add(deck.getCard(5));
        hand.add(deck.getCard(6));
        hand.add(deck.getCard(7));
        hand.add(deck.getCard(8));
        for (Card card : hand) {
            System.out.println(card);
        }

        System.out.println(poker.isStraight(hand));
        System.out.println(poker.isStraightFlush(hand));
        System.out.println(poker.isRoyalFlush(hand));
        System.out.println(poker.isFlush(hand));
        System.out.println(poker.isHighCard(hand));
    }
}
