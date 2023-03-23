package Homework;

import java.util.Comparator;

public class ageAndThenNameComparator implements Comparator<Employee> {
    public int compare(Employee one , Employee two){
        if(one.getAge()== two.getAge()){
            return one.getName().compareTo(two.getName());
        }
        return one.getAge()- two.getAge();
    }
    /*
    public int compare(Employee e1, Employee e2){
     int flag= Integer.compare(e1.getAge(), e2.getAge());
     if(flag==0)
     flag= e1.getName().compareTo(e2.getName());
     return flag;
    }
     */
    /*
    ILI TSCHERES TERNARNIJ OPERATOR
    return Integer.compare(e1.getAge(),e2.getAge())==0 ? e1.getName().compareTo(e2.getName()):Integer.compare(e1.getAge(),e2.getAge());
     */
}
