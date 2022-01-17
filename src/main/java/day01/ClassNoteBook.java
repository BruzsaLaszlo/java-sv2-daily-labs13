package day01;

import java.util.*;

public class ClassNoteBook {

    private Map<Student, List<Integer>> notebook = new TreeMap<>();

    public void addStudent(Student student) {
        notebook.put(student, new ArrayList<>());
    }

    public void addMark(int id, int mark) {
        for (var entry : notebook.entrySet()) {
            if (entry.getKey().getId() == id) {
                entry.getValue().add(mark);
            }
        }
    }

    public Map<Student, List<Integer>> getNotebook() {
        return Collections.unmodifiableMap(notebook);
    }
}
