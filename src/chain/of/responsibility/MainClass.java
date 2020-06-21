package chain.of.responsibility;

import observer.Employees;
import observer.Observer;
import state.Context;
import state.EmployeePreparingState;
import state.EmployeeWaitingState;

public class MainClass {
	
	private static Employee getChain() {
		Employee shipmentsAbroad = new ShipmentsAbroad();
		Employee shipmentsToBulgaria = new ShipmentsToBulgaria();
		Employee shipmentsInPlovdiv = new ShipmentsInPlovdiv();
		shipmentsAbroad.setNextEmployee(shipmentsToBulgaria);
		shipmentsToBulgaria.setNextEmployee(shipmentsInPlovdiv);
		return shipmentsAbroad;
	}

	public static void main(String[] args) {
	Employee chain = getChain();
	chain.deliveryMessage("ABROAD", "Delivery abroad.");
	chain.deliveryMessage("BULGARIA", "Delivery to Bulgaria.");
	chain.deliveryMessage("PLOVDIV", "Delivery in Plovdiv.");
	
	
	Context context = new Context();
	EmployeePreparingState preparing = new EmployeePreparingState();
	preparing.doAction(context);
	
	EmployeeWaitingState waiting = new EmployeeWaitingState();
	waiting.doAction(context);
	
	Observer emp1 = new Employees("Viki", "shipmentsAbroad");
	Observer emp2 = new Employees("Kati", "shipmentsToBulgaria");
	Observer emp3 = new Employees("Iordan", "shipmentsInPlovdiv");
	
	emp1.ChangeState(preparing);
	emp2.ChangeState(preparing);
	emp3.ChangeState(preparing);
	
	}
}

