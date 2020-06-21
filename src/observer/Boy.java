package observer;

import java.util.ArrayList;
import java.util.List;

public class Boy implements Observable {
 
	
	private List<Observer> observers= new ArrayList<Observer>();
	
	public Boy() {
	}

	@Override
	public void CompleteOrder() {
		for(Observer observer : this.observers) {
			observer.getUpdate();
		}
	}
}
