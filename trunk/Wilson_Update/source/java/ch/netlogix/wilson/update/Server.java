package ch.netlogix.wilson.update;

/**
 * 
 * @author Haydar Ciftci
 *
 */
public class Server {
	/** title of server */
	String title = "";
	
	/** the address of server */
	String location = ""; 
	
	/** priority of server */
	int priority = 0;
	
	/**
	 *  Constructor
	 * 
	 * @param title Title or name of server
	 * @param location URL of server
	 * @param priority Priority of server
	 */
	public Server(String title, String location, int priority) {
		this.title = title;
		this.location = location;
		this.priority = priority;
	}
	
	/**
	 * Constructor
	 * 
	 * @param title Title or name of server
	 * @param location URL of server
	 */
	public Server(String title, String location) {
		this.title = title;
		this.location = location;
	}

	/**
	 * @return Returns the location.
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return Returns the priority.
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @return Returns the title.
	 */
	public String getTitle() {
		return title;
	}
}
