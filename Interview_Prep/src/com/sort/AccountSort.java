package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountSort {
    public static void main(String[] args) {

	
    List<Account> persons = new ArrayList<>();

    persons.add(new Account(12,"Alice", 5000));
    persons.add(new Account(15,"Charlie", 1000));
    persons.add(new Account(18,"David", 6000));
    persons.add(new Account(14,"Peter", 500));

    // Sort the list based on salary
    
    Collections.sort(persons);
    
    for (Account person : persons) {
        System.out.println(person);
    }

    }

}



class Account implements Comparable<Account>
{
private int acct_id;
private String acct_name;
private int salary;



@Override
public int compareTo(Account acct) {
	// TODO Auto-generated method stub
	System.out.println(this.getSalary() + acct.getSalary());
	if(this.getSalary() < acct.getSalary())
	{
	return 1;
	}
	else if(this.getSalary() == acct.getSalary())
	{
		return 0;
	}
	else
	{
		return -1;
	}
}




public int getAcct_id() {
	return acct_id;
}
public void setAcct_id(int acct_id) {
	this.acct_id = acct_id;
}
public String getAcct_name() {
	return acct_name;
}
public void setAcct_name(String acct_name) {
	this.acct_name = acct_name;
}




public int getSalary() {
	return salary;
}




public void setSalary(int salary) {
	this.salary = salary;
}

public Account(int acct_id, String acct_name, int salary) {
	super();
	this.acct_id = acct_id;
	this.acct_name = acct_name;
	this.salary = salary;
}

@Override
public String toString() {
	return "Account [acct_id=" + acct_id + ", acct_name=" + acct_name + ", salary=" + salary + "]";
}


}