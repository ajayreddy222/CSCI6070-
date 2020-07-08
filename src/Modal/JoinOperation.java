package Modal;

import java.sql.Date;

public class JoinOperation {
	
	private String titleid;
	private int ordering;
	private String Title;
	private String region;
	private String language;
	private String types;
	private String attributes;
	private String isOrgiginaltitle;
	private String tconst;
	private String titleType; 
	private String primaryTitle; 
	private String originalTitle;
	private Long isAdult;
	private Date startYear;
	private Date endYear;
	private int runtimeMinutes;
	private String genres;
	
	public JoinOperation(String titleid, int ordering, String title, String region, String language, String types,
			String attributes, String isOrgiginaltitle, String tconst, String titleType, String primaryTitle,
			String originalTitle, Long isAdult, Date startYear, Date endYear, int runtimeMinutes, String genres) {
		super();
		this.titleid = titleid;
		this.ordering = ordering;
		Title = title;
		this.region = region;
		this.language = language;
		this.types = types;
		this.attributes = attributes;
		this.isOrgiginaltitle = isOrgiginaltitle;
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
	
	public String getTitleid() {
		return titleid;
	}
	public void setTitleid(String titleid) {
		this.titleid = titleid;
	}
	public int getOrdering() {
		return ordering;
	}
	public void setOrdering(int ordering) {
		this.ordering = ordering;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
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
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getAttributes() {
		return attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	public String getIsOrgiginaltitle() {
		return isOrgiginaltitle;
	}
	public void setIsOrgiginaltitle(String isOrgiginaltitle) {
		this.isOrgiginaltitle = isOrgiginaltitle;
	}
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
	
}
