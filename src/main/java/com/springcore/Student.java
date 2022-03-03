package com.springcore;

public class Student {

    private int Student_id;
    private String Student_Name;
    private int Student_class;

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String student_Name) {
        Student_Name = student_Name;
    }

    public int getStudent_class() {
        return Student_class;
    }

    public void setStudent_class(int student_class) {
        Student_class = student_class;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student_id=" + Student_id +
                ", Student_Name='" + Student_Name + '\'' +
                ", Student_class=" + Student_class +
                '}';
    }
    
    /*
    public Student(int student_id, String student_Name, int student_class) {
        Student_id = student_id;
        Student_Name = student_Name;
        Student_class = student_class;
    }

	
	 * public Student() { super(); }
	 */
	 
}
