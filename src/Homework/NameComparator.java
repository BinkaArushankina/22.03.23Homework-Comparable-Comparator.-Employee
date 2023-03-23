package Homework;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    public int compare(Employee one, Employee two){
        return one.getName().compareTo(two.getName());
    }
}
