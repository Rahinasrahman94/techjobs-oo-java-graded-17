package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job testjob0 = new Job();
        assertEquals(9, testjob0.getId());
    }

    @Test
    public void testUniqueId() {
        Job testjob1 = new Job();
        Job testjob2 = new Job();
        assertNotEquals(testjob1.getId(), testjob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //  Employer employer = new Employer("ACME");
        Job testobj3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Employer employer = new Employer("ACME");
        // assertEquals(employer.getValue(),testobj3.getEmployer());
        assertEquals("Product tester", testobj3.getName());
        assertEquals("ACME",testobj3.getEmployer().toString());
        assertEquals("Desert",testobj3.getLocation().toString());
        assertEquals("Quality control",testobj3.getPositionType().toString());
        assertEquals("Persistence",testobj3.getCoreCompetency().toString());
      //  System.out.println(testobj3.getEmployer().toString());
        assertTrue(testobj3 instanceof Job);
        assertTrue(testobj3.getEmployer() instanceof Employer);
        assertTrue(testobj3.getLocation() instanceof Location);
        assertTrue(testobj3.getPositionType() instanceof PositionType);
        assertTrue(testobj3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job testobj4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testobj5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(testobj4, testobj5);

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testobj6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // Job testobj8 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
        //        new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testobj6.toString().startsWith(System.lineSeparator()));
        assertTrue(testobj6.toString().endsWith(System.lineSeparator()));


    }

    //public void testToStringContainsCorrectLabelsAndData()
    @Test
    public void testToStringHandlesEmptyField() {
        Job testobj7 = new Job("Product tester", new Employer(""), new Location("Desert"),
                new PositionType(""), new CoreCompetency("Persistence"));
        // System.out.println("Employer : " +testobj7.getEmployer().toString());
        // System.out.println(testobj7.getLocation().toString());
        assertEquals("Data not available", testobj7.getEmployer().toString());

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testjob9 = new Job("Product tester", new Employer(""), new Location("Desert"),
                new PositionType(""), new CoreCompetency("Persistence"));

        assertEquals(testjob9.toString(), System.lineSeparator()
                + "ID: " + testjob9.getId() + System.lineSeparator()
                + "Name: " + testjob9.getName() + System.lineSeparator()
                + "Employer: " + testjob9.getEmployer() + System.lineSeparator()
                + "Location: " + testjob9.getLocation() + System.lineSeparator()
                + "Position Type: " + testjob9.getPositionType() + System.lineSeparator()
                + "Core Competency: " + testjob9.getCoreCompetency() + System.lineSeparator());


    }
    @Test
    public void testEmployerExtendsJobField() {
        //ChildClass obj = new ChildClass();
        Employer employer = new Employer("ACME");
        assertTrue(employer instanceof JobField);
    }
    @Test
    public void testCoreCompetencyExtendsJobField() {
        //ChildClass obj = new ChildClass();
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");
        assertTrue(coreCompetency instanceof JobField);
    }
    @Test
    public void testLocationExtendsJobField()
    {
        Location location = new Location("Desert");
        assertTrue(location instanceof JobField);
    }
@Test
    public void testPositionTypeExtendsJobField()
{
    PositionType positionType = new PositionType("Quality control");
    assertTrue(positionType instanceof JobField);
}

}
