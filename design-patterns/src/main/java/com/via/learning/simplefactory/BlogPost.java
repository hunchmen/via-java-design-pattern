package com.via.learning.simplefactory;

import java.time.LocalDate;

public class BlogPost extends Post{

	private String headLine;
	private LocalDate blogTime;

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public LocalDate getNewsTime() {
		return blogTime;
	}

	public void setNewsTime(LocalDate blogTime) {
		this.blogTime = blogTime;
	}
}
