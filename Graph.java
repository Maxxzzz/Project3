import java.util.List;

public class Graph {
    private final List<Vertex> vertexes;
    private final List<Edge> edges;

    public Graph(List<Vertex> vertexes, List<Edge> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
    }

    public List<Vertex> getVertexes() {
        return vertexes;
    }

    public List<Edge> getEdges() {
        return edges;
    }



}
// public class Graph{
// 	private Set<Node> nodes = new HashSet<>();
// 	public void addNode(Node node){
// 		nodes.add(node);
// 	}
// 	public String get(String name){
// 		return this.name;
// 	}
// 	public generateGraph(LinkedList<LinkedList<String>>places){
// 		for(LinkedList<String>place:places){
// 			Node newNode = new Node();
// 			newNode.setNodeName(place.get(0));
// 			newNode.addLocation(road.get(1),road.get(2));
// 		}
// 	}

// }