package com.jpa.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="StudentDemo")
@Entity
public class StudentDemo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="mobno")
	private Long mobno;
	@Column(name="status")
	private Byte status;
	@Column(name="gender")
	private Character gender;
	@Column(name="percentage")
	private Float percentage;
	@Column(name="dateupdate")
	private Date dateupdate;
	@Column(name="activestatus")
	private Boolean activestatus;
	

}
