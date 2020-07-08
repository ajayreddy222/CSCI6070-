package Modal;

public class Akas {
	
	private String titleid;
	private int ordering;
	private String Title;
	private String region;
	private String language;
	private String types;
	private String attributes;
	private String isOrgiginaltitle;
	
	
	public Akas(String titleid, int ordering, String title, String region, String language, String types,
			String attributes, String isOrgiginaltitle) {
		super();
		this.titleid = titleid;
		this.ordering = ordering;
		Title = title;
		this.region = region;
		this.language = language;
		this.types = types;
		this.attributes = attributes;
		this.isOrgiginaltitle = isOrgiginaltitle;
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
}
