package day01;

import java.util.*;

public class ClassNoteBook {

    private Map<Student, List<Integer>> studentsWithMark = new TreeMap<>();

    public void addStudent(Student student) {
        studentsWithMark.put(student, new ArrayList<>());
    }

    public void addMark(int id, int mark) {
        for (var entry : studentsWithMark.entrySet()) {
            if (entry.getKey().getId() == id) {
                entry.getValue().add(mark);
            }
        }
    }

    public Map<Student, List<Integer>> getStudentsWithMark() {
        return Collections.unmodifiableMap(studentsWithMark);
    }
}
