package Homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Создать класс Employee c полями id, name, age, salary.
        //Сделать его Comparable по id
        //Создать дополнительные возможности сортировки по: salary, age, name а также по ageAndThenName,
        //т.е. если возраст одинаковый, то сортировать по имени.
        //Создать в классе Main список сотрудников и отсортировать его всеми этими способами
        List<Employee> employees= Arrays.asList(
                new Employee(159,"Harald",35,4100),
                new Employee(285,"Georg",47,4800),
                new Employee(372,"Toby",42,3800),
                new Employee(284,"Daniel",35,5000) );

        System.out.println("Sorting by id");
        //Employee[]employees={harald,georg,tobias,daniel};//Array
        Collections.sort(employees);
        for (Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Sorting by salary");
        employees.sort(new SalaryComparator());
        for (Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Sorting by age");
        Collections.sort(employees,new AgeComparator());
        for (Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Sorting by name");
        Collections.sort(employees,new NameComparator());
        for (Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Sorting by AgeAndThenName");
        Collections.sort(employees,new ageAndThenNameComparator());
        for (Employee employee:employees){
            System.out.println(employee);
        }
        /*
Sorting by id
Employee 159 Harald 35 4100
Employee 284 Daniel 35 5000
Employee 285 Georg 47 4800
Employee 372 Toby 42 3800

Sorting by salary
Employee 372 Toby 42 3800
Employee 159 Harald 35 4100
Employee 285 Georg 47 4800
Employee 284 Daniel 35 5000

Sorting by age
Employee 159 Harald 35 4100
Employee 284 Daniel 35 5000
Employee 372 Toby 42 3800
Employee 285 Georg 47 4800

Sorting by name
Employee 284 Daniel 35 5000
Employee 285 Georg 47 4800
Employee 159 Harald 35 4100
Employee 372 Toby 42 3800

Sorting by AgeAndThenName
Employee 284 Daniel 35 5000
Employee 159 Harald 35 4100
Employee 372 Toby 42 3800
Employee 285 Georg 47 4800
         */
    }
}
