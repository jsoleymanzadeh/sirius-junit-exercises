import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    Student adam;
    ArrayList<Integer> testGrades;

    @Before
    public void setUp() {
        adam = new Student("Adam", 1);
        testGrades = new ArrayList<>();
    }

    @Test
    public void testConstructor() {
        assertEquals("Adam", adam.getName());
        assertEquals(1, adam.getId());
        assertEquals(testGrades, adam.getGrades());
    }

    @Test
    public void testAddGrade() {
        adam.addGrade(90);
        testGrades.add(90);
        assertEquals(testGrades, adam.getGrades());
    }

    @Test
    public void testGetGradeAverage() {
        adam.addGrade(90);
        adam.addGrade(80);
        assertEquals(85, adam.getGradeAverage(), 0);
    }

    @Test
    public void testUpdateGrade() {
        adam.addGrade(80);
        adam.updateGrade(90, 0);
        testGrades.add(90);
        assertEquals(testGrades, adam.getGrades());
    }

    @Test
    public void testDeleteGrade() {
        adam.addGrade(80);
        adam.deleteGrade(0);
        assertEquals(testGrades, adam.getGrades());
    }
}