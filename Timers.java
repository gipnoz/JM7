package JavaModule7;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Timers {
    public static void main(String[] args) {

        List<Integer> integer1kArrayList = new ArrayList<>();
        List<Integer> integer10kArrayList = new ArrayList<>();

        List<Integer> integer1kLinkedList = new LinkedList<>();
        List<Integer> integer10kLinkedList = new LinkedList<>();

        List<String> string1kArrayList = new ArrayList<>();
        List<String> string10kArrayList = new ArrayList<>();
        List<String> string1kLinkedList = new LinkedList<>();
        List<String> string10kLinkedList = new LinkedList<>();

        long start;
        long end;

        //ARRAY::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        for (int i = 0; i < 1000; i++) {
            integer1kArrayList.add(i);

        }

        for (int i = 0; i < 10000; i++) {
            integer10kArrayList.add(i);
        }

        start = System.nanoTime();
        integer1kArrayList.add(5);
        end = System.nanoTime();
        System.out.println("Method \"add\" in 1000 list, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        integer10kArrayList.add(5);
        end = System.nanoTime();
        System.out.println("Method \"add\" in 10000 list, time: " + (end - start) + " nano sec.");


        start = System.nanoTime();
        integer10kArrayList.set(500, 5);
        end = System.nanoTime();
        System.out.println("Method  \"set\" in 10000 list, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        integer1kArrayList.set(500, 5);
        end = System.nanoTime();
        System.out.println("Method \"set\" in 1000 list, time: " + (end - start) + " nano sec.");


        start = System.nanoTime();
        integer1kArrayList.get(100);
        end = System.nanoTime();
        System.out.println("Method  \"get\" in 1000 list, time: " + (end - start) + " nano sec.");


        start = System.nanoTime();
        integer10kArrayList.get(100);
        end = System.nanoTime();
        System.out.println("Method  \"get\" in 10000 list, time: " + (end - start) + " nano sec.");


        start = System.nanoTime();
        integer1kArrayList.remove(501);
        end = System.nanoTime();
        System.out.println("Method  \"remove\" in 1000 list, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        integer10kArrayList.remove(501);
        end = System.nanoTime();
        System.out.println("Method  \"remove\" in 10000 list, time: " + (end - start) + " nano sec.");

        //LINKED::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        for (int i = 0; i < 1000; i++) {
            integer1kLinkedList.add(i);

        }

        for (int i = 0; i < 10000; i++) {
            integer10kLinkedList.add(i);
        }

        start = System.nanoTime();
        integer1kLinkedList.add(5);
        end = System.nanoTime();
        System.out.println("Method \"add\" in 1000 list, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        integer10kLinkedList.add(5);
        end = System.nanoTime();
        System.out.println("Method \"add\" in 10000 list, time: " + (end - start) + " nano sec.");


        start = System.nanoTime();
        integer10kLinkedList.set(500, 5);
        end = System.nanoTime();
        System.out.println("Method  \"set\" in 10000 list, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        integer1kLinkedList.set(500, 5);
        end = System.nanoTime();
        System.out.println("Method \"set\" in 1000 list, time: " + (end - start) + " nano sec.");


        start = System.nanoTime();
        integer1kLinkedList.get(100);
        end = System.nanoTime();
        System.out.println("Method  \"get\" in 1000 list, time: " + (end - start) + " nano sec.");


        start = System.nanoTime();
        integer10kLinkedList.get(100);
        end = System.nanoTime();
        System.out.println("Method  \"get\" in 10000 list, time: " + (end - start) + " nano sec.");


        start = System.nanoTime();
        integer1kLinkedList.remove(501);
        end = System.nanoTime();
        System.out.println("Method  \"remove\" in 1000 list, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        integer10kLinkedList.remove(501);
        end = System.nanoTime();
        System.out.println("Method  \"remove\" in 10000 list, time: " + (end - start) + " nano sec.");

        //STRING::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        String string = "String";
        for (int i = 0; i < 1000; i++) {
            string1kLinkedList.add(string);
            string1kArrayList.add(string);
        }

            String str = "String";
            for (int i = 0; i < 10000; i++) {
                string10kLinkedList.add(string);
                string10kArrayList.add(string);
            }

        start = System.nanoTime();
        string1kArrayList.add("String");
        end = System.nanoTime();
        System.out.println("Method \"add\" in 1000 ArrayList, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        string1kLinkedList.add("String");
        end = System.nanoTime();
        System.out.println("Method \"add\" in 10000 LinkedList, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        string1kArrayList.set(500, "String");
        end = System.nanoTime();
        System.out.println("Method \"set\" in 1000 ArrayList, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        string1kLinkedList.set(500, "String");
        end = System.nanoTime();
        System.out.println("Method \"set\" in 1000 LinkedList, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        string1kArrayList.get(100);
        end = System.nanoTime();
        System.out.println("Method \"get\" in 1000 ArrayList, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        string1kLinkedList.get(100);
        end = System.nanoTime();
        System.out.println("Method \"get\" in 1000 LinkedList, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        string1kArrayList.remove(501);
        end = System.nanoTime();
        System.out.println("Method \"remove\" in 1000 ArrayList, time: " + (end - start) + " nano sec.");

        start = System.nanoTime();
        string1kLinkedList.remove(501);
        end = System.nanoTime();
        System.out.println("Method \"remove\" in 1000 LinkedList, time: " + (end - start) + " nano sec.");
    }
}
