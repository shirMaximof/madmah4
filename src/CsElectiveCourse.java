
public class CsElectiveCourse extends ElectiveCourse{ // You need to add inheritance

	public CsElectiveCourse(String name, int number, int credit) {
		super(name,number,credit);
	}
	
	public int computeFinalGrade(int grade){	
		if(grade==100 || grade<56)
			return grade;
		grade = (int)1.1*grade + 5 ;
		if(grade>100)
			return 100; 
		return grade;
		}

}
