
public class MathElectiveCourse extends ElectiveCourse{ // You need to add inheritance

	public MathElectiveCourse(String name, int number, int credit) {
         super(name,number,credit);	}
	
	public int computeFinalGrade(int grade){
		if(grade==100 || grade<56)
			return grade;
		grade = grade+5;
		if(grade>100)
			return 100; 
		return grade;
		}	

}
