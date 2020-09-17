package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

// TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object obj) {
        Job myJob = (Job) obj;
        return myJob.id == this.id;
    }

    // TODO: Add custom toString method.

    @Override
    public String toString() {
        return
                "\n" +
                "ID: " + id + "\n" +
                "Name: " + (name.isEmpty() ? "Data not available" : name) + "\n" +
                "Employer: " + (employer.toString().isEmpty() ? "Data not available" : employer) + "\n" +
                "Location: " + (location.toString().isEmpty() ? "Data not available" : location) + "\n" +
                "Position Type: " + (positionType.toString().isEmpty() ? "Data not available" : positionType) + "\n" +
                "Core Competency: " + (coreCompetency.toString().isEmpty() ? "Data not available" : coreCompetency) +
                "\n";
    }



    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer.getValue();
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getLocation() {
        return location.getValue();
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPositionType() {
        return positionType.getValue();
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public String getCoreCompetency() {
        return coreCompetency.getValue();
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
