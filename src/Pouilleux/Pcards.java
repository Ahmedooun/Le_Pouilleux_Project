package Pouilleux;

public class Pcards {
	
	enum Item
	{
		Hearts, Tiles, Clubs, Spades;
		
		private static final Item[] items = Item.values();
		public static Item getItems(int i) {
			return Item.items[i];
		}
	}
	
	enum Value
	{
		One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Queen, Jack, King;
		
		private static final Value[] values = Value.values();
		public static Value getValue(int i) {
			return Value.values[i];
		}
	}
	
	private final Item item;
	private final Value value;
	
	public Pcards(final Item item, final Value value) {
		this.item = item;
		this.value = value;
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public Value getValue() {
		return this.value;
	}
	
	public String toString() {
		return item + "_" + value;
	}
}
