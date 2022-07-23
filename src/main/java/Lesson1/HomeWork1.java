package Lesson1;

import java.util.*;

public class HomeWork1 {

    public static void main(String[] args) {
        //Task 1
        String[] array = {"A", "B", "C", "D", "E", "F", "G"};
        changeElements(array);
        System.out.println();

        //Task 2
        List<String> list = new ArrayList<>();
        arrayToArrayList(array, list);
        System.out.println();

        //Task 3
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange());
        System.out.println("The weight of orangeBox: " + orangeBox.getWeight());

        orangeBox.add(new Orange());
        //orangeBox.add(new Apple());
        System.out.println("The weight of orangeBox: " + orangeBox.getWeight());
        System.out.println("The weight of appleBox: " + appleBox.getWeight());

        System.out.println("Compare weights orangeBox and appleBox: " + appleBox.compare(orangeBox));

        Box<Orange> orangeBox1 = new Box<>(new Orange());
        orangeBox.putInBox(orangeBox1);
        //appleBox.putInBox(orangeBox1);
        System.out.println("The weight of orangeBox: " + orangeBox1.getWeight());

        System.out.println("Compare weights orangeBox and orangeBox1: " + orangeBox1.compare(orangeBox));


    }

    public static <T> void changeElements(T[] array) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        T num = array[number1];
        array[number1] = array[number2];
        array[number2] = num;

        System.out.println(Arrays.toString(array));
    }

    public static <E> void arrayToArrayList(E[] array, List<E> list) {
        Collections.addAll(list, array);
        System.out.println(list.getClass() + ": " + list);
    }


}
