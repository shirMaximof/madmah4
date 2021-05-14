
public class FinalGradeComparator implements Comparator<Grade> {

	@Override
	public int compare(Grade g1, Grade g2) {
		return (int)Math.signum(g1.computeFinalGrade()-g2.computeFinalGrade());
	}

}
