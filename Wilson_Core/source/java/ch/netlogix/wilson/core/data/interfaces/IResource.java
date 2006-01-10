/**
 * @(#) IResource.java
 */
package ch.netlogix.wilson.core.data.interfaces;

/**
 * IResource interface
 * 
 * @author Roger Dudler <roger.dudler@gmail.com>
 * @version $Id$
 * @since 1.0.0
 */
public interface IResource {

    public Object[] getChildren();
    public boolean addChild(Object obj);
    public Object getChild(int i);
    public String getName();
    public void setName(String name);
    public void setMinimumOccurences(int min);
    public void setMaximumOccurences(int max);
    public void setType(int type);
    public int getType();
    
}
