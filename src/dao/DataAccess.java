package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modal.*;
import db.DbConnection;


public class DataAccess {
	
	public List<Basic> getBasic() throws SQLException{
		List<Basic> basics = new ArrayList<Basic>();
		String query = "select top(500) * FROM Name.basic";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			Basic basic = new Basic(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getString(5), rs.getString(6));
			basics.add(basic);
		}
		DbConnection.closeConnection();
		return basics;		
	}
	
	public List<Akas> getAkas() throws SQLException{
		List<Akas> akass = new ArrayList<Akas>();
		String query = "select top(5000) * from Title.akas";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			Akas akas = new Akas(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6) , rs.getString(7) , rs.getString(8));
			akass.add(akas);
		}
		DbConnection.closeConnection();
		return akass;		
	}

	
	public List<Crew> getCrew() throws SQLException{
		List<Crew> crews = new ArrayList<Crew>();
		String query = "select top(5000) * from Title.crew";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			Crew crew = new Crew(rs.getString(1), rs.getString(2), rs.getString(3));
			crews.add(crew);
		}
		DbConnection.closeConnection();
		return crews;		
	}
	
	public List<Episode> getEpisode() throws SQLException{
		List<Episode> episodes = new ArrayList<Episode>();
		String query = "select top(5000) * from Title.episode";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			Episode episode = new Episode(rs.getString(1), rs.getString(2), rs.getInt(3) , rs.getInt(4) );
			episodes.add(episode);
		}
		DbConnection.closeConnection();
		return episodes;		
	}
	
	public List<Principal> getPrincipal() throws SQLException{
		List<Principal> principals = new ArrayList<Principal>();
		String query = "select top(5000) * from Title.principals";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			Principal principal = new Principal(rs.getString(1), rs.getInt(2), rs.getString(3) , rs.getString(4) , rs.getString(5) , rs.getString(6));
			principals.add(principal);
		}
		DbConnection.closeConnection();
		return principals;		
	}
	
	public List<Rating> getRating() throws SQLException{
		List<Rating> ratings = new ArrayList<Rating>();
		String query = "select top(5000) * from Title.ratings";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			Rating rating = new Rating(rs.getString(1), rs.getInt(2), rs.getInt(3));
			ratings.add(rating);
		}
		DbConnection.closeConnection();
		return ratings;		
	}
	
	public List<TitleBasic> getTitleBasic() throws SQLException{
		List<TitleBasic> titlebasics = new ArrayList<TitleBasic>();
		String query = "select top(5000) * from Title.basic";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			TitleBasic titlebasic = new TitleBasic(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getLong(5), rs.getDate(6) ,rs.getDate(7), rs.getInt(8), rs.getString(9));
			titlebasics.add(titlebasic);
		}
		DbConnection.closeConnection();
		return titlebasics;		
	}
	
	public List<MovieDetail> getMovieDetail() throws SQLException{
		List<MovieDetail> moviedetails = new ArrayList<MovieDetail>();
		String query = "Select top(500) * from dbo.Movies_Details";
		ResultSet rs = DbConnection.getQueryResult1(query);
		while (rs.next()) {
			MovieDetail moviedetail = new MovieDetail(rs.getString(1), rs.getString(2) , rs.getString(3) , rs.getString(4) , rs.getString(5) , rs.getString(6));
			moviedetails.add(moviedetail);
		}
		DbConnection.closeConnection();
		return moviedetails;		
	}
	
	public List<DirectorDetail> getDirectorDetail() throws SQLException{
		List<DirectorDetail> directordetails = new ArrayList<DirectorDetail>();
		String query = "Select top(100) * from dbo.Directors_Details";
		ResultSet rs = DbConnection.getQueryResult1(query);
		while (rs.next()) {
			DirectorDetail directordetail = new DirectorDetail(rs.getString(1));
			directordetails.add(directordetail);
		}
		DbConnection.closeConnection();
		return directordetails;		
	}
	
	public List<TopRatedTVseries> getTopRatedTVseries() throws SQLException{
		List<TopRatedTVseries> tvseriess = new ArrayList<TopRatedTVseries>();
		String query = "{call dbo.getTopRatedTVseries}";
		ResultSet rs = DbConnection.getQueryResult1(query);
		while (rs.next()) {
			TopRatedTVseries tvseries = new TopRatedTVseries(rs.getString(1), rs.getString(2) , rs.getLong(3));
			tvseriess.add(tvseries);
		}
		DbConnection.closeConnection();
		return tvseriess;		
	}
	
	public List<AggregateFunction> getAggregateFunction() throws SQLException{
		List<AggregateFunction> aggregatefunctions = new ArrayList<AggregateFunction>();
		String query = "SELECT titletype,count(titletype) NumberOfTitles FROM title.basic GROUP BY titletype ORDER BY titleType";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			AggregateFunction aggregatefunction = new AggregateFunction(rs.getString(1) , rs.getInt(2));
			aggregatefunctions.add(aggregatefunction);
		}
		DbConnection.closeConnection();
		return aggregatefunctions;		
	}
	
	public List<SetOperation> getSetOperation() throws SQLException{
		List<SetOperation> setoperations = new ArrayList<SetOperation>();
		String query = "SELECT top(500) tconst,averageRating, numVotes FROM Title.ratings WHERE averageRating>7 UNION ALL\r\n" + 
				"SELECT top(500) tconst,averageRating, numVotes FROM Title.ratings WHERE numVotes>10";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			SetOperation setoperation = new SetOperation(rs.getString(1) , rs.getInt(2) , rs.getInt(3));
			setoperations.add(setoperation);
		}
		DbConnection.closeConnection();
		return setoperations;		
	}

	public List<NestedQueries> getNestedQueries() throws SQLException{
		List<NestedQueries> nestedqueriess = new ArrayList<NestedQueries>();
		String query = "Select top(1000)* From Title.akas WHERE titleId in (Select tconst From title.basic)";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			NestedQueries nestedqueries = new NestedQueries(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6) , rs.getString(7) , rs.getString(8));
			nestedqueriess.add(nestedqueries);
		}
		DbConnection.closeConnection();
		return nestedqueriess;		
	}
	
	public List<JoinOperation> getJoinOperation() throws SQLException{
		List<JoinOperation> joinoperations = new ArrayList<JoinOperation>();
		String query = "SELECT TOP 20 * FROM Title.akas a INNER JOIN Title.basic b ON b.tconst=a.titleId;";
		ResultSet rs = DbConnection.getQueryResult(query);
		while (rs.next()) {
			JoinOperation joinoperation = new JoinOperation(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6) , rs.getString(7) , rs.getString(8) , rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getLong(13), rs.getDate(14) ,rs.getDate(15), rs.getInt(16), rs.getString(17));
			joinoperations.add(joinoperation);
		}
		DbConnection.closeConnection();
		return joinoperations;		
	}
	
}


