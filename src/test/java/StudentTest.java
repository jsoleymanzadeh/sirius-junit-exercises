import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testConstructor() {
        Student adam = new Student("Adam", 1);
        assertEquals("Adam", adam.getName());
        assertEquals(1, adam.getId());
        assertEquals(new ArrayList<Integer>(), adam.getGrades());
    }

    @Test
    public void testAddGrade() {
        Student adam = new Student("Adam", 1);
        adam.addGrade(90);
        ArrayList<Integer> testGrades = new ArrayList<>();
        testGrades.add(90);
        assertEquals(adam.getGrades(), testGrades);
    }

    @Test
    public void testGetGradeAverage() {
        Student adam = new Student("Adam", 1);
        adam.addGrade(90);
        adam.addGrade(80);
        assertEquals(adam.getGradeAverage(), 85, 0);
    }
}