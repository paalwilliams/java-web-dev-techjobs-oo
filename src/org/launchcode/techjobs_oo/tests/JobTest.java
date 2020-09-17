package org.launchcode.techjobs_oo.tests;

import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.launchcode.techjobs_oo.*;

import javax.swing.text.Position;

public class JobTest {

    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;
    Job job6;

//    Initialize two jobs for test
    @Before
    public void init() {
        job1 = new Job("Teacher", new Employer("Launchcode"), new Location("Saint Louis"), new PositionType("Educator"), new CoreCompetency("Coding"));
        job2 = new Job("Lead Cook", new Employer("McDonalds"), new Location("Denver"), new PositionType("Food Service"), new CoreCompetency("cooking"));
        job3 = new Job("Coal Miner", new Employer("Coal City"), new Location("Coaltown"), new PositionType("Mining"), new CoreCompetency("Miner"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job6 = new Job("Computer Repairman", new Employer(""), new Location("Cupertino"), new PositionType("Technician"), new CoreCompetency("Soldering"));
    }

//    Test that the job ID is set correctly
    @Test
    public void testSettingJobId() {
        assertFalse(job1.equals(job2));
        assertTrue(job1.getId() == (job2.getId() - 1));
    }

//    Test that the constructor sets all Fields
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Job 3 name should equal Coal Miner", "Coal Miner", job3.getName());
        assertEquals("Job 3 employer should equal Coal City", "Coal City", job3.getEmployer());
        assertEquals("Job 3 location should equal Coaltown", "Coaltown", job3.getLocation());
        assertEquals("Job 3 PositionType should equal Mining", "Mining", job3.getPositionType());
        assertEquals("Job 3 CoreCompetency should equal Mining", "Miner", job3.getCoreCompetency());

    }

//    Check 2 Job instances for equality
    @Test
    public void testJobsForEquality() {
        assertFalse(job4.equals(job5));
    }

//    Check toString method
    @Test
    public void testToStringMethod() {
//        Check for new line in first of string
        String jobString = job1.toString();
        assertEquals(0, jobString.indexOf("\n"));

//        Check for new line in last of string
        int lastCharacter = jobString.length() - 1;
        String lastNL = jobString.substring(lastCharacter);
        assertEquals("\n", lastNL);

//        Check that the string returned matches formatting and content
        assertEquals("\nID: 19\nName: Teacher\nEmployer: Launchcode\nLocation: Saint Louis\nPosition Type: Educator\nCore Competency: Coding\n", job1.toString());

//        Check that the string returned matches formatting and content when empty field is provided
        assertEquals("\nID: 24\nName: Computer Repairman\nEmployer: Data not available\nLocation: Cupertino\nPosition Type: Technician\nCore Competency: Soldering\n", job6.toString());
    }
}