package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardCase implements Iterable<Card>{
	
	private List<Card> cards;
	
	
	public CardCase() {
		this.cards = new ArrayList<>();
	}
	
	public int getLength() {
		return cards.size();
	}

	public void add(Card card) {
		cards.add(card);
	}
	
	public Card get(int index) {
		return cards.get(index);
	}
	
	@Override
	public Iterator<Card> iterator() {
		return new ConcreteIterator(this);
	}
	
	
}
