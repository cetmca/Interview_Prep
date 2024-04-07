import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Streams {
public static void main(String arg[])
{
List<Account> accounts = new ArrayList<> ();
Account A1= new Account();
A1.account_id=1234;
A1.account_name="a1-name";
A1.phone_num="a1-phone_num";
A1.salary=1000;

Account A2= new Account();
A2.account_id=4567;
A2.account_name="a2-name";
A2.phone_num="a2-phone_num";
A2.salary=900;

Account A3= new Account();
A3.account_id=8910;
A3.account_name="a3-name";
A3.phone_num="a3-phone_num";
A3.salary=800;

accounts.add(A1);
accounts.add(A2);
accounts.add(A3);

//accounts.stream().forEach(a -> System.out.println(a.account_id+"---"+a.phone_num));

//accounts.stream().filter(a -> a.salary >=1000).forEach(a -> System.out.println(a.account_id+"---"+a.phone_num));

//List<Integer> doubleSal = accounts.stream().filter(a -> a.salary >=1000).map(a -> a.salary * 2).collect(Collectors.toList());

List<Integer> doubleSal = accounts.stream().map(a -> a.salary * 2).collect(Collectors.toList());


doubleSal.forEach(s -> System.out.println(s));

System.out.println("hiiiiiiii");



}

}

class Account
{
public Integer account_id;
public String account_name;
public String phone_num;
public Integer salary;
	
}




	
