import java.util.Iterator;

public class StudentManagementSystem {
	private List<Student> students;
	private List<Course>courses;
	private int numOfStudents;
	private int numOfCourses;
	
	public StudentManagementSystem() {
		students = new LinkedList<Student>();
		courses = new LinkedList<Course>();
		numOfStudents = 0;
		numOfCourses =0;
	}
	
	public boolean addStudent(Student student){
		if(students.contains(student))
			return false;
		students.add(student);
		numOfStudents++;
		return true;
	}
	
	public boolean addCourse(Course course){
		if(courses.contains(course))
			return false;
		courses.add(course);
		numOfCourses++;
		return true;
	}
	
	public boolean register(Student student, Course course){
		if(!addStudent(student) || !addCourse(course) || student.isRegisteredTo(course) )
			return false;
		student.registerTo(course);
		return true;
		
	}
	
	public boolean addGradeToStudent(Student student, Course course, int grade){
		if(!(students.contains(student)| courses.contains(course)))
			return false;
		return student.addGrade(course, grade);
		
		
	}
	
	public List<Student> getFirstKStudents(Comparator<Student> comp, int k){
		if(numOfStudents<k || k<0 || comp==null)
			throw new IllegalArgumentException("input is illegal");
		List<Student> sortlst = students;
		((LinkedList<Student>)sortlst).sortBy(comp);
		Iterator<Student> iter = sortlst.iterator();
		List<Student> output = new LinkedList<Student>();
		while(iter.hasNext() && k>=0)
		{
			output.add(iter.next());
			k--;
		}
		return output;
	}
	
	public double computeFinalGrade(Student student){
			if(students.contains(student))
			{return student.computeFinalGrade();}
			return -1;
	}

	public int getNumberOfStudents() {
		return this.numOfStudents;
	}

	public int getNumberOfCourses() {
		return this.numOfCourses;
	}
}
