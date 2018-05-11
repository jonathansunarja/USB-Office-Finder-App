package team23.officefinder;

public class Staff {
	
	private String firstName;
	private String lastName;
	private Node roomNumber;
	
	public Staff (String firstName, String lastName, Node roomNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.roomNumber = roomNumber;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public Node getRoomNumber(){
		return roomNumber;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setRoomNumber(Node roomNumber){
		this.roomNumber = roomNumber;
	}
	
}