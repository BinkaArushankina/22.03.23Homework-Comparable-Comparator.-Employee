package Homework;

import java.util.Comparator;

public class ageAndThenNameComparator implements Comparator<Employee> {
    public int compare(Employee one , Employee two){
        if(one.getAge()== two.getAge()){
            return one.getName().compareTo(two.getName());
        }
        return one.getAge()- two.getAge();
    }
}
