package iterator;

import java.util.Iterator;

public class ConcreteIterator implements Iterator<Card>{
	
	private CardCase cardCase;
	private int index;
	
	public ConcreteIterator(CardCase cardCase) {
		this.cardCase = cardCase;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		return this.index < this.cardCase.getLength();
	}

	@Override
	public Card next() {
		return this.cardCase.get(this.index++);
	}

}
