/**
 * @(#) BaseController.java
 */
package ch.netlogix.wilson.core;

import java.sql.Connection;
import java.util.ArrayList;

import ch.netlogix.wilson.core.base.interfaces.IDatabaseController;
import ch.netlogix.wilson.core.interfaces.IController;

/**
 * This class handles all events as centralized class, it
 * notifies clients when events are fired. Clients need
 * to register themselves to this BaseController class
 * 
 * @author Roger Dudler <roger.dudler@gmail.com>
 * @version $Id: BaseController.java 19 2006-01-10 13:26:40Z rdudler $
 * @since 1.0.0
 */
public class BaseController implements IController {

	/** BaseController singleton instance */
	private static BaseController instance = null;
	
	/** Controller registry */
	private ArrayList controllerRegistry = new ArrayList();
	
	/** Database connection */
	protected Connection connection = null;
	
	/**
	 * Private Constructor
	 */
	public BaseController(){
		BaseController.instance = this;
	}
	
	/**
	 * Get an instance of base controller
	 * @return BaseController instance
	 */
	public static BaseController getInstance(){
		return BaseController.instance;
	}
	
	/**
	 * (non-Javadoc)
	 * @see ch.netlogix.wilson.core.interfaces.IController#startup()
	 */
	public void startup(){
		
		System.out.println("BaseController init...");
		
	}
	
	/**
	 * Register a client controller, needs to be called
	 * from each client plugin e.g. in their plugin start
	 * method
	 * @param controller The client controller object
	 * @return true if everything was ok and the controller was registered
	 */
	public boolean registerController(IController controller){
		System.out.println("Registered new client controller: " + controller);
		if(controller instanceof IDatabaseController){
			this.connection = ((IDatabaseController) controller).getConnection();
			System.out.println("Database connection established: " + this.connection);
		}
		return this.controllerRegistry.add(controller);
	}
	
	/**
	 * Unregister a client controller, needs to be called
	 * from each client plugin e.g in their plugin stop
	 * method
	 * @param controller The client controller object
	 * @return true if everything was ok and the controller was removed
	 */
	public boolean unregisterController(IController controller){
		return this.controllerRegistry.remove(controller);
	}

	/**
	 * (non-Javadoc)
	 * @see ch.netlogix.wilson.core.interfaces.IController#shutdown()
	 */
	public void shutdown() {
		
	}

	/**
	 * (non-Javadoc)
	 * @see ch.netlogix.wilson.core.interfaces.IController#notify(int)
	 */
	public void notify(int event) {
		
	}
}
