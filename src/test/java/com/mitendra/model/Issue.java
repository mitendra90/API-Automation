package com.mitendra.model;

public class Issue 
{
  private int projectId;
  private int trackerId;
  private int statusId;
  private int priorityId;
  private String subject;
  private String description;
  private int fixedVersionId;
  private int assignedToId;
  
  public Issue() {
	  
  }
  
public Issue(int projectId, int trackerId, int statusId, int priorityId, String subject, String description,
		int fixedVersionId, int assignedToId) {
	this.projectId = projectId;
	this.trackerId = trackerId;
	this.statusId = statusId;
	this.priorityId = priorityId;
	this.subject = subject;
	this.description = description;
	this.fixedVersionId = fixedVersionId;
	this.assignedToId = assignedToId;
}
public int getProjectId() {
	return projectId;
}
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
public int getTrackerId() {
	return trackerId;
}
public void setTrackerId(int trackerId) {
	this.trackerId = trackerId;
}
public int getStatusId() {
	return statusId;
}
public void setStatusId(int statusId) {
	this.statusId = statusId;
}
public int getPriorityId() {
	return priorityId;
}
public void setPriorityId(int priorityId) {
	this.priorityId = priorityId;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getFixedVersionId() {
	return fixedVersionId;
}
public void setFixedVersionId(int fixedVersionId) {
	this.fixedVersionId = fixedVersionId;
}
public int getAssignedToId() {
	return assignedToId;
}
public void setAssignedToId(int assignedToId) {
	this.assignedToId = assignedToId;
}
  
 
}
