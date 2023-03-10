package com.urlbackend.controller;

import java.util.Arrays; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urlbackend.model.URL;
import com.urlbackend.service.URLService;

@RestController
public class URLController {
	
	@Autowired
	private URLService service;
	
	// https://localhost:8080/long2short
	@RequestMapping("/")
	public List<URL> getShortForLong()
	{
		String longUrl ="https://campaigntracker.io/blog/short-urls-vs-long-urls?utm_source=blog&utm_campaign=blog%20highlights&utm_medium=website";
		String shortUrl = service.long2short(longUrl);
		
		return Arrays.asList(new URL(123,longUrl,"https://sls.com/"+shortUrl,"03/06/2023 22:17","03/06/2023 23:59"));
	}
	
}
