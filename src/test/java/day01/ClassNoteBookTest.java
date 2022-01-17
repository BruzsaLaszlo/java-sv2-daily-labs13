package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class ClassNoteBookTest {

    ClassNoteBook cnb = new ClassNoteBook();

    Student pistike = new Student("Pistike");
    Student jancsi = new Student("Jancsi");
    Student juliska = new Student("Juliska");

    @BeforeEach
    void before() {
        cnb.addStudent(pistike);
        cnb.addStudent(jancsi);
        cnb.addStudent(juliska);
    }

    @Test
    void addStudentNull() {
        assertThrows(NullPointerException.class, () -> cnb.addStudent(null));
    }

    @Test
    void sortedTest() {
        assertEquals(new TreeSet<>(Set.of(pistike, jancsi, juliska)), cnb.getNotebook().keySet());
    }

    @Test
    void addStudent() {
        assertEquals(3, cnb.getNotebook().size());
        assertTrue(cnb.getNotebook().containsKey(pistike));

        cnb.addStudent(pistike);
        assertEquals(3, cnb.getNotebook().size());
    }

    @Test
    void addMark() {
        assertEquals(0, cnb.getNotebook().get(pistike).size());

        cnb.addMark(pistike.getId(), 5);
        cnb.addMark(pistike.getId(), 5);
        cnb.addMark(pistike.getId(), 5);
        assertEquals(3, cnb.getNotebook().get(pistike).size());
    }
}