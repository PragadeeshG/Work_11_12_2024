package com.test1;

public class DataFollowUpEvaluationOrgs {
	private long followUpEvaluationOrgCode;
	private String modularData;
	private String dataReqion;
	private String followUpEvaluationOrgTeam;
	private String contact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataFollowUpEvaluationOrgs() {

	}

	public DataFollowUpEvaluationOrgs(long followUpEvaluationOrgCode, String modularData, String dataReqion,
			String followUpEvaluationOrgTeam, String contact, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.followUpEvaluationOrgCode = followUpEvaluationOrgCode;
		this.modularData = modularData;
		this.dataReqion = dataReqion;
		this.followUpEvaluationOrgTeam = followUpEvaluationOrgTeam;
		this.contact = contact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getFollowUpEvaluationOrgCode() {
		return followUpEvaluationOrgCode;
	}

	public void setFollowUpEvaluationOrgCode(long followUpEvaluationOrgCode) {
		this.followUpEvaluationOrgCode = followUpEvaluationOrgCode;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
	}

	public String getDataReqion() {
		return dataReqion;
	}

	public void setDataReqion(String dataReqion) {
		this.dataReqion = dataReqion;
	}

	public String getFollowUpEvaluationOrgTeam() {
		return followUpEvaluationOrgTeam;
	}

	public void setFollowUpEvaluationOrgTeam(String followUpEvaluationOrgTeam) {
		this.followUpEvaluationOrgTeam = followUpEvaluationOrgTeam;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
