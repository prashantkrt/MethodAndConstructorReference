package MethodRefrence;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void print(String s) {
        System.out.println(s);
    }

    public void printString(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bod", "Noody", "Oswald");
        list.forEach(Test::print);
        Test test = new Test();
        list.forEach(test::printString);
    }
}
