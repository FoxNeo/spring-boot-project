/**
 * 
 */
package site.sample.rest.restendpointget.controller;

/**
 * @author Miguel Caceres
 *
 */
public class Course {

	public Course(String name, int chapterCount) {
		super();
		this.name = name;
		this.chapterCount = chapterCount;
	}

	private String name;

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

	private int chapterCount;

}
