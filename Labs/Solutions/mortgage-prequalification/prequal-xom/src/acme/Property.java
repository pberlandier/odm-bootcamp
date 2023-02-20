package acme;

public class Property {
	private String state;
	private String occupancyType;
	private int value;
	//
	// Accessors
	//
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOccupancyType() {
		return occupancyType;
	}
	public void setOccupancyType(String occupancyType) {
		this.occupancyType = occupancyType;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}	
}
