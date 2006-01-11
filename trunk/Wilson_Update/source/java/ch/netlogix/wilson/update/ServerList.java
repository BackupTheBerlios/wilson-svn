package ch.netlogix.wilson.update;

import java.io.InputStream;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;


/**
 * Manages servers which hosts project templates
 *
 * @author Haydar Ciftci
 */
public class ServerList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create an empty model
		 Model model = ModelFactory.createDefaultModel();
		 String inputFileName = "serverlist.rdf";
		 
		// use the FileManager to find the input file
		 InputStream in = FileManager.get().open( inputFileName  );
		if (in == null) {
		    throw new IllegalArgumentException(
		                                 "File: " + inputFileName + " not found");
		}

		// read the RDF/XML file
		model.read(in, "");

		// write it to standard out
		model.write(System.out);
		
	}
	
	

}
