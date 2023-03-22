package Homework;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //Создать класс Employee c полями id, name, age, salary.
        //Сделать его Comparable по id
        //Создать дополнительные возможности сортировки по: salary, age, name а также по ageAndThenName,
        //т.е. если возраст одинаковый, то сортировать по имени.
        //Создать в классе Main список сотрудников и отсортировать его всеми этими способами

        Employee harald= new Employee(159,"Harald",35,4100);
        Employee georg= new Employee(285,"Georg",47,4800);
        Employee tobias= new Employee(372,"Toby",42,3800);
        Employee daniel= new Employee(284,"Daniel",35,5000);

        System.out.println("Sorting by id");
        Employee[]employees={harald,georg,tobias,daniel};
        Arrays.sort(employees);
        for (Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Sorting by salary");
        Arrays.sort(employees,new SalarySorting());
        for (Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Sorting by age");
        Arrays.sort(employees,new AgeSorting());
        for (Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Sorting by name");
        Arrays.sort(employees,new NameSorting());
        for (Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Sorting by AgeAndThenName");
        Arrays.sort(employees,new ageAndThenNameSorting());
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
