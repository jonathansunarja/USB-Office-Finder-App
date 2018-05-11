package team23.officefinder;

import java.util.ArrayList;

public class Graph {

	private final ArrayList<Node> nodes;
	private final ArrayList<Edge> edges;
	
	public Graph(ArrayList<Node> nodes, ArrayList<Edge> edges){
		this.nodes = nodes;
		this.edges = edges;
	}
	
	
	public ArrayList<Node> getNodes() {
        return nodes;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }
	
}