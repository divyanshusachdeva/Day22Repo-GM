package com.graymatter.entities;
 
import org.hibernate.validator.constraints.Range;
import org.springframework.data.domain.Persistable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
 
@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "project22Person")
 
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long aadharNum;
	
	@Column(name = "personName")
	@Size(min =3,message = "person must be more than 3 chars length")
	private String name;
	
	@NotBlank
	@Pattern(regexp = "[6789][0-9]{9}",message = "mobile number must be of 10 length starting with either 6, 7, 8 or 9")
	private String mobileNum;
	
	@Range(min = 18,message = "Age must be more that 18 to cast vote")
	private int age;
	
	@Email
	private String email;



}