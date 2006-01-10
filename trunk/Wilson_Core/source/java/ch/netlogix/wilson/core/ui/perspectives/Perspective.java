package ch.netlogix.wilson.core.ui.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import ch.netlogix.wilson.core.BaseController;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		
		BaseController.getInstance().getStatusLineManager().setMessage("Ready");
		
	}
}
