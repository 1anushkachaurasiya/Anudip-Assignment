package labtest5;
import java.util.TreeSet;
public class IterateTS {

public static void main(String[] args) { 
TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("Brown");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("Purple");
		  tree_set.add("White");
		 
		  for (String element : tree_set) {
		    System.out.println(element);
		    }

	}

}