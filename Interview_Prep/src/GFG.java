import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Main class
class GFG {
	
	static int Sum(int x)
	{
		System.out.println("8888888888");
		return x;
	}
	
	static String Sum(String x)
	{
		System.out.println("1333333333");
		return x;
	}

	// Main driver method
	public static void main(String[] args)
		throws IOException
	{

		// Creating a file and reading from local repository
		FileReader file = new FileReader("C:\\test\\write.txt");

		// Reading content inside a file
		BufferedReader fileInput = new BufferedReader(file);

		// Printing first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++)
			System.out.println(fileInput.readLine());
		
		//System.out.println(Sum("null"));
		String split="India is my country";
		String newWord="";
		
		String [] result=split.split(" ");
		String tempStorage=null;
		
		for(int i=0;i<result.length;i++)
		{
			tempStorage=result[i];
			//System.out.println("--"+tempStorage);
			newWord="";
			for (int j=0;j<tempStorage.length();j++)
			{
				newWord = tempStorage.charAt(j) + newWord;
			}
			//System.out.print("  "+newWord);		
		}
		 
		//
		List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(6);
        l.add(3);
        l.add(5);
        l.add(4);
 
        // Set declaration
        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(3);
        s.add(5);
        s.add(4);
 
        // printing list
        System.out.println("List = " + l);
        // printing Set
        System.out.println("Set = " + s);
		
		//
		
		
		

		// Closing all file connections
		// using close() method
		// Good practice to avoid any memory leakage
		fileInput.close();
	}
}
