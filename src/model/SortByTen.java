package model;

import java.util.Comparator;

public class SortByTen implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getTen().compareTo(s2.getTen());
    }

}
