package com.demo.course.repository;

import com.demo.course.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Long> {
    List<CourseEntity> findByAuthorNameContainingIgnoreCase(String authorName);
    List<CourseEntity> findByCourseNameContainingIgnoreCase(String courseName);
}
