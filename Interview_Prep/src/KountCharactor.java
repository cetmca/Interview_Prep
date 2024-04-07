import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KountCharactor {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="heloo world";
		str=str.replaceAll("\\s+","");
		
		List<Integer> numbers = Arrays.asList(11, 12, 32, 4, 25, 61, 7, 8, 9, 10);


		System.out.println(numbers.stream().sorted().toList());

		
		
		Map<Character, Integer> charKount = new HashMap<Character, Integer>();
		
		for(int i = 0;i<str.length();i++)
		{
			//System.out.println(str.charAt(i));
			if(charKount.containsKey(str.charAt(i)))
			{
				int kount = charKount.get(str.charAt(i));
				charKount.put(str.charAt(i),++kount);
			}
			else
			{
				charKount.put(str.charAt(i),1);
			}
			
			
		}
		
        System.out.println(charKount);
        
        
        for (Map.Entry<Character, Integer> entry : charKount.entrySet()) {
           // System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            
            if(entry.getValue()>1)
            {
            	 System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }


	}

}
