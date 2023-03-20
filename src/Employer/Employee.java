package Employer;

import java.util.Objects;

public class Employee {
    private boolean isPayedPerHour;
    private int age;
    private String name;
    private String department;

    public Employee(String name, String department, int age, boolean isPayedPerHour){
        this.name = name;
        this.department = department;
        this.age =age;
        this.isPayedPerHour = isPayedPerHour;
    }
    public boolean isPayedPerHour() {
        return isPayedPerHour;
    }

    public void setPayedPerHour(boolean payedPerHour) {
        isPayedPerHour = payedPerHour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "isPayedPerHour=" + isPayedPerHour +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
    public boolean isCanLeadInterviews() {
        return department.equals("Manadement") || department.equals("Software");
    }
    public boolean isCanAttendTraining() {
        return  department.equals("Software") && age >= 18;
    }
}