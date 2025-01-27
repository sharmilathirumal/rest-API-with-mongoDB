package com.restapiproject.restapiproject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("employee")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {

    @Id
    private String employee_Id;

    @JsonProperty("first_Name")
    private String first_Name;

    @JsonProperty("last_Name")
    private String last_Name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("location")
    private String location;

    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
