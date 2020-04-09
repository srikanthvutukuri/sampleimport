import java.time.LocalTime;
import java.util.*;
import java.util.stream.Stream;
public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> obj=new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
		
			obj.add(i*10);
		}
		
		
		//printing the arraylist elements
		
		//obj.forEach(System.out::println);
		
		
		//printing with stream
		
		Stream<Integer> s=obj.stream();
		
		
		Stream<Integer> ps=obj.parallelStream();
		
		
		System.out.println(" --------------parallel stream-----------------");
		
		s.forEach(i->{
			
			System.out.println("Time :"+LocalTime.now()+"  Value :"+i+"  ThreadName:  "+Thread.currentThread().getName());
		});
		
		
		System.out.println(" --------------parallel stream-----------------");
		
ps.forEach(i->{
			
			System.out.println("Time :"+LocalTime.now()+"  Value :"+i+"  ThreadName:  "+Thread.currentThread().getName());
		});
		
		
		//ps.forEach(System.out::println);
		
		//ps.forEach(System.out::println);
		//printing with stream
		
		
	}

}
