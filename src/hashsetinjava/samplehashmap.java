package hashsetinjava;
import java.util.HashMap;

import java.util.Map.Entry;
public class samplehashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>  map=new HashMap<>();
		  map.put(1,"swathi");
		  map.put(2,"papa");
		  map.put(3, "xyz");
		  map.put(4, "xyz");
		  map.put(5,"abc");
		  System.out.println(map);
//		  System.out.println(map.get(3));print the value of key
	  System.out.println(map.containsValue("xyz"));
	  System.out.println(map.containsKey(2));//if given key is there it will print true otherwise t will print false
//		  map.remove(1);
//		  map.remove("papa");
//		  System.out.println(map);
//		 
//     for(Entry<Integer,String> entry:map.entrySet())
//       {
//    	 System.out.println("Key= "+entry.getKey());
//    	 System.out.println("Value= "+entry.getValue());
//       }
//		for(Object id:map.keySet())  //this loop will work for heterogeneous
//		{
//			//System.out.println(id);//this will print only keys
//			System.out.println("Key = "+ id +"Value = "+map.get(id));//Here print both key and value
////		}
//		for(Object name:map.values())
//		{
//			System.out.println(name);//here we can print only Values in heterogeneous
//			
//		}
//		System.out.println(map);
	}

}

