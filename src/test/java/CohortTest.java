import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    Student adam;
    Student bill;
    Cohort sirius;
    List<Student> testList;

    @Before
    public void setUp() {
        sirius = new Cohort();
        adam = new Student("Adam", 1);
        adam.addGrade(90);
        sirius.addStudent(adam);
        bill = new Student("Bill", 2);
        bill.addGrade(80);
        testList = new ArrayList<>();
    }

    @Test
    public void testAddStudent() {
        testList.add(adam);
        assertEquals(testList, sirius.getStudents());
    }

    @Test
    public void testGetCohortAverage() {
        sirius.addStudent(bill);
        assertEquals(85, sirius.getCohortAverage(), 0);
    }
    @Test
    public void testFindStudentById() {
        sirius.addStudent(bill);
        assertEquals("Bill", sirius.findStudentById(2));
    }
}