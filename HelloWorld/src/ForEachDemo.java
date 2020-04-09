import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
List<Integer> lobj=new ArrayList<Integer>();

lobj.add(10);
lobj.add(20);
lobj.add(30);

		/*
		 * for(int d : lobj) { System.out.println(d); }
		 */
//foreach() in java8

//lobj.forEach(i-> System.out.println(i));

lobj.forEach(System.out :: println);



	}

}
