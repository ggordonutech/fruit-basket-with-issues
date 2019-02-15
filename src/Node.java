
public class Node {
	private Fruit data;
	private Node next;
	
	
	public Node() {
		this(null,null);
	}
	
	public Node(Fruit data) {
		this(data,null);
	}
	public Node(Fruit data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Fruit getData() {
		return data;
	}
	public void setData(Fruit data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}

}
