package designpatterns.creational.builder;

public class LunchOrderTelescoping {
	
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrderTelescoping(String bread) {
		this.bread = bread;
	}
	
	public LunchOrderTelescoping(String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}
	
	public LunchOrderTelescoping(String bread, String condiments, String dressing) {
		this(bread, condiments);
		this.dressing = dressing;
		
	}
	
	public LunchOrderTelescoping(String bread, String condiments, String dressing, String meat) {
		this(bread, condiments, dressing);
		this.meat = meat;
	}
	
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getCondiments() {
		return condiments;
	}
	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}
	public String getDressing() {
		return dressing;
	}
	public void setDressing(String dressing) {
		this.dressing = dressing;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	
	
}
