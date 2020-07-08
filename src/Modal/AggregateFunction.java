package Modal;

public class AggregateFunction {
	
	private String titleType;
	private int COUNT;
		
	public AggregateFunction(String titleType, int cOUNT) {
		super();
		this.titleType = titleType;
		COUNT = cOUNT;
	}
	
	public String getTitleType() {
		return titleType;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	public int getCOUNT() {
		return COUNT;
	}
	public void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
	}
	
}
