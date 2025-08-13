package com.demo.course.model;

public class CourseModel {

    private Long courseId;
    private String courseName;
    private String authorName;
    private int courseDuration;
    private boolean availability; // true = available, false = not available

    // Default Constructor
    public CourseModel() {
    }
//    constructor
    public CourseModel(Long courseId, String courseName, String authorName, int courseDuration, boolean availability) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
        this.courseDuration = courseDuration;
        this.availability = availability;
    }

    // Getters and Setters
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}

