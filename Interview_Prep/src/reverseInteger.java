
public class reverseInteger {

	public static void main(String str[])
    {
		String reversedNumber = reverse(1234);
		System.out.println(reversedNumber);
		
		int num=25;
		
		for(int i=1;i<num;i++)
		{
			if (  (i * i) == num )
			{
				System.out.println(i);
				break;
			}
			
		}
		
		
		
    }
    public static String reverse(int x) {
        String str="";
        while(x !=0)
        {
            int lastdigit= x %10;
            str +=lastdigit;
            x= x/ 10;
        }

        System.out.println("Hello"+str);
      return str;  
    }
}




