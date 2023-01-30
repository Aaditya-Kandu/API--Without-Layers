package com.example.Employee;

public class Employee {

    private String name;
    private int em_Id;
    private String work;
    private int salary;

    public Employee(String name, int em_Id, String work, int salary) {
        this.name = name;
        this.em_Id = em_Id;
        this.work = work;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEm_Id() {
        return em_Id;
    }

    public void setEm_Id(int em_Id) {
        this.em_Id = em_Id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
