package com.demo.course.service;

import com.demo.course.entity.CourseEntity;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<CourseEntity> getAllCourses();
    CourseEntity addCourse(CourseEntity course);
    void removeCourse(Long id);

    CourseEntity getCourseById(Long id);
    List<CourseEntity> searchByAuthor(String author);
    List<CourseEntity> searchByCourseName(String courseName);
}
