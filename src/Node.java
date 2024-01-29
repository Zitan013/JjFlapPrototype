import java.awt.*;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

public class Node {
    private Boolean isCurrent = false;
    private String name;
    private int xPos;
    private int yPos;
    private Polygon shape = new Polygon();
    private List<NodeChange> connections = new ArrayList<NodeChange>();


    public Node(String name, int xPos, int yPos){
        this.name = name;
        this.xPos = xPos;
        this.yPos = yPos;
        shape.addPoint(xPos + 20, yPos +20);
        shape.addPoint(xPos -20, yPos -20);
        shape.addPoint(xPos + 20, yPos -20);
    }

    public void addConnection(NodeChange connection){
        connections.add(connection);
    }
    public void removeConnection(NodeChange connection){
        connections.remove(connection);
    }

    public Polygon getShape(){
        return shape;
    }



}
