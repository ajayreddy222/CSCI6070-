package Modal;

import java.sql.Date;

public class Basic {
	String nconst;
	String primaryName;
	Date birthYear;
	Date deathYear;
	String primaryProfession;
	String knownForTitles;
	
	
	public Basic(String nconst, String primaryName, Date birthYear, Date deathYear, String primaryProfession,
			String knownForTitles) {
		super();
		this.nconst = nconst;
		this.primaryName = primaryName;
		this.birthYear = birthYear;
		this.deathYear = deathYear;
		this.primaryProfession = primaryProfession;
		this.knownForTitles = knownForTitles;
	}
	public String getNconst() {
		return nconst;
	}
	public void setNconst(String nconst) {
		this.nconst = nconst;
	}
	public String getPrimaryName() {
		return primaryName;
	}
	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}
	public Date getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(Date birthYear) {
		this.birthYear = birthYear;
	}
	public Date getDeathYear() {
		return deathYear;
	}
	public void setDeathYear(Date deathYear) {
		this.deathYear = deathYear;
	}
	public String getPrimaryProfession() {
		return primaryProfession;
	}
	public void setPrimaryProfession(String primaryProfession) {
		this.primaryProfession = primaryProfession;
	}
	public String getKnownForTitles() {
		return knownForTitles;
	}
	public void setKnownForTitles(String knownForTitles) {
		this.knownForTitles = knownForTitles;
	}
	
	
}
