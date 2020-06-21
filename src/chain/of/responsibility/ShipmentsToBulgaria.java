package chain.of.responsibility;

public class ShipmentsToBulgaria extends Employee {

	public ShipmentsToBulgaria() {
		this.deliveryLocation = Employee.shipments“oBulgaria;
	}

	@Override
	protected void shipmentMessage(String Message) {
		System.out.println("Shipments to Bulgaria: "+ Message);
	}
}
