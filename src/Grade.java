
public class Grade {
	
	private Course course;
	private int grade;
	
	public Grade(Course course, int grade){
		isLegalInput(course,grade);
		this.grade=grade;
		this.course=new Course(course);
	}
	

	private void isLegalInput(Course course, int grade) {
		if(course==null || grade<0 || grade>100)
			throw new IllegalArgumentException("illegal input");
	}

	public int getGrade() {
		return this.grade;
	}

	public int setGrade(int grade) {
		int gradeOld = this.grade;
		this.grade=grade;
		return gradeOld;
	}

	public Course getCourse() {
		return this.course;
	}
	
	public String toString(){
		return "course : "+course.toString()+ " grade: "+grade;
	}
	
	public boolean equals(Object other){
		if(!(other instanceof Grade))
			return false;
		return ((Grade)other).grade==this.grade && ((Grade)other).course.equals(this.course) ;
	}
	
	public int computeFinalGrade(){
		return course.computeFinalGrade(grade);
	}
}
