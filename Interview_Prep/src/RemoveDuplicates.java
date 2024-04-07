import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "oranges", "apple", "grape", "zbanana", "kiwi");
        Pattern VOWELS_PATTERN = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        
      // System.out.println(stringList.stream().filter(s -> ( s.startsWith("a") || s.startsWith("o"))).collect(Collectors.toList()));
       
       List<String> filteredStrings = stringList.stream()
               .filter(s -> s.matches("^[aeiouAEIOU].*"))
               .collect(Collectors.toList());
       
       
       System.out.println(stringList.stream().max((s1,s2) -> Integer.compare(s1.length(), s2.length())).orElse("").toUpperCase());
       
       
       filteredStrings.forEach(System.out::println);
       
       //System.out.println(stringList.stream().filter(s -> s.matches("[^a]")).collect(Collectors.toList()));
    		   
       // System.out.println(stringList.stream().distinct().max( (s1,s2) -> Integer.compare(s1.length(),s2.length())).orElse(""));
        
        List<Integer> intList = Arrays.asList(19,12,3,6,8);
        
        System.out.println(" --greatest " +intList.stream().sorted().reduce((first,second) -> second));
        System.out.println(" --smallest " +intList.stream().sorted().reduce((first,second) -> first));
        
       // intList = intList.stream().filter(x -> (x %2 ==0)).collect(Collectors.toList());
      //  System.out.println(intList);

       // System.out.println(intList.stream().map(x -> (x * x)).collect(Collectors.summingInt(Integer::intValue)));
        

        intList = intList.stream().filter(x -> (x %2 ==1)).collect(Collectors.toList());
     //   System.out.println(intList);
        
        
        List<String> strList = Arrays.asList("2","5","4","1","6"); //,8,7,9);
        
        
       // System.out.println(strList.stream().filter(x -> (x %2 ==0)).collect(Collectors.toList());
        
        
        intList = intList.stream().filter(x -> x % 2 == 0).toList();
        intList = Arrays.asList(1,2,3);
        
       // System.out.println("477--"+intList.stream().filter(x -> x % 2 == 0).toList());
        
       // System.out.println("511 --"+intList.stream().mapToInt(x -> x * x).sum());
        
        
       // intList= intList.stream().sorted().toList();
        intList = Arrays.asList(19,12,3,6,8);
        
        System.out.println(intList.stream().sorted().max(Integer::compareTo).orElse(null));
        
      //  System.out.println(intList.stream().max(Integer::compareTo).orElse(null));
        intList= intList.stream().limit(2).toList();
        
        stringList = stringList.stream().distinct().filter(name -> name.startsWith("app") || name.startsWith("k")).toList();
        
        List<Integer> numbers = Arrays.asList(1, 2, 3,7,8,4);

        
        System.out.println("169-->"+numbers.stream().filter((x -> x%2==0)).toList().size());
        
        
     //  stringList.forEach(s -> System.out.println(s));
        
        intList = Arrays.asList(21,19,12,3,6,8,7,6,56);
        intList =Arrays.asList();
        
        System.out.println("7111111111--"+intList.stream().reduce( (first, second) -> second).orElse(null));

        List<String> newstringList = stringList.stream().distinct().collect(Collectors.toList());
        
        newstringList= newstringList.stream().distinct().sorted().collect(Collectors.toList());
        
        newstringList= newstringList.stream().sorted().distinct().collect(Collectors.toList());
        
        intList = intList.stream().filter(x -> (x %2 ==0)).collect(Collectors.toList());
        
       // System.out.println(intList.stream().filter(x -> (x %2 ==0)).count());
        
        //intList.forEach(s -> System.out.println(s));
        

        // Printing the unique elements
       // System.out.println("List with duplicates removed:");
       // newstringList.forEach(System.out::println);
    }
}
