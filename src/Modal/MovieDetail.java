package Modal;

public class MovieDetail {
	
	private String primaryTitle;
	private String region;
	private String language;
	private String startYear;
	private String averageRating;
	private String numVotes;
	
	
	
	public MovieDetail(String primaryTitle, String region, String language, String startYear, String averageRating,
			String numVotes) {
		super();
		this.primaryTitle = primaryTitle;
		this.region = region;
		this.language = language;
		this.startYear = startYear;
		this.averageRating = averageRating;
		this.numVotes = numVotes;
	}
	
	
	
	public String getPrimaryTitle() {
		return primaryTitle;
	}
	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}
	public String getNumVotes() {
		return numVotes;
	}
	public void setNumVotes(String numVotes) {
		this.numVotes = numVotes;
	}
	

}
