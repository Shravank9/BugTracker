package com.Shravan.bugtracker.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bugs")

public class Bug {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	String title;
	String description;
	String severity;
	String priority;
	String status;
	String module;
	LocalDate reportedDate;
	LocalDate dueDate;

	public Bug() {

	}

	public Bug(Long id, String title, String description, String severity, String priority, String status,
			String module, LocalDate reportedDate, LocalDate dueDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.severity = severity;
		this.priority = priority;
		this.status = status;
		this.module = module;
		this.reportedDate = reportedDate;
		this.dueDate = dueDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public LocalDate getReportedDate() {
		return reportedDate;
	}

	public void setReportedDate(LocalDate reportedDate) {
		this.reportedDate = reportedDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

}
