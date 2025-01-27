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
}
