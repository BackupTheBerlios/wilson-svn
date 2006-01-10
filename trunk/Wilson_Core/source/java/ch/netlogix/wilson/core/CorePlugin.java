/**
 * @(#) CorePlugin.java
 */
package ch.netlogix.wilson.core;

import org.eclipse.ui.plugin.*;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 * 
 * @author Roger Dudler <roger.dudler@gmail.com>
 * @version $Id: CorePlugin.java 19 2006-01-10 13:26:40Z rdudler $
 * @since 1.0.0
 */
public class CorePlugin extends AbstractUIPlugin {

	//The shared instance.
	private static CorePlugin plugin;
	
	/**
	 * The constructor.
	 */
	public CorePlugin() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		
		// Startup base controller
		BaseController.getInstance().startup();
	}
	
	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static CorePlugin getDefault() {
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
		return AbstractUIPlugin.imageDescriptorFromPlugin("ch.netlogix.wilson.core", path);
	}
}
