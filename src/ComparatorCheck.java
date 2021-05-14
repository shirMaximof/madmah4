
public class ComparatorCheck implements Comparator<Integer> {
	public int compare(Integer s1, Integer s2) {
		return (int)Math.signum(s1-s2);
		
	}
	

}
