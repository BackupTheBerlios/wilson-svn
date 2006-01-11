/**
 * @(#) ContainerExplorerView.java
 */
package ch.netlogix.wilson.core.ui.views;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class ContainerExplorerView extends ViewPart {

	/** Tree viewer */
	private TreeViewer viewer = null;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		
		this.viewer = new TreeViewer(parent, SWT.NONE);
		
		getViewSite().getActionBars().getStatusLineManager().setMessage("Container Tree loaded");

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPart#setFocus()
	 */
	public void setFocus() {

		this.viewer.getControl().setFocus();
		
	}

}
