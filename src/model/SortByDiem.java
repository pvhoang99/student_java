package model;

import java.util.Comparator;

public class SortByDiem implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return (int) (a.getDiem() - b.getDiem());
    }

}



