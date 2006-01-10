/**
 * @(#) IController.java
 */
package ch.netlogix.wilson.core.base.interfaces;

/**
 * IController interface
 * 
 * @author Roger Dudler <roger.dudler@gmail.com>
 * @version $Id: IController.java 17 2006-01-09 22:57:07Z rdudler $
 * @since 1.0.0
 */
public interface IController {

	/**
	 * Startup the controller
	 */
	public void startup();
	
	/**
	 * Shutdown the controller
	 */
	public void shutdown();
	
	/**
	 * Handle event notify for given event id
	 * @param event Event ID
	 */
	public void notify(int event);
	
}
