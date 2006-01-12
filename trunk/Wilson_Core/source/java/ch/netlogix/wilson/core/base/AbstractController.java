/**
 * @(#) AbstractDatabaseController.java
 */
package ch.netlogix.wilson.core.base;

import ch.netlogix.wilson.core.base.interfaces.IController;

/**
 * This is a abstract implementation of the IController
 * interface for use in each client plugin
 * 
 * @author Roger Dudler <roger.dudler@gmail.com>
 * @version $Id$
 * @since 1.0.0
 */
public abstract class AbstractController implements IController {

	/** BaseController singleton instance */
	private static AbstractController instance = null;
	
	/**
	 * Private Constructor
	 */
	public AbstractController(){
		AbstractController.instance = this;
	}
	
	/**
	 * Get an instance of base controller
	 * @return BaseController instance
	 */
	public static AbstractController getInstance(){
		return AbstractController.instance;
	}
	
	public abstract void startup();
	public abstract void shutdown();
	public abstract void notify(int event);	

}
