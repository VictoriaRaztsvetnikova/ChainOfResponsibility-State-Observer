package observer;

import state.EmployeePreparingState;
import state.State;

public interface Observer {

	public State getUpdate();
	public void ChangeState(EmployeePreparingState preparing);
}
