package chain.of.responsibility;

public class ShipmentsInPlovdiv extends Employee {

	public ShipmentsInPlovdiv() {
		this.deliveryLocation = Employee.shipmentsInPlovdiv;
	}

	@Override
	protected void shipmentMessage(String Message) {
		System.out.println("Shipments in Plovdiv: "+ Message);
	}
}
