package com.demo.course.controller;

import com.demo.course.entity.CourseEntity;
import com.demo.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // GET all courses
    @GetMapping("/allcourses")
    public List<CourseEntity> getAllCourses() {
        return courseService.getAllCourses();
    }

    // POST add a course
    @PostMapping("/add")
    public CourseEntity addCourse(@RequestBody CourseEntity course) {
        return courseService.addCourse(course);
    }

    // DELETE course by ID
    @DeleteMapping("/delete/{id}")
    public String removeCourse(@PathVariable Long id) {
        courseService.removeCourse(id);
        return "Course with ID " + id + " deleted successfully.";
    }
    // Get course by ID
    @GetMapping("/{id}")
    public CourseEntity getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @GetMapping("/search/author/{author}")
    public List<CourseEntity> searchByAuthor(@PathVariable String author) {
        return courseService.searchByAuthor(author);
    }

    @GetMapping("/search/name/{courseName}")
    public List<CourseEntity> searchByCourseName(@PathVariable String courseName) {
        return courseService.searchByCourseName(courseName);
    }

}
