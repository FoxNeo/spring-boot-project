package site.sample.restendpointpost.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEnpoints {

	@RequestMapping("/course")
	public Course getEndpoint(@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) String name,
			@RequestParam(value = "chapterCount", defaultValue = "2", required = false) int chapterCount) {
		return new Course(name, chapterCount);
	}

	/**
	 * POST: http://localhost:8080/register/course <br>
	 * application/json { "name": "Test", "chapterCount": 5 }
	 * 
	 * @param course
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/register/course")
	public String saveCourse(@RequestBody Course course) {
		return "Your course name " + course.getName() + " with " + course.getChapterCount()
				+ "chapters saved successfuly.";
	}

}
