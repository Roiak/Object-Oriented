package edu.bennington.cs;

/**
 * Created by rkarlinsky on 3/3/15.
 * a class for students to do shit with courses
 * lab 2 in week 2 class
 */

public class Student {

    //setting up fields

    public String studentName;
    private int studentBirth;
    public int studentTerm;
    private int studentGrade;


    public Student(String studentN, int birthD, int termN, int gradeN){
        this.studentName = studentN;
        this.studentBirth = birthD;
        this.studentTerm= termN;
        this.studentGrade = gradeN;
    }

    public String getStudentName(){
        System.out.println(studentName);
        return this.studentName;
    }

    public int getStudentBirth(){
        return this.studentBirth;
    }

    public int getStudentTerm(){
        return this.studentTerm;
    };

    public int getStudentGrade(){
        return this.studentGrade;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }

    public void setStudentBirth(int birth){
        this.studentBirth = birth;
    }

    public void setStudentTerm(int term){
        if (term > 0 && term < 8 ){
            this.studentTerm = term;
        }
        else{
            System.out.println("that's not a real term man");
        }
    }

    public void setStudentGrade(int grade){
        if (grade > 0 && grade < 4.0){
            this.studentGrade = grade;
        }
        else{
            System.out.println("that's not a real grade dude");
        }
    }
}
