package state;

public class EmployeeWaitingState implements State {


	@Override
	public void doAction(Context context) {
		 System.out.println("Employee is waiting for a new client!");
		 context.setState(this);
	}
}
