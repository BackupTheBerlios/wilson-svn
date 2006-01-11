package ch.netlogix.wilson.update;

import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.*;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class UpdatePlugin extends AbstractUIPlugin implements IStartup {

	//The shared instance.
	private static UpdatePlugin plugin;
	
	/**
	 * The constructor.
	 */
	public UpdatePlugin() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		System.out.println(Platform.getBundle("ch.netlogix.wilson.update").getLocation());
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
	public static UpdatePlugin getDefault() {
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
		return AbstractUIPlugin.imageDescriptorFromPlugin("ch.netlogix.wilson.update", path);
	}

	public void earlyStartup() {
		// TODO Auto-generated method stub
		System.out.println("alkds�jfal");
		
	}
}
