package ch.netlogix.wilson.update;

import java.io.InputStream;

import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.*;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.BundleContext;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;

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
		String RDFFile = Platform.getBundle("ch.netlogix.wilson.update").getLocation() + "serverlist.rdf";
		
//		 create an empty model
		 Model model = ModelFactory.createDefaultModel();

		 // use the FileManager to find the input file
		 InputStream in = FileManager.get().open( RDFFile );
		if (in == null) {
		    throw new IllegalArgumentException(
		                                 "File: " + RDFFile + " not found");
		}

//		 read the RDF/XML file
		model.read(in, "");

//		 write it to standard out
		model.write(System.out);
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
		System.out.println("ölakdjsf");
	}
}
