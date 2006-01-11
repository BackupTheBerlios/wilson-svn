package ch.netlogix.wilson.core.ui.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import ch.netlogix.wilson.core.base.Constants;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		
		// Add container explorer to the left
		layout.addView(Constants.VIEW_CONTAINER_EXPLORER, IPageLayout.LEFT, 0.3f, IPageLayout.ID_EDITOR_AREA);

	}
}
