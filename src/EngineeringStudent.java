
public class EngineeringStudent extends Student{ // You need to add inheritance

	private final static int CREDIT = 160;

	public EngineeringStudent(String firstName, String lastName, int id) {
		super(firstName,lastName,id);
	}
	
	public int getTotalCreditRequired(){
        return CREDIT;	}

}
