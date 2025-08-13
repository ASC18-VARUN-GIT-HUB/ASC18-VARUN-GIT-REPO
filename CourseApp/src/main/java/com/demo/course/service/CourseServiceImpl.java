package com.demo.course.service;

import com.demo.course.entity.CourseEntity;
import com.demo.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        System.err.println("Returning all courses from database");
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity addCourse(CourseEntity course) {
        System.err.println("Adding a new course: " + course.getCourseName());
        return courseRepository.save(course);
    }

    @Override
    public void removeCourse(Long id) {
        System.err.println("Removing course with ID: " + id);
        courseRepository.deleteById(id);
    }
    // Search by ID
    @Override
    public CourseEntity getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElse(null);
    }

    //  Search by Author
    @Override
    public List<CourseEntity> searchByAuthor(String author) {
        return courseRepository.findByAuthorNameContainingIgnoreCase(author);
    }

    @Override
    public List<CourseEntity> searchByCourseName(String courseName) {
        return courseRepository.findByCourseNameContainingIgnoreCase(courseName);
    }


}

