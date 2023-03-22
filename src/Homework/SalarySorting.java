package Homework;

import java.util.Comparator;

public class SalarySorting implements Comparator<Employee> {
    public int compare(Employee one , Employee two){
        return one.getSalary()- two.getSalary();
    }
}
