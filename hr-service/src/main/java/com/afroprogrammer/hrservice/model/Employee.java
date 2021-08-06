package com.afroprogrammer.hrservice.model;

public class Employee {
    String Id;
    String FirstName;
    String LastName;
    String Department;

    public Employee() {

    }

    public Employee(String id, String firstName, String lastName, String department) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Department = department;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id='" + Id + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
