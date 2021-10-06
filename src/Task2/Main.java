package Task2;

import Task1.AddToList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AddToMassFibonachiNumber addToMassFibonachiNumber = new AddToMassFibonachiNumber();
        int[] fibonachiArray = new int[12];
        addToMassFibonachiNumber.addFibonachiToMass(fibonachiArray);
        List<String> list = new ArrayList<>();
        AddToListSomeString addToListSomeString = new AddToListSomeString();
        addToListSomeString.addSomeString(list);
        int test = -1;
        for (int i = 0; i < list.size(); i++) {
            for (int i1 = 0; i1 < fibonachiArray.length; i1++) {
                if (i == fibonachiArray[i1]) {
                    if (test == fibonachiArray[i1]) {
                        continue;
                    } else {
                        System.out.println(list.get(i));
                    }
                    test = fibonachiArray[i1];

                }
            }


        }

    }
}
