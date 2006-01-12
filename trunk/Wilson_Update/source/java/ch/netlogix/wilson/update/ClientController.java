/**
 * @(#) ClientController.java
 */
package ch.netlogix.wilson.update;

import ch.netlogix.wilson.core.BaseController;
import ch.netlogix.wilson.core.base.AbstractController;

public class ClientController extends AbstractController {

	/* (non-Javadoc)
	 * @see ch.netlogix.wilson.core.interfaces.IController#startup()
	 */
	public void startup() {
		
		// Register at base controller
		BaseController.getInstance().registerController(this);
		
	}

	/* (non-Javadoc)
	 * @see ch.netlogix.wilson.core.interfaces.IController#shutdown()
	 */
	public void shutdown() {
		
	}

	/* (non-Javadoc)
	 * @see ch.netlogix.wilson.core.interfaces.IController#notify(int)
	 */
	public void notify(int event) {
		
	}

}
