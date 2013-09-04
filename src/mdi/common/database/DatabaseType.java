package mdi.common.database;

public enum DatabaseType {

	Oracle("Oracle", "oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@%s:%d:%s"), 
	OracleRAC("OracleRAC", "oracle.jdbc.driver.OracleDriver", 
			"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=%s(LOAD_BALANCE=yes))(CONNECT_DATA=(SERVICE_NAME=%s)(FAILOVER_MODE=(TYPE=SELECT)(MEITHOD=BASIC)(RETRIES=180)(DELAY=5))))"), 	
	MySQL("MySQL", "com.mysql.jdbc.Driver", "jdbc:mysql://%s:%d/%s");

	//"jdbc:oracle:thin@(DESCRIPTION=(ADDRESS_LIST=%s(LOAD_BALANCE=yes))(CONNECT_DATA=(SERVICE_NAME=%s)(SERVER=DEDICATED)(FAILOVER_MODE=(TYPE=SELECT)(MEITHOD=BASIC)(RETRIES=180)(DELAY=5))))"
	private String databaseName;
	private String driverClass;
	private String formatUrl;

	private DatabaseType(String databaseName, String driverClass, String formatUrl) {
		this.databaseName = databaseName;
		this.driverClass = driverClass;
		this.formatUrl = formatUrl;
	}

	public String getDatabaseName() {
		return this.databaseName;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public String getFormatUrl() {
		return this.formatUrl;
	}
	
}
