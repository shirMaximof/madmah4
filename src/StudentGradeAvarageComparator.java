
public class StudentGradeAvarageComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return (int)Math.signum(s2.calculateAvarage()-s1.calculateAvarage());
	}

}
