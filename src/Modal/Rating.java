package Modal;

public class Rating {

	
	private String tconst;
	private int averageRattig;
	private int numVotes;
	
	
	public Rating(String tconst, int averageRattig, int numVotes) {
		super();
		this.tconst = tconst;
		this.averageRattig = averageRattig;
		this.numVotes = numVotes;
	}
	
	
	public String getTconst() {
		return tconst;
	}
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}
	public int getAverageRattig() {
		return averageRattig;
	}
	public void setAverageRattig(int averageRattig) {
		this.averageRattig = averageRattig;
	}
	public int getNumVotes() {
		return numVotes;
	}
	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}
}
