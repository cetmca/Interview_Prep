import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

interface StringFunction {
  String run(String str);
}

public class Main {
  public static void main(String[] args) {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello ", exclaim);
    printFormatted("Hello ", ask);
    
    //
    List<Integer> myList = new ArrayList<>();
    for(int i=0; i<5; i++) myList.add(i);
    		
    //sequential stream
    Stream<Integer> sequentialStream = myList.stream().limit(3);
    		
    //parallel stream
    Stream<Integer> parallelStream = myList.parallelStream();
   // parallelStream.forEach(s -> System.out.println(s)); 
    
    sequentialStream.forEach(s -> System.out.println(s)); 
    
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(500);
    numbers.add(900);
    numbers.add(800);
    numbers.add(100);
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
  

    

    
    //
    
    
  }
  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
   // System.out.println(result);
  }
}