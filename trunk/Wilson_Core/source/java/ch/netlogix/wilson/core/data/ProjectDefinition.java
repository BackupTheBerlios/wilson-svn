/**
 * @(#) ProjectDefinition.java
 */
package ch.netlogix.wilson.core.data;

import java.util.ArrayList;

import ch.netlogix.wilson.core.base.interfaces.IResource;

/**
 * IResource interface
 * 
 * @author Roger Dudler <roger.dudler@gmail.com>
 * @version $Id$
 * @since 1.0.0
 */
public class ProjectDefinition implements IResource {

    /** project name */
    private String name = "";
    
    /** project category id */
    private int categoryID = 0; 
    
    /** project definition version */
    private String version = "";
    
    /** author name */
    private String authorName = "";
    
    /** author email */
    private String authorEmail = "";
    
    /** author url */
    private String authorUrl = "";
    
    /** resources */
    private ArrayList resources = new ArrayList();
    
    /** Children objects for this folder */
    private ArrayList children = new ArrayList();
    
    public ProjectDefinition() {
        
    }

    /**
     * Get the project definition name
     * @return The project definition name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the project definition name
     * @param name Project definition name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get category ID
     * @return Category ID
     */
    public int getCategoryID() {
        return categoryID;
    }

    /**
     * Set category ID
     * @param categoryID Category ID
     */
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }    
    
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }
    
    /**
     * Add a resource to this definition
     * @param obj IResource to add (e.g. Folder or Resource)
     */
    public int addResource(IResource obj){
        this.resources.add(obj);
        return this.resources.size()-1;
    }
    
    /**
     * Get a resource by index
     * @param index
     * @return IResource Resource
     */
    public IResource getResource(int index){
        return (IResource) this.resources.get(index);
    }
    
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
     * (non-Javadoc)
     * @see ch.netlogix.wilson.core.base.interfaces.IResource#getType()
     */
    public int getType(){
        return 0;
    }

    /**
     * (non-Javadoc)
     * @see ch.netlogix.wilson.core.base.interfaces.IResource#setMinimumOccurences(int)
     */
    public void setMinimumOccurences(int min) {
        // Nothing to do
    }

    /**
     * (non-Javadoc)
     * @see ch.netlogix.wilson.core.base.interfaces.IResource#setMaximumOccurences(int)
     */
    public void setMaximumOccurences(int max) {
        // Nothing to do
        
    }

    /**
     * (non-Javadoc)
     * @see ch.netlogix.wilson.core.base.interfaces.IResource#setType(int)
     */
    public void setType(int type) {
        // Nothing to do
        
    }
    
    /**
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "Project \n" + 
                "  [Name: " + this.name + "]\n" +
                "  [Category: " + this.categoryID + "]\n" + 
                "  [Version: " + this.version + "]\n" + 
                "  [Author: " + this.authorName + " <" + this.authorEmail + "> -> " + this.authorUrl + "]\n";
    }
    
}
