/**
 * @(#) Resource.java
 */
package ch.netlogix.wilson.core.data;

import java.util.ArrayList;

import ch.netlogix.wilson.core.base.interfaces.IResource;

/**
 * Resource class
 * 
 * @author Roger Dudler <roger.dudler@gmail.com>
 * @version $Id$
 * @since 1.0.0
 */
public class Resource implements IResource {
    
    /** Name of the folder */
    private String name = "";
    
    /** Children objects for this folder */
    private ArrayList children = new ArrayList();
    
    /** Minimum occurences */
    private int min = 0;
    
    /** Maximum occurences */
    private int max = 0;
    
    /** Type of resource */
    private int type = 0;
    
    /**
     * Get all children
     * @return Object[] Children
     */
    public Object[] getChildren(){
        return this.children.toArray();
    }
    
    /**
     * Add a new child
     * @param obj Object to add
     * @return true if added
     */
    public boolean addChild(Object obj){
        return this.children.add(obj);
    }
    
    /**
     * Get a child by index
     * @param i Index
     * @return Object Child
     */
    public Object getChild(int i){
        return this.children.get(i);
    }

    /**
     * Get the folder's name
     * @return String folder name
     */
    public String getName() {
        return name;
    }
    
    /**
     * (non-Javadoc)
     * @see ch.netlogix.wilson.core.base.interfaces.IResource#getType()
     */
    public int getType(){
        return this.type;
    }

    /**
     * Set the folder's name
     * @param name Folder name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * (non-Javadoc)
     * @see ch.richclient.projecttool.core.data.interfaces.IResource#setMinimumOccurences(int)
     */
    public void setMinimumOccurences(int min) {
        this.min = min;
    }

    /**
     * (non-Javadoc)
     * @see ch.richclient.projecttool.core.data.interfaces.IResource#setMaximumOccurences(int)
     */
    public void setMaximumOccurences(int max) {
        this.max = max;
    }

    /**
     * (non-Javadoc)
     * @see ch.richclient.projecttool.core.data.interfaces.IResource#setType(int)
     */
    public void setType(int type) {
        this.type = type;
    }
    
    /**
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "Resource\n" +
                (this.name != "" ? "  [Name: " + this.name + "]\n" : "") +
                (this.type != 0 ? "  [Type: " + this.type + "]\n" : "") +
                "  [Minimum Occurences: " + this.min + "]\n" + 
                "  [Maximum Occurences: " + this.max + "]\n"
        ;
        
    }
    
}
