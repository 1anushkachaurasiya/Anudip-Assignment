package labtest5;
import java.util.HashSet;
public class NumberOfElement {
public static void main(String[] args) {
HashSet<String> h_set = new HashSet<String>(); 
      h_set.add("Blue"); 
      h_set.add("Green");
      h_set.add("Black");
      h_set.add("Grey"); 
      h_set.add("Red");
System.out.println("Original Hash Set: " + h_set);
System.out.println("Size of the Hash Set: " + h_set.size());

	}

}