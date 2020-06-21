package chain.of.responsibility;


public abstract class Employee {

	public static String shipmentsAbroad = "ABROAD";
	public static String shipments“oBulgaria = "BULGARIA";
	public static String shipmentsInPlovdiv = "PLOVDIV";
	
	public String deliveryLocation;
	
	protected Employee nextEmployee;
	
	public void setNextEmployee(Employee nextEmployee) {
		this.nextEmployee = nextEmployee;
	}
	
	public void deliveryMessage(String deliveryLocation, String Message) {
		
		if(this.deliveryLocation.equals(deliveryLocation)) {
			this.shipmentMessage(Message);
			return;
		}
		if(this.nextEmployee != null) {
			this.nextEmployee.deliveryMessage(deliveryLocation, Message);
		}
	}
	abstract protected void shipmentMessage(String Message);
}
	


