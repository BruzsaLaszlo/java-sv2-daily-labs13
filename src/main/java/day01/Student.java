package day01;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private static int LAST_ID = 0;
    private int id;
    private String name;

    public Student(String name) {
        Objects.requireNonNull(name, "invalid name");
        this.name = name;
        id = ++LAST_ID;
    }

    public Student(int id, String name) {
        this(name);
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return id - o.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
