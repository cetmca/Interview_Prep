
import java.util.*;
import java.util.function.Predicate;

 interface Drawable{
	public int draw();
   //public String say(String name);  
}
 
 
 interface Square{
	public int sqr(int x);
   //public String say(String name);  
}
 
 interface Sayable{
   public String say(String name);  
}
 
 interface Addable{  
	    int add(int a,int b);  
	}  
 
 interface concatnate{  
	    String concat(String a,String b);  
	}  
 
class FunctLambda {
    public static void main(String args[])
    {
        // create a list of strings
        List<String> names = Arrays.asList(
            "Geek", "GeeksQuiz", "g1", "QA", "Geek2","");
 
        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s) -> s.startsWith("Q");
        
        Predicate<String> q = (s) -> s.isEmpty();
        
        names.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        // Print the sorted list of strings
        System.out.println("\nSorted strings:");
        for (String str : names) {
            System.out.print(str + "--");
        }
 
        // Iterate through the list
        for (String st : names) {
            // call the test method
           // if (p.test(st))
            if (q.test(st))
                System.out.println("--"+st);
        }
        int width=20;
        Drawable d = ()->{
        	return width;
        };
        
        Sayable saying = (String name)->{
			return "Saying name "+name;
        };
        
        Addable addition = (int n1, int n2)->{
			return n1 +n2;
        };
        
        concatnate con = (String s1,String s2)->{
        	return s1+s2;
        };
        
        Square s1=(int n1)->{
        	return ( n1 * n1);
        };
        System.out.println(con.concat("testing ", "hello"));
        
        System.out.println(saying.say("testing"));
        System.out.println(d.draw());
        System.out.println(addition.add(12, width));
        System.out.println(s1.sqr(12));
        
    }
}
