package ru.mirea.inbo2.pract8;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(10);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            boundedWaitList.add(sc.nextLine());
        }
        System.out.println(boundedWaitList);
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>(Arrays.asList(1, 3, 5, 6, 7, 7));
        unfairWaitList.add(7);
        unfairWaitList.remove(1);
        System.out.println(unfairWaitList);
    }
}


