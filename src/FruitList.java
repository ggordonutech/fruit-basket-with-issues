
public class FruitList {
	private Node head;

	public FruitList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	@SuppressWarnings("unused")
	public boolean isFull() {
		Node temp = new Node();
		if (temp == null) {
			return true;
		} else {
			return false;
		}
	}

	public void addToBack(Fruit data) {
		if (isFull()) {
			System.out.println("List is full, unable to add to back");
		} else {
			Node next = new Node(data);
			if (isEmpty()) {
				head = next;
			} else {
				Node temp = head;
				while (temp.getNext() != null) {
					temp = temp.getNext();
				}
				temp.setNext(next);
			}

		}
	}

	public void addToFront(Fruit data) {
		if (isFull()) {
			System.out.println("List is full, unable to add");
		} else {
			Node next = new Node(data);
			if (isEmpty()) {
				head = next;
			} else {
				next.setNext(head);
				head = next;

			}
		}
	}

	public boolean deleteFromBack() {
		if (!isEmpty()) {

			if (head.getNext() == null) {
				head = null;
			} else {
				Node prev = head;
				Node temp = head;
				while (temp.getNext() != null) {
					prev = temp;
					temp = temp.getNext();
				}
				prev.setNext(null);
				temp = null;
			}
			return true;
		}
		return false;
	}

	public boolean deleteFromFront() {
		if (!isEmpty()) {
			Node temp = head;
			head = head.getNext();
			temp = null;
			return true;
		}
		return false;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			temp.display();
			temp = temp.getNext();
		}
	}

	public Fruit search(String name) {
		if (!isEmpty()) {
			Node temp = head;
			while (temp != null) {
				if (temp.getData().getName().equalsIgnoreCase(name)) {
					return temp.getData();
				}
				temp = temp.getNext();
			}
		}
		return null;
	}

	public void destroy() {
		boolean isDeleted = true;
		while (isDeleted)// n
			isDeleted = deleteFromFront(); // 1
	}

	public boolean deleteFromMiddle(String name) {
		if (!isEmpty()) {
			if (head.getNext() == null) {//if only one element
				//check if this is the one we are searching for
                if(head.getData().getName().equals(name)) {
                	head = null; //delete 
                	return true;
                }
			} else {//if we have multiple items in list
				Node prev = head;
				Node temp = head;
				while (temp != null) {
					if (temp.getData().getName().equals(name)) {
						prev.setNext(temp.getNext());
						temp = null;
						return true;
					}
					prev = temp;
					temp = temp.getNext();
				}
			}
		}
		return false;
	}

}
