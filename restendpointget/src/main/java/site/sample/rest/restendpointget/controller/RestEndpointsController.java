package site.sample.rest.restendpointget.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Miguel Caceres
 *
 */
@RestController
public class RestEndpointsController {

	/**
	 * examples:
	 * <ul>
	 * <li>http://localhost:8080/course?name=Miguel&chapterCount=6</li>
	 * <li>http://localhost:8080/course</li>
	 * </ul>
	 * 
	 * @param name
	 * @param chapterCount
	 * @return
	 */
	@RequestMapping("/course")
	public Course getEndpoint(@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) String name,
			@RequestParam(value = "chapterCount", defaultValue = "2", required = false) int chapterCount) {
		return new Course(name, chapterCount);
	}

	/**
	 * paths:
	 * <ul>
	 * <li>http://localhost:8080/register/course</li> body { "name": "Miguel",
	 * "chapterCount": 6 }
	 * </ul>
	 * 
	 * @param course
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/register/course")
	public String saveCourse(@RequestBody Course course) {
		return "Your course named " + course.getName() + " With " + course.getChapterCount()
				+ "chapter saved successfuly.";

	}

}
