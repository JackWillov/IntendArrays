package Task1;

import Task1.AddToList;
import Task1.Country;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortByIndepYear sortByIndepYear = new SortByIndepYear();
        List<Country> list = new ArrayList();
        AddToList addToList = new AddToList();
        addToList.listAdd(list);
        System.out.println("Befor sorting");
        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println("After default sorting");
        System.out.println(list.toString());
        Collections.sort(list, sortByIndepYear);
        System.out.println("After  sorting by IndepYear");
        System.out.println(list.toString());

        Iterator<Country> iterator = list.iterator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print capital");
        String userCapital = scanner.next();

        int i = 0;
        for (Country country : list) {
            if (country.getCapital().equals(userCapital)) {
                i++;
                System.out.println(country);
            }
        }
        if (i == 0) {
            System.out.println("Capital not found");
        }
        System.out.println("Print continent");
        String userContinent = scanner.next();
        int i1 = 0;
        for (Country country : list) {
            if (country.getContinent().equals(userContinent)) {
                i1++;
                System.out.println(country.getName());
            }
        }
        if (i1 == 0) {
            System.out.println("Task1.Country not found");
        }

    }

}

