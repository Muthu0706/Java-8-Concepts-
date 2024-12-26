package com.advance.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Abinaya", 20, "Female", "Mathematics", 2021));
        studentList.add(new Student(2, "Babu", 22, "Male", "Physics", 2022));
        studentList.add(new Student(3, "Sakthi", 24, "Male", "Chemistry", 2023));
        studentList.add(new Student(4, "Diana", 23, "Female", "Biology", 2023));
        studentList.add(new Student(5, "Esakki", 26, "Male", "Literature", 2020));
        studentList.add(new Student(5, "Muthu", 23, "Male", "Literature", 2020));
        studentList.add(new Student(6, "Gina", 21, "Female", "Mathematics", 2022));
        studentList.add(new Student(7, "George", 25, "Male", "Physics", 2023));
        studentList.add(new Student(8, "Hannah", 22, "Female", "Chemistry", 2022));

        displayGenderCount(studentList);
        displayUniqueCourses(studentList);
        displayNewStudents(studentList);
        displayStudentsStartingWithG(studentList);
        displayStudentsByAgeRange(studentList, 22, 25);
        categorizeByAgeGroup(studentList);
    }

    public static void displayGenderCount(List<Student> studentList) {
        long maleCount = 0;
        long femaleCount = 0;

        for (Student student : studentList) {
            if (student.getGender().equalsIgnoreCase("Male")) {
                maleCount++;
            } else if (student.getGender().equalsIgnoreCase("Female")) {
                femaleCount++;
            }
        }

        System.out.println("Number of Male Students: " + maleCount);
        System.out.println("Number of Female Students: " + femaleCount);
    }

    public static void displayUniqueCourses(List<Student> studentList) {
        Set<String> courses = new HashSet<>();
        for (Student student : studentList) {
            courses.add(student.getCourse());
        }

        System.out.println("List of Courses:");
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public static void displayNewStudents(List<Student> studentList) {
        System.out.println("Students who joined after 2022:");
        for (Student student : studentList) {
            if (student.getEnrollmentYear() > 2022) {
                System.out.println(student.getName());
            }
        }
    }

    public static void displayStudentsStartingWithG(List<Student> studentList) {
        System.out.println("Students whose names start with 'G':");
        for (Student student : studentList) {
            if (student.getName().startsWith("G")) { // Prefix 
                System.out.println(student.getName());
            }
        }
    }

    public static void displayStudentsByAgeRange(List<Student> students, int minAge, int maxAge) {
        System.out.println("Students in the age range " + minAge + " to " + maxAge + ":");
        for (Student student : students) {
            if (student.getAge() >= minAge && student.getAge() <= maxAge) {
                System.out.println(student.getName() + "(Age: " + student.getAge() + ", Gender: " + student.getGender() + ")");
            }
        }
    }
    
    private static Map<Float, List<Student>> categorizeByAgeGroup(List<Student> studentList) {
        Map<Float, List<Student>> ageRangeMap = new HashMap<>();
        for (Student student : studentList) {
            // Assume ageGroup can be floats representing age ranges like 20.0, 25.0, etc.
            Float ageGroup = (float) (student.getAge() / 5) * 5; // Group into 5-year ranges            
            // Use the ageGroup as a key
            ageRangeMap.computeIfAbsent(ageGroup, k -> new ArrayList<>()).add(student);
        }
        return ageRangeMap;
    }
}