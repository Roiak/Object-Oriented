package edu.bennington.cs;

/**
 * Created by rkarlinsky on 3/3/15.
 * class to work on our course here at bton
 * lab 2 in week 2 class
 */

public class Course {

    //setting up fields

    public String Department;
    public int CourseNumber;
    public String CourseTitle;
    private int NumberStudents;
    private int RoomNumber;
    public String Description;


    public Course(String department, int number, String title, int students, int room, String description){
        this.Department =department;
        this.CourseNumber = number;
        this.NumberStudents = students;
        this.CourseTitle = title;
        this.Description = description;
    }

    // Setting up course numbah and room numbah

    // a way to get the course number
    public int getCourseNumber(){
        return this.CourseNumber;
    }

    // a way for teacher to set the course number b/w 2000 and 4999
    public void setCourseNumber(int number){
        if ((CourseNumber>=2000 && CourseNumber<3000)||
            (CourseNumber>=4000 && CourseNumber<5000)){
            this.CourseNumber = number;
            //check it
            System.out.println(number);
        }
        else{
            System.out.println("I'm sorry, invalid course numbah");
        }
    }

    public int getRoomNumber(){
        return this.RoomNumber;
    }

    public void setRoomNumber(int room){
        this.RoomNumber = room;
    }

    // setting up department, course title, and course description

    public String getDepartment(){
        return this.Department = Department;
    }

    public void setDepartment(String department){
        if (Department.length()<40){
            this.Department = department;
            System.out.println(department);
        }
        else{
            System.out.println("That department's too long");
        }
    }

    public String getCourseTitle(){
        return this.CourseTitle = CourseTitle;
    }

    public void setCourseTitle(String title){
        if (CourseTitle.length()<400){
            this.CourseTitle = title;
            System.out.println(title);
        }
        else{
            System.out.println("That title's too long");
        }
    }

    public String getDescription(){
        return this.Description = Description;
    }

    public void setDescription(String description){
        if (Description.length()<4000){
            this.Description = description;
            System.out.println(description);
        }
        else{
            System.out.println("That description's too long");
        }
    }


    // setting up number of students

    public int getNumberStudents(){
        return this.NumberStudents;
    }

    public void setNumberStudents(int students){
        if (students<20 && students >5){
            this.NumberStudents = students;
        }
        else if (students <=5){
                System.out.println("Need more students");
            }
        else if (students >= 20){
            System.out.println("Too many students");
        }
    }

}

