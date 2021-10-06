package Task1;

import Task1.Country;

import java.util.Comparator;

public class SortByIndepYear implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        return o2.getIndepYear() - o1.getIndepYear();
    }
}
