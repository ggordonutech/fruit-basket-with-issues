
public class Driver {

	public static void main(String[] args) {
		FruitList list = new FruitList();
		list.addToBack(new Fruit("orange",50));
		list.addToBack(new Fruit("pineapple",70));
		list.addToBack(new Fruit("guinep",70));
		list.display();
		String [] fruitNames  = new String[] {
				"orange","pineapple","guinep","tangerine"
		};
		if(list.deleteFromMiddle("pineapple")) {
			System.out.println("Pineapple was deleted");
		}else {
			System.out.println("Pineapple was deleted");
		}
		for(String name : fruitNames) {
			if(list.deleteFromMiddle(name)) {
				System.out.println("Deleted "+name);
			}else {
				System.out.println("Did not delete "+name);
			}
			
			
		}
		System.out.println("List is empty = "+list.isEmpty());
//		Fruit smileOrange = list.search("ORANGE");
//		System.out.println("I found : "+smileOrange);
//		for(int i=0;i<3;i++) {
//			System.out.println("---deleteFromFront-"+i+"-------------");
//			list.deleteFromFront();
//			list.display();
//		}

	}

}
