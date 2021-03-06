/**
 * @(#) AbstractDatabaseController.java
 */
package ch.netlogix.wilson.core.base.db;

import java.sql.Connection;

import ch.netlogix.wilson.core.base.interfaces.IDatabaseController;

/**
 * This is a abstract implementation of the IDatabaseController
 * interface for use in plugins which provides datasources like
 * <code>ch.netlogix.wilson.db</code>
 * 
 * @author Roger Dudler <roger.dudler@gmail.com>
 * @version $Id$
 * @since 1.0.0
 */
public abstract class AbstractDatabaseController implements IDatabaseController {

	/** BaseController singleton instance */
	private static AbstractDatabaseController instance = null;
	
	/** Database connection */
	protected Connection connection = null;
	
	/**
	 * Private Constructor
	 */
	public AbstractDatabaseController(){
		AbstractDatabaseController.instance = this;
	}
	
	/**
	 * Get an instance of base controller
	 * @return BaseController instance
	 */
	public static AbstractDatabaseController getInstance(){
		return AbstractDatabaseController.instance;
	}
	
	/**
	 * Get the database connection
	 * @return Connection Database connection
	 */
	public Connection getConnection(){
		return connection;
	}
	
	public abstract void startup();
	public abstract void shutdown();
	public abstract void notify(int event);	

}
