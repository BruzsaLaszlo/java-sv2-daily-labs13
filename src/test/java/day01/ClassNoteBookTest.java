package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void addStudent() {
        assertEquals(3, cnb.getStudentsWithMark().size());

        cnb.addStudent(pistike);
        assertEquals(3, cnb.getStudentsWithMark().size());
    }

    @Test
    void addMark() {
        cnb.addMark(pistike.getId(), 5);
        cnb.addMark(pistike.getId(), 5);
        cnb.addMark(pistike.getId(), 5);
        assertEquals(3, cnb.getStudentsWithMark().get(pistike).size());
    }
}