/**
 * @(#) ClientController.java
 */
package ch.netlogix.wilson.db;

import java.sql.DriverManager;
import java.sql.SQLException;

import ch.netlogix.wilson.core.BaseController;
import ch.netlogix.wilson.core.data.db.AbstractDatabaseController;

public class ClientController extends AbstractDatabaseController {

	/* (non-Javadoc)
	 * @see ch.netlogix.wilson.core.interfaces.IController#startup()
	 */
	public void startup() {
		
		// Startup database
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection("jdbc:hsqldb:file:wilson;shutdown=true", "sa", "");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// Register at base controller
		BaseController.getInstance().registerController(this);
		
	}

	/* (non-Javadoc)
	 * @see ch.netlogix.wilson.core.interfaces.IController#shutdown()
	 */
	public void shutdown() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see ch.netlogix.wilson.core.interfaces.IController#notify(int)
	 */
	public void notify(int event) {
		
	}

}
