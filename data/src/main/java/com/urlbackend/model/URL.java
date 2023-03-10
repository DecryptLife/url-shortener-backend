package com.urlbackend.model;

public class URL {
	
	private long key;
	private String longURL;
	private String createdDate;
	private String expiringDate;
	private String shortUrl;
	
	
	public String getShortUrl() {
		return shortUrl;
	}


	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}


	public URL(long key, String longURL,String shortUrl, String createdDate, String expiringDate) {
		super();
		this.key = key;
		this.longURL = longURL;
		this.shortUrl = shortUrl;
		this.createdDate = createdDate;
		this.expiringDate = expiringDate;
	}


	public long getKey() {
		return key;
	}


	public void setKey(long key) {
		this.key = key;
	}


	public String getLongURL() {
		return longURL;
	}


	public void setLongURL(String longURL) {
		this.longURL = longURL;
	}


	public String getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	public String getExpiringDate() {
		return expiringDate;
	}


	public void setExpiringDate(String expiringDate) {
		this.expiringDate = expiringDate;
	}


	

	
}
