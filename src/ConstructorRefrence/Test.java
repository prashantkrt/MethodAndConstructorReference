package ConstructorRefrence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Bob","Oswald","Tom","Jerry");
        List<Employee> collect = list.stream().map(i -> new Employee(i)).collect(Collectors.toList());
        System.out.println(collect);

        //constructor reference
        List<Employee> collect2= list.stream().map(Employee::new).collect(Collectors.toList());
        System.out.println(collect2);
    }
}
