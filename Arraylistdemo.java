package array;

public class Arraylistdemo {
	public static void main(String[] args) {
		Addclass addclass=new Addclass(2);
		addclass.add(10);
		addclass.add(10);
		addclass.add(10);
		addclass.add(10);
		addclass.add(10);
		for(int i=0;i<addclass.size();i++) {
			System.out.println(addclass.get(i));
		}
		
	}

}
