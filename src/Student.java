import java.util.Iterator;

public class Student {
	
	private String firstName;
	private String lastName;
	private int id;
	private List<Course>courses;
	private List<Grade>grades;
	private final static int CREDIT = 120;
	public Student(String firstName, String lastName, int id) {
		validateInput(firstName,lastName,id);
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
		courses = new LinkedList<Course>();
		grades = new LinkedList<Grade>();
		
	}


	private void validateInput(String firstName, String lastName, int id) {
		if(firstName== null || lastName==null || lastName=="" || firstName==""|| id <=0 || !abc_validate(firstName) || !abc_validate(lastName))
			throw new IllegalArgumentException("input is invalid");
		
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
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getId() {
		return this.id;
	}

	public boolean isRegisteredTo(Course course){
		return this.courses.contains(course);
	}

	public boolean registerTo(Course course){
		if(isRegisteredTo(course))
			return false;
		courses.add(course);
		return true;
	}

	public double calculateAvarage(){
		if(this.courses.isEmpty())
		{
			System.out.println("course is empty ");
			return 0;
		}
		
		double ans = 0;	
		double credit =0;
		double totalCredits =0 ;
		Iterator<Grade> iterGrades = grades.iterator();	
			while(iterGrades.hasNext()) {
				Grade linkGrade = iterGrades.next();
				credit = linkGrade.getCourse().getCourseCredit();
				ans = ans + credit * linkGrade.getGrade();	
				totalCredits +=credit;
			}	
			ans = ans/totalCredits; 		
		return ans;
	}

	public boolean addGrade(Course course, int grade){
		if(courses.contains(course) || gradeExists(course,grade))		
			return false;	
		courses.add(course);
		grades.add(new Grade(course,grade));
		return true;
	}

	private boolean gradeExists(Course course, int grade) {
		// TODO Auto-generated method stub
		Iterator<Grade> iter = grades.iterator();
		while(iter.hasNext()) {
			if(iter.next().getCourse().equals(course))
				return true;
		}
		return false;
	}


	public int setGrade(Course course, int grade){
		if(!gradeExists(course,grade))
			throw new IllegalArgumentException("grade does not exist");
		int gradeVal = -1;
		boolean out =false;
		Iterator<Grade> iter = grades.iterator();
		while(iter.hasNext() && !out) {
			Grade nextGrade = iter.next();
			if(nextGrade.getCourse().equals(course)) {
				gradeVal = nextGrade.getGrade();
				nextGrade.setGrade(grade);
				out = true;
			}
		}
		return gradeVal;
			
			
	}
	
	public String toString(){
		return "name of the student: "+ this.firstName +" "+ this.lastName+" id: "+this.id+" corses: "+ courses.toString()+ " grades: "+grades.toString();
	}

	public boolean equals(Object other){
		if(!(other instanceof Student))
			return false;
		return ((Student)other).id == this.id;
	}

	public int getTotalCreditRequired(){
      return CREDIT;	}

	public double computeFinalGrade(){
		throw new UnsupportedOperationException();
	}
}
