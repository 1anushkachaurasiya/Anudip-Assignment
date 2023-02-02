package labtest5;
import java.util.HashMap;
public class Mapping {
public static void main(String[] args) {
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
    hash_map.put(1, "Blue"); 
    hash_map.put(2, "Green");
    hash_map.put(3, "Black");
    hash_map.put(4, "Grey"); 
    hash_map.put(5, "Red");
  System.out.println("Size of the hash map: "+hash_map.size());

	}

}