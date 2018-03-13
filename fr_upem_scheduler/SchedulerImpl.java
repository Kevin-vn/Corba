package fr_upem_scheduler;

import java.util.ArrayList;
import java.util.List;

public class SchedulerImpl extends SchedulerPOA {
	
	private List<Request> requests = new ArrayList<>();

	@Override
	public boolean postRequest(Request r) {
		return requests.add(r);
	}

	@Override
	public Request getRequest(short index) {
		return requests.get(index);
	}

	@Override
	public boolean checkValues(Request r) throws unknown_values {
		if(r.request_object == null && r.request_interface == null && r.request_operation == null) {
			throw new unknown_values("Object, Interface and Operation are not definied");
		}
		return true;
	}

	@Override
	public void removeRequest(short index) {
		requests.remove(index);
	}

}
