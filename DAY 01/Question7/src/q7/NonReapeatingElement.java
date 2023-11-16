package q7;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class NonReapeatingElement {

	public static void main(String[] args) {

		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
		int arr[] = { 100,1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int count = 1;
		for(int i = 0; i<arr.length; i++)
		{
			if(lhm.containsKey(arr[i]))
			{
				count++;
			}
			lhm.put(arr[i], count );
			count = 1;
		}
		Set<Entry<Integer,Integer>> hset = lhm.entrySet();
		for(Entry<Integer,Integer> entry: hset) {
			if(lhm.get(entry.getKey())==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
