package iterator;

import lombok.Data;

@Data
public class Card {

	private String name;
	
	public Card(String name) {
		this.name = name;
	}
		
}
