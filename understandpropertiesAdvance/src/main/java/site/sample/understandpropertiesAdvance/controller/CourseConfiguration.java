/**
 * 
 */
package site.sample.understandpropertiesAdvance.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * This is the code for the properties.
 *
 * @author Miguel Caceres
 */
@Component
@ConfigurationProperties("course")
public class CourseConfiguration {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChapterCount() {
		return chapterCount;
	}

	public void setChapterCount(int chapterCount) {
		this.chapterCount = chapterCount;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	private String name;

	private int chapterCount;

	private int rating;

	private String author;

}
