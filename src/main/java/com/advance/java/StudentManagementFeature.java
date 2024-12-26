package com.advance.java;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentManagementFeature {
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
        displayStudentStartingWithA(studentList);
        displayStudentsByAgeRange(studentList, 22, 25);
        displayStudentsByCourse(studentList);
        displayStudentsByGender(studentList);
    }

	public static void displayGenderCount(List<Student> studentList) {
        long maleCount = studentList.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Male"))
                .count();
        long femaleCount = studentList.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Female"))
                .count();

        System.out.println("Number of Male Students: " + maleCount);
        System.out.println("Number of Female Students: " + femaleCount);
    }
//
    public static void displayUniqueCourses(List<Student> studentList) {
        Set<String> courses = studentList.stream()  // set id unique identify. not duplicate value allow
                .map(Student::getCourse)  // distinct
                .collect(Collectors.toSet());

        System.out.println("List of Courses:");
        courses.forEach(System.out::println);
    }
    
    public static void displayNewStudents(List<Student> studentList) {
        System.out.println("Students who joined after 2022:");
        studentList.stream()
                .filter(student -> student.getEnrollmentYear() > 2022)
                .map(Student::getName)
                .forEach(System.out::println);
    }
    

    public static void displayStudentsStartingWithG(List<Student> studentList) {
        System.out.println("Students names start with 'G' display:");
        studentList.stream()
                .filter(student -> student.getName().startsWith("G"))
                .map(Student::getName)
                .forEach(System.out::println);
    }
        
    public static void displayStudentStartingWithA(List<Student> studentList) {
    	System.out.println("Students names start with 'A' display:");
    	studentList.stream()
    	.filter(student -> student.getName().startsWith("A"))
    	.map(Student::getName)
    	.forEach(System.out::println);
    }

    public static void displayStudentsByAgeRange(List<Student> studentList, int minAge, int maxAge) {
        System.out.println("Students in the age range of " + minAge + " to " + maxAge + ":");
        studentList.stream()
                .filter(student -> student.getAge() >= minAge && student.getAge() <= maxAge)
                .map(student -> student.getName() + " (Age: " + student.getAge() + ", Gender: " + student.getGender() + ")")
                .forEach(System.out::println); // method refer - ::
    }
    
    public static void displayStudentsByCourse(List<Student> studentList) {
        System.out.println("Students grouped by course:");
        Map<String, List<Student>> studentsByCourse = studentList.stream()
                .collect(Collectors.groupingBy(Student::getCourse));
        studentsByCourse.forEach((course, students) -> {
            System.out.println("Course: " + course);
            students.forEach(student -> System.out.println("  " + student.getName()));
        });
    }
    
    // gropingByGender
    public static void displayStudentsByGender(List<Student> studentList) {
        System.out.println("Students grouped by Gender:");
        Map<String, List<Student>> studentsByGender = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender));
        studentsByGender.forEach((gender, students) -> {
            System.out.println("Gender: " + gender);
            students.forEach(student -> System.out.println("  " + student.getName()));
        });
    }
  
}
