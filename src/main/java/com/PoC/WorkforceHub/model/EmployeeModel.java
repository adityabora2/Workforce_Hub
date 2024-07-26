package com.PoC.WorkforceHub.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

public class EmployeeModel {

    private Long id;

    @NotBlank(message = "Enter your name !")
    @Size(min = 2, max = 50, message = "Name should be between 2 and 50 characters !")
    private String name;

    @NotNull(message = "Age cannot be null !")
    @Min(value = 18, message = "Age must be at least 18 !")
    @Max(value = 65, message = "Age must be less than or equal to 65 !")
    private Integer age;

    @NotBlank(message = "Gender cannot be blank !")
    @Pattern(regexp = "Male|Female|Others", message = "Gender must be either Male, Female, or Others !")
    private String gender;

    @NotBlank(message = "Position cannot be blank !")
    private String position;

    @NotBlank(message = "Email cannot be blank !")
    @Pattern(regexp = "^[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\\.[a-zA-Z]{2,}$", message = "Email should only contain alphanumeric and symbols like '_'")
    private String email;

    @NotNull(message = "Enter your start date !")
    private LocalDate startDate;

    @NotNull(message = "Enter your salary !")
    @Min(value = 20000, message = "Salary must be greater than 20000")
    @Max(value = 2000000, message = "Salary must be less than 10000000")
    private Double salary;

    // Constructors
    
    public EmployeeModel() {}

    public EmployeeModel(Long id, String name, Integer age, String gender, String position, String email, LocalDate startDate, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.email = email;
        this.startDate = startDate;
        this.salary = salary;
    }

    // Getters and Setters
    
    public Long getId() {
    	return id; }
    
    public void setId(Long id) { 
    	this.id = id; }
    
    public String getName() { 
    	return name; }
    
    public void setName(String name) { 
    	this.name = name; }
    
    public Integer getAge() { 
    	return age; }
    
    public void setAge(Integer age) { 
    	this.age = age; }
    
    public String getGender() { 
    	return gender; }
    
    public void setGender(String gender) { 
    	this.gender = gender; }
    
    public String getPosition() { 
    	return position; }
    
    public void setPosition(String position) { 
    	this.position = position; }
    
    public String getEmail() { 
    	return email; }
    
    public void setEmail(String email) { 
    	this.email = email; }
    
    public LocalDate getStartDate() { 
    	return startDate; }
    
    public void setStartDate(LocalDate startDate) { 
    	this.startDate = startDate; }
    
    public Double getSalary() { 
    	return salary; }
    
    public void setSalary(Double salary) { 
    	this.salary = salary; }
    
}