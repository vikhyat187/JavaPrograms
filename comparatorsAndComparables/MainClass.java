package comparatorsAndComparables;

import java.util.List;
import java.util.*;

public class MainClass {

	public static void main(String args[]) {
		
		List<Student> students =new ArrayList<>();
		
		students.add(new Student(23,"Ram"));
		students.add(new Student(43,"Ram"));
		students.add(new Student(54,"Ramesh"));
		students.add(new Student(54,"Vikhyat"));
		students.add(new Student(246,"Sam"));
		System.out.println(students);
		
		Collections.sort(students,new SortByNameThenMarks());
		students.forEach(System.out::println);
	}
}
class SortByNameThenMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.name.equals(o2.name))
		return o1.marks-o2.marks;
		else
		{
			return o1.name.compareTo(o2.name);
		}
		}
	}