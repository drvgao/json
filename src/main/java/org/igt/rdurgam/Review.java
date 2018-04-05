package org.igt.rdurgam;

import java.util.ArrayList;

public class Review {
	private String reviewerID;
    private String asin;
    private String reviewerName;
    private ArrayList<Integer> helpful;
    private String reviewText;
    private Double overall;
    private String summary;
    private Long unixReviewTime;
    private String reviewTime;
	public String getReviewerID() {
		return reviewerID;
	}
	public void setReviewerID(String reviewerID) {
		this.reviewerID = reviewerID;
	}
	public String getAsin() {
		return asin;
	}
	public void setAsin(String asin) {
		this.asin = asin;
	}
	public String getReviewerName() {
		return reviewerName;
	}
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	public ArrayList<Integer> getHelpful() {
		return helpful;
	}
	public void setHelpful(ArrayList<Integer> helpful) {
		this.helpful = helpful;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public Double getOverall() {
		return overall;
	}
	public void setOverall(Double overall) {
		this.overall = overall;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Long getUnixReviewTime() {
		return unixReviewTime;
	}
	public void setUnixReviewTime(Long unixReviewTime) {
		this.unixReviewTime = unixReviewTime;
	}
	public String getReviewTime() {
		return reviewTime;
	}
	public void setReviewTime(String reviewTime) {
		this.reviewTime = reviewTime;
	}

    
}
