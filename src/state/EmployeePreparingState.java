package state;

public class EmployeePreparingState implements State {

	@Override
	public void doAction(Context context) {
		 System.out.println("Employee is preparing the delivery!");
		 context.setState(this);
	}
}
