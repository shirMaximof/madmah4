
public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		int compare = (int)Math.signum(s1.getLastName().compareTo(s2.getLastName()));
		if(compare==0)
			return (int)Math.signum(s1.getFirstName().compareTo(s2.getFirstName()));
		else return compare;
	}

}
