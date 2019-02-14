package org.launchcode.models.forms;

import com.sun.istack.internal.NotNull;
import org.launchcode.models.CoreCompetency;
import org.launchcode.models.Employer;
import org.launchcode.models.Location;
import org.launchcode.models.PositionType;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobForm {

    @NotNull
    @Size(min=1, max=21, message = "Name may not be empty or longer than 20")
    private String name;

    @NotNull
    private int employerId;

    @NotNull
    @Size(min=1, message = "Employer may not be empty")
    private String employer;

    @NotNull
    @Size(min=1, message = "Location may not be empty")
    private String location;

    @NotNull
    @Size(min=1, max=21, message = "The skills needed may not be empty or longer than 20")
    private String coreCompetency;

    @NotNull
    @Size(min=1, max=21, message = "The position may not be empty or longer than 20")
    private String positionType;



    /*
        TODO #3 - Included other fields needed to create a job,
        with correct validation attributes and display names.
        Don't forget to add getters and setters
     */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Integer employerId) { this.employerId = employerId; }

    public String getEmployer() { return employer; }

    public void setEmployer(String employer) { this.employer = employer; }

    public String getLocation() { return location; }

    public void setLocation(String location) {this.location = location; }

    public String getPositionType() { return positionType; }

    public void setPositionType(String positionType) { this.positionType = positionType; }

    public String getCoreCompetency() { return coreCompetency; }

    public void setCoreCompetency(String coreCompetency) { this.coreCompetency = coreCompetency; }



    public JobForm() {

        JobData jobData = JobData.getInstance();

        /*
            TODO #4 - populate the other ArrayList collections needed in the view
        */

        ArrayList<Employer> employers = JobData.getEmployers().findAll();

        ArrayList<Location> locations = JobData.getLocations().findAll();

        ArrayList<CoreCompetency> coreCompetencies = JobData.getCoreCompetencies().findAll();

        ArrayList<PositionType> positionTypes = JobData.getPositionTypes().findAll();





    public ArrayList<Employer> getEmployers() { return employers; }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<CoreCompetency> getCoreCompetencies() {
        return coreCompetencies;
    }

    public void setCoreCompetencies(ArrayList<CoreCompetency> coreCompetencies) {
        this.coreCompetencies = coreCompetencies;
    }

    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }

    public void setPositionTypes(ArrayList<PositionType> positionTypes) {
        this.positionTypes = positionTypes;
    }
}

}