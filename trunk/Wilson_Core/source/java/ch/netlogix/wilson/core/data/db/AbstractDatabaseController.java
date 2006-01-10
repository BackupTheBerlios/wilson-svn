/**
 * @(#) AbstractDatabaseController.java
 */
package ch.netlogix.wilson.core.data.db;

import ch.netlogix.wilson.core.interfaces.IController;

public abstract class AbstractDatabaseController implements IController {

	public abstract void startup();
	public abstract void shutdown();
	public abstract void notify(int event);	

}
