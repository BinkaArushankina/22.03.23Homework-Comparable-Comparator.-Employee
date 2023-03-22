package Homework;

import java.util.Comparator;

public class AgeSorting implements Comparator<Employee> {
    public int compare(Employee one, Employee two){
        return one.getAge()- two.getAge();
    }
}
