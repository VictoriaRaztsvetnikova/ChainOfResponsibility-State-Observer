package chain.of.responsibility;

public class ShipmentsAbroad extends Employee {

	public ShipmentsAbroad() {
		this.deliveryLocation = Employee.shipmentsAbroad;
	}

	@Override
	protected void shipmentMessage(String Message) {
		System.out.println("Shipments Abroad: "+ Message);
	}
}
