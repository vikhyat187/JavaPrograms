package comparatorsAndComparables;

public class Student{ //implements Comparable<Student>{

	int marks;
	String name;
	public Student(int marks,String name) {
		this.marks=marks;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + "," + name + "]";
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
//	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.marks>o.marks)return -1;
		else if (this.marks<o.marks)return 1;
		//these values define wether to sort in ascending or 
		//in the descending order
		return this.name.compareTo(o.name);
//			return 0;
	}
}