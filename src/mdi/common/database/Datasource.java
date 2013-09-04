package mdi.common.database;

public class Datasource {

	private String datasourceName;
	private DatabaseType databaseType;
	private String ip;
	private int port;
	private String instanceName;
	private String userName;
	private String password;
	
	public Datasource(String datasourceName, DatabaseType databaseType, String ip, int port, String instanceName, String userName, String password) {
		this.datasourceName = datasourceName;
		this.databaseType = databaseType;
		this.ip = ip;
		this.port = port;
		this.instanceName = instanceName;
		this.userName = userName;
		this.password = password;
	}

	public String getDatasourceName() {
		return datasourceName;
	}

	public void setDatasourceName(String datasourceName) {
		this.datasourceName = datasourceName;
	}

	public DatabaseType getDatabaseType() {
		return databaseType;
	}

	public void setDatabaseType(DatabaseType databaseType) {
		this.databaseType = databaseType;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConnectionUrl() {
		if (this.databaseType == DatabaseType.OracleRAC) {
			String[] ips = this.ip.split(",");
			String addressFormat = "(ADDRESS=(PROTOCOL=TCP)(HOST=%s)(PORT=%d))";
			StringBuffer addressBuf = new StringBuffer();
			for(String ip : ips){
				addressBuf.append(String.format(addressFormat, ip, this.port));
			}			
			return String.format(this.databaseType.getFormatUrl(), addressBuf.toString(), this.instanceName);
			
		}
		return String.format(this.databaseType.getFormatUrl(), this.ip, this.port, this.instanceName);
	}
	
	public static void main(String[] args){
		Datasource rac = new Datasource("srcRAC", DatabaseType.OracleRAC, "10.10.1.11,10.10.1.13", 1521, "bossdb", "tzos", "tzos");
		System.out.println(rac.getConnectionUrl());
	}
}
