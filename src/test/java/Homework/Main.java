package Homework;

import java.util.*;

public class Main {

    public static void removeLowPerformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        students.add(new Student("Alex", "Group1", 1, Arrays.asList(10, 4, 5, 2)));
        students.add(new Student("Vasya", "Group2", 2, Arrays.asList(4, 5, 7, 9)));
        students.add(new Student("Stasya", "Group3", 1, Arrays.asList(9, 8, 7, 6)));
        students.add(new Student("Grisha", "Group4", 3, Arrays.asList(3, 3, 3, 3)));


        System.out.println("Исходный список студентов:");
        students.forEach(System.out::println);

        removeLowPerformingStudents(students);
        System.out.println("\nСтуденты после удаления неуспевающих:");
        students.forEach(System.out::println);

        promoteStudents(students);
        System.out.println("\nСтуденты после перевода на следующий курс:");
        students.forEach(System.out::println);

        System.out.println("\nСтуденты на курсе 2:");
        printStudents(students, 2);
    }
}



