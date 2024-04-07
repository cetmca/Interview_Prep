import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByScores {
	public static void main(String arg[])
	{	
	List<Student> students = new ArrayList<> ();
	
	Student stud1 = new Student();
	Student stud2 = new Student();
	Student stud3 = new Student();
	Student stud4 = new Student();
	
	stud1.name="abcd";
	stud1.score=123;
	
	stud4.name="pqrs";
	stud4.score=123;
	
	stud2.name="vcd";
	stud2.score=456;
	
	stud3.name="wert";
	stud3.score=567;
			
	students.add(stud1)	;
	students.add(stud2)	;
	students.add(stud3)	;
	
	Map<Integer, Double> averageScoresByGroup = students.stream().collect(Collectors.groupingBy(Student::getScore, Collectors.averagingDouble(Student::getScore)));
	
    averageScoresByGroup.forEach((score, average) -> System.out.println("Score: " + score + ", Average: " + average));
	
	
	
	
	
			
	}	

}



class Student
{
	public String name;
	public Integer score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}

	
}