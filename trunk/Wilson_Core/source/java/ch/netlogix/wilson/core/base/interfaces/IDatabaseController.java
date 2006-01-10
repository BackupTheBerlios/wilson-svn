/**
 * @(#) IDatabaseController.java
 */
package ch.netlogix.wilson.core.base.interfaces;

import java.sql.Connection;


public interface IDatabaseController extends IController {

	public Connection getConnection();
	
}
