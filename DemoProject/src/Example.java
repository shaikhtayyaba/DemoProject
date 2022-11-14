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
      
      Collections.sort(al);
      System.out.println(al);

	}

}
