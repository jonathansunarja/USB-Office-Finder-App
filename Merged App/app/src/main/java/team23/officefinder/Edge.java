package team23.officefinder;

public class Edge {

	private String id;
	private Node source;
	private Node destination;
	private int weighting;
	private String direction;

	public Edge(String id, Node source, Node destination, int weighting){
		this(id, source, destination, weighting, "");

	}

	public Edge(String id, Node source, Node destination) {
		this(id, source, destination, 1, "");
	}

	public Edge(String id, Node source, Node destination, String direction){
		this(id, source, destination, 1, direction);
	}

	public Edge(String id, Node source, Node destination, int weighting, String direction){

		this.id = id;
		this.source = source;
		this.destination = destination;
		this.weighting = weighting;
		this.direction = direction;
		Generator.allEdges.add(this);
	}



	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	// ---


	public Node getSource() {
		return source;
	}


	public void setSource(Node source) {
		this.source = source;
	}

	// ---


	public Node getDestination() {
		return destination;
	}


	public void setDestination(Node destination) {
		this.destination = destination;
	}

	// ---


	public int getWeighting() {
		return weighting;
	}


	public void setWeighting(int weighting) {
		this.weighting = weighting;
	}

	public String getDirection(){
		return direction;
	}


}