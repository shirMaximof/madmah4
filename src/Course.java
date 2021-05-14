
public class Course {
	private String name;
	private int number;
	private int credit;

	public Course(String name, int number, int credit){
		validateCheck(name,number,credit);
		this.name=name;
		this.number=number;
		this.credit= credit;
	}
	public Course(Course course) {
		this.name=course.name;
		this.number= course.number;
		this.credit = course.credit;
	}
	

	private void validateCheck(String name, int number, int credit) {
		if(name==null || number<=0 ||credit<1 || credit >6 || !abc_validate(name))
			throw new IllegalArgumentException("illegal input");
		
	}


	private boolean abc_validate(String name) {
		// TODO Auto-generated method stub
		String legalS = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<name.length();i+=1) {
			if(legalS.indexOf(name.charAt(i))==-1)
				return false;			
		}
		return true;
	}


	public String getCourseName(){
		return this.name;
	}

	public int getCourseNumber(){
		return this.number;
	}

	public int getCourseCredit(){
		return this.credit;
	}

	public String toString(){
		return "name: "+name +" number: "+number + "credit: "+credit;
	}

	public boolean equals(Object other){
		if(!(other instanceof Course))
			return false;
		return this.number==((Course)other).number && this.credit==((Course)other).credit && this.name.equals(((Course)other).name);
	}

	public int computeFinalGrade(int grade){
		return grade;
		
	}
}
