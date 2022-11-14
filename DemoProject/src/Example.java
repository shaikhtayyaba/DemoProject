import java.util.ArrayList;
import java.util.Collections;

public class Example {

	public static void main(String[] args) {
      ArrayList al = new ArrayList();
      al.add("India");
      al.add("Newzland");
      al.add("America");
      al.add("Garmany");
      al.add("Japan");
      al.add("Korea");
      System.out.println("****Before sorting****");
      System.out.println(al);
      System.out.println();
      
      Collections.sort(al);
      System.out.println("****After Sorting****");
      System.out.println(al);

	}

}
