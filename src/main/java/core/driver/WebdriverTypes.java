package core.driver;

public enum WebdriverTypes {
	
	FIREFOX("firefox"),
	CHROME("chrome");
	
	private String driverName;
	
	private WebdriverTypes (String drivername){
		this.driverName=drivername;
	}
	
	public String getDriverName(){
		return driverName;
	}

	public static WebdriverTypes getDriverTypeByName(String name) {
		if (name != null) {
			for (WebdriverTypes driverType : WebdriverTypes.values()) {
				if (name.equalsIgnoreCase(driverType.driverName)) {
					return driverType;
				}
			}
		}
		return null;
	}

}
