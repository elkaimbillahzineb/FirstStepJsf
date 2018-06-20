package beans;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyPhaseListener  implements  PhaseListener{

	@Override
	public void afterPhase(PhaseEvent pe) {
		// TODO Auto-generated method stub
		System.out.println("Après la phase "+ pe.getPhaseId());
		
	}

	@Override
	public void beforePhase(PhaseEvent pe) {
		// TODO Auto-generated method stub
		System.out.println("Avant la phase "+ pe.getPhaseId());
		
	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE;
	}
	
	
	
	
	

}
