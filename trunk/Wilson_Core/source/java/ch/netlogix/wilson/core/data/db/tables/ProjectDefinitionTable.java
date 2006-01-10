/**
 * @(#) ProjectDefinitionTable.java
 */
package ch.netlogix.wilson.core.data.db.tables;

import ch.netlogix.wilson.core.base.db.DatabaseTable;
import ch.netlogix.wilson.core.base.db.FieldTypes;

public class ProjectDefinitionTable extends DatabaseTable {
	
	/** Table name */
	public static final String DB_TABLE = "projectDefinitions";
	
	/** Fields */
	public static final String DB_FIELD_ID = "id";
	
	/** Field types */
	public static final int DB_FIELD_TYPE_ID = FieldTypes.DB_FIELD_TYPE_INTEGER;
	
	public ProjectDefinitionTable() {
		
		super();
		
		
		
	}

}
