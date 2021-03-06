package ch.netlogix.wilson.db;

import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.*;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class DbPlugin extends AbstractUIPlugin implements IStartup {

	//The shared instance.
	private static DbPlugin plugin;
	
	/**
	 * The constructor.
	 */
	public DbPlugin() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);

		// Start controller
		new ClientController();
		ClientController.getInstance().startup();
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		
		// Shutdown controller
		ClientController.getInstance().shutdown();
		
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static DbPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("ch.netlogix.wilson.db", path);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IStartup#earlyStartup()
	 */
	public void earlyStartup() {
		
	}
}
