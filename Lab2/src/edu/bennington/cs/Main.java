package edu.bennington.cs;

/**
 * Created by rkarlinsky on 3/3/15.
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student("Roi", 01 / 02 / 1993, 5, 3);

        Course course = new Course("English", 4351, "Voltaire and Russeou", 15, 415, "A class on Voltair");

        student.getStudentName(); student.setStudentName("Roi");
    }
}
