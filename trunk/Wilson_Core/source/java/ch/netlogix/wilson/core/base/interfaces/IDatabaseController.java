/**
 * @(#) IDatabaseController.java
 */
package ch.netlogix.wilson.core.base.interfaces;

import java.sql.Connection;

/**
 * IDatabaseController interface
 * 
 * @author Roger Dudler <roger.dudler@gmail.com>
 * @version $Id$
 * @since 1.0.0
 */
public interface IDatabaseController extends IController {

	public Connection getConnection();
	
}
