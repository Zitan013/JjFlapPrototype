public class NodeChange {
    private String condition;
    private Node from;
    private Node to;
    public NodeChange(String condition,Node from, Node to){
        this.condition = condition;
        this.from = from;
        this.to = to;
    }
}
