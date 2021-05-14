
public class Tests {
	public static void main(String[]args) {
		List<Integer> lst1= new LinkedList<Integer>();
		lst1.add(3);
		lst1.add(2);
		lst1.add(5);
		lst1.add(7);
		System.out.println(lst1.set(3,10));
		System.out.print(lst1.toString());
		
		
		List<Integer> lst2= new LinkedList<Integer>();
		lst2.add(3);
		lst2.add(2);
		lst2.add(5);
		lst2.add(10);
		System.out.println(lst1.equals(lst2));
		
		
//		Comparator<Student> avarageComp = new StudentGradeAvarageComparator();
//		Course c = new Course("CsIntro", 1, 5);
//		Student s1 = new Student("Yossi","Choen",1);
//		Student s2 = new Student("Avi","Choen",2);
//		System.out.println(s1.addGrade(c, 100));
//		System.out.println(s2.addGrade(c, 95));
//		System.out.println(avarageComp.compare(s1,s2)>0);//false		
//		System.out.println(avarageComp.compare(s2,s1)>0);//true
		Comparator<Integer> check = new ComparatorCheck(); 
		((LinkedList<Integer>)lst1).sortBy(check);
		System.out.println(lst1.toString());
		
//
//		
//		
//		Comparator<Student> nameComp = new StudentNameComparator();
//		Student s3 = new Student("Yossi","Choen",1);
//		Student s4 = new Student("Avi","Choen",2);
//		System.out.println(nameComp.compare(s3,s4) > 0);//true
//		System.out.println(nameComp.compare(s4,s3) > 0);//false

	}

}
