/**
 * @(#) IDatabaseController.java
 */
package ch.netlogix.wilson.core.base.db;

import java.sql.Connection;

import ch.netlogix.wilson.core.interfaces.IController;

public interface IDatabaseController extends IController {

	public Connection getConnection();
	
}
