package org.example;

public class Student {
    int id;
    String firstName;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public Student() {
    }

    String lastName;

    public Student(int id, String firstName, String lastName, int rollNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
    }

    int rollNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
