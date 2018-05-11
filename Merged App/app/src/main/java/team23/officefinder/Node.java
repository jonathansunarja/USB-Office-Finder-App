package team23.officefinder;

import java.util.ArrayList;

public class Node {
	
	private String roomNumber; // e.g. 2.006
	private String type; // office, lecture theatre, stairs, teaching room?
	private String location; // e.g. A1,B3
	private ArrayList<Node> connectedTo; // can be accessed through another node
	private ArrayList<Staff> staff; // list of staff members working here
	private int level; // which level is it on
	private boolean hasPrivileges; // true - only staff can access | false - everyone can access
	
	public Node(String roomNumber, String type, String location, ArrayList<Node> connectedTo, ArrayList<Staff> staff, int level, boolean hasPrivileges){
		this.roomNumber = roomNumber;
		this.type = type;
		this.location = location;
		this.connectedTo = connectedTo;
		this.staff = staff;
		this.level = level;
		this.hasPrivileges = hasPrivileges;
		Generator.allNodes.add(this);
		
	}

	// get/set methods
	
	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	// --- 
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// --- 
	
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	// --- 


	public ArrayList<Node> getConnectedTo() {
		return connectedTo;
	}

	public void setConnectedTo(ArrayList<Node> connectedTo) {
		this.connectedTo = connectedTo;
	}
	
	// --- 


	public ArrayList<Staff> getStaff() {
		return staff;
	}

	public void setStaff(ArrayList<Staff> staff) {
		this.staff = staff;
	}
	
	// --- 

	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	// --- 
	
	public boolean isHasPrivileges() {
		return hasPrivileges;
	}

	public void setHasPrivileges(boolean hasPrivileges) {
		this.hasPrivileges = hasPrivileges;
	}
	
	
}
