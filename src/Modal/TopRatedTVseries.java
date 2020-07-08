package Modal;

public class TopRatedTVseries {
	
	private String primaryTitle;
	private String titleType;  
	private Long averageRating;
		
	public TopRatedTVseries(String primaryTitle, String titleType, Long averageRating) {
		super();
		this.primaryTitle = primaryTitle;
		this.titleType = titleType;
		this.averageRating = averageRating;
	}
	
	public String getPrimaryTitle() {
		return primaryTitle;
	}
	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}
	public String getTitleType() {
		return titleType;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	public Long getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(Long averageRating) {
		this.averageRating = averageRating;
	}
	

}
