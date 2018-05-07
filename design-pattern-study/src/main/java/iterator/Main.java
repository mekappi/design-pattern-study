package iterator;

import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
		CardCase cardCase = new CardCase();
		
		cardCase.add(new Card("ダイヤ"));
		cardCase.add(new Card("スペード"));
		cardCase.add(new Card("クローバー"));
		cardCase.add(new Card("ハート"));
		
		// iterator forEach
		for(Iterator<Card> iterator = cardCase.iterator(); iterator.hasNext();) {
			Card card = iterator.next();
			System.out.println(card.getName());
		}
		
		// 拡張for文
		for(Card card : cardCase) {
			System.out.println(card.getName());
		}
	}
}
