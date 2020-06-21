package observer;

import state.EmployeePreparingState;
import state.EmployeeWaitingState;
import state.State;

public class Employees implements Observer {
	
	private String deliveryLocation;
	private String name;
	private String state = "preparing";
	private EmployeePreparingState preparing;
	private EmployeeWaitingState waiting;

	public Employees(String name, String deliveryLocation) {
		this.name = name;
		this.deliveryLocation = deliveryLocation;
	}

	@Override
	public void ChangeState(EmployeePreparingState preparing) {
		if(this.state.equals("preparing")) {
			System.out.println(this.name + " is in waiting state for a new client.");
		}else
			System.out.println("There is no order in preparing state.");
		return;
	}

	@Override
	public State getUpdate() {
		return this.waiting;
	}
}
