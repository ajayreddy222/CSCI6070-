package Modal;

import java.sql.Date;

public class TitleBasic {

	  private String tconst;
	  private String titleType; 
	  private String primaryTitle; 
	  private String originalTitle;
	  private Long isAdult;
	  private Date startYear;
	  private Date endYear;
	  private int runtimeMinutes;
	  private String genres;


	public String getTconst() {
		return tconst;
	}



	public void setTconst(String tconst) {
		this.tconst = tconst;
	}



	public String getTitleType() {
		return titleType;
	}



	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}



	public String getPrimaryTitle() {
		return primaryTitle;
	}



	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}



	public String getOriginalTitle() {
		return originalTitle;
	}



	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}



	public Long getIsAdult() {
		return isAdult;
	}



	public void setIsAdult(Long isAdult) {
		this.isAdult = isAdult;
	}



	public Date getStartYear() {
		return startYear;
	}



	public void setStartYear(Date startYear) {
		this.startYear = startYear;
	}



	public Date getEndYear() {
		return endYear;
	}



	public void setEndYear(Date endYear) {
		this.endYear = endYear;
	}



	public int getRuntimeMinutes() {
		return runtimeMinutes;
	}



	public void setRuntimeMinutes(int runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}



	public String getGenres() {
		return genres;
	}



	public void setGenres(String genres) {
		this.genres = genres;
	}



	public TitleBasic(String tconst, String titleType, String primaryTitle, String originalTitle, Long isAdult,
			Date startYear, Date endYear, int runtimeMinutes, String genres) {
		super();
		this.tconst = tconst;
		this.titleType = titleType;
		this.primaryTitle = primaryTitle;
		this.originalTitle = originalTitle;
		this.isAdult = isAdult;
		this.startYear = startYear;
		this.endYear = endYear;
		this.runtimeMinutes = runtimeMinutes;
		this.genres = genres;
	}
	 

	
	
	
}
