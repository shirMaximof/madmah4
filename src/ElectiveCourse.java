
public class ElectiveCourse extends Course{ // You need to add inheritance

	public ElectiveCourse(String name, int number, int credit) {
		super(name,number,credit);
	}

	public int computeFinalGrade(int grade){
		if(grade==100 || grade<56)
			return grade;
		grade = (int)1.1*grade;
		if(grade>100)
			return 100; 
		return grade;
		}
	
	}

}
