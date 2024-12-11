package com.test1;

public class FollowUpEvaluationOrgs {
	private long followUpEvaluationOrgCode;
	private String followUpEvaluationOrgName;
	private String followUpEvaluationOrgDesc;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FollowUpEvaluationOrgs() {

	}

	public FollowUpEvaluationOrgs(long followUpEvaluationOrgCode, String followUpEvaluationOrgName,
			String followUpEvaluationOrgDesc, String remarks, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.followUpEvaluationOrgCode = followUpEvaluationOrgCode;
		this.followUpEvaluationOrgName = followUpEvaluationOrgName;
		this.followUpEvaluationOrgDesc = followUpEvaluationOrgDesc;
		this.remarks = remarks;
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

	public String getFollowUpEvaluationOrgName() {
		return followUpEvaluationOrgName;
	}

	public void setFollowUpEvaluationOrgName(String followUpEvaluationOrgName) {
		this.followUpEvaluationOrgName = followUpEvaluationOrgName;
	}

	public String getFollowUpEvaluationOrgDesc() {
		return followUpEvaluationOrgDesc;
	}

	public void setFollowUpEvaluationOrgDesc(String followUpEvaluationOrgDesc) {
		this.followUpEvaluationOrgDesc = followUpEvaluationOrgDesc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
