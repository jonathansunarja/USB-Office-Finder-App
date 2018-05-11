package team23.officefinder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class RouteFinder {
	private ArrayList<Node> nodes;
	private ArrayList<Edge> edges;
	private HashMap<String, Node> maps;
	private ArrayList<String> directionsList = new ArrayList<String>();
	private ArrayList<String> typeList = new ArrayList<String>();
	private ArrayList<Integer> floorList = new ArrayList<Integer>();
	private boolean takeLift = false;

	public void setTakeLift(boolean takeLift){
		this.takeLift = takeLift;
	}

	public void FindRoute(String source, String destination, boolean takeLift) {
		this.takeLift = takeLift;
		Generator g = new Generator();
		g.generateData(takeLift);
		maps = g.getMap();
		edges = g.getAllEdges();
		nodes = g.getAllNodes();

		// Lets check from location Loc_1 to Loc_10
		Graph graph = new Graph(nodes, edges);
		Implementation dijkstra = new Implementation(graph);
		dijkstra.execute(maps.get(source));
		LinkedList<Node> path = dijkstra.getPath(maps.get(destination));

		if (path != null) {
			for (int i = 0; i < path.size() - 1; i++) {
				for (Edge edge: edges){
					if(edge.getSource() == path.get(i) && edge.getDestination() == path.get(i+1)){
						String direction = edge.getDirection();
						if(!direction.equals("")){
							System.out.println(direction);
							directionsList.add(direction);
							typeList.add(path.get(i).getType());
							floorList.add(path.get(i).getLevel());
						}
					}	
				}
			}
		}
		else{
			System.out.println("Error");
		}

	}

	public static void main(String args[]){
		RouteFinder rf = new RouteFinder();
		rf.FindRoute("2.006", "1.006", false);
	}

	public ArrayList<String> getDirectionsList() {
		return directionsList;
	}

	public ArrayList<String> getTypeList() {
		return typeList;
	}

	public ArrayList<Integer> getFloorList() {
		return floorList;
	}
}
