package Homework;

import java.util.Comparator;

public class ageAndThenNameSorting implements Comparator<Employee> {
    public int compare(Employee one , Employee two){
        if(one.getAge()== two.getAge()){
            one.getName().compareTo(two.getName());
        }
        return one.getAge()- two.getAge();
    }
}