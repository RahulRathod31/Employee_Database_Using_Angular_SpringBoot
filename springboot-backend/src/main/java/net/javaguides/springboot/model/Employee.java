package net.javaguides.springboot.model;


import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import java.util.*;

@Entity
@Table(name="employees")




public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "first_Name")
    private String firstName;
	
	@Column(name = "last_Name")
    private String lastName;
	
	@Column(name = "salary")
    private int salary;
	
	@Column(name = "manager")
    private String manager;

	@JsonFormat(pattern ="yyyy/MM/dd")
	@Column(name="date_of_Joining")
	private String dateOfJoining;
	
	@JsonFormat(pattern ="yyyy/MM/dd")
	@Column(name="date_of_Birth")
	private String dateOfBirth;
	
	@JsonFormat(pattern ="yyyy/MM/dd")
	@Column(name="exit_date")
	private String exitDate;
public Employee() {
	
}




public Employee(long id, String firstName, String lastName, int salary, String manager, String dateOfJoining,
		String dateOfBirth, String exitDate) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
	this.manager = manager;
	this.dateOfJoining = dateOfJoining;
	this.dateOfBirth = dateOfBirth;
	this.exitDate = exitDate;
}




public String getDateOfJoining() {
	return dateOfJoining;
}




public String getDateOfBirth() {
	return dateOfBirth;
}




public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}




public String getExitDate() {
	return exitDate;
}




public void setExitDate(String exitDate) {
	this.exitDate = exitDate;
}




public void setDateOfJoining(String dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}




public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getManager() {
	return manager;
}
public void setManager(String manager) {
	this.manager = manager;
}


}
