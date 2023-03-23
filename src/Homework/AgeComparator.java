package Homework;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    public int compare(Employee one, Employee two){
        return one.getAge()- two.getAge();
    }
}
