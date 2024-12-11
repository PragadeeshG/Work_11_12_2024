package com.test1;

public class RegionBasedFollowUpEvaluationOrg {
	private long followUpEvaluationOrgCode;
	private String routineImpactAnalysys;
	private String followUpEvaluationOrgRegion;
	private String followUpEvaluationOrgLevel;
	private long metadataCode;
	private String moduledata;
	private String remarks;
	private String content;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RegionBasedFollowUpEvaluationOrg() {

	}

	public RegionBasedFollowUpEvaluationOrg(long followUpEvaluationOrgCode, String routineImpactAnalysys,
			String followUpEvaluationOrgRegion, String followUpEvaluationOrgLevel, long metadataCode, String moduledata,
			String remarks, String content, String creationDate, String modifiedDate, String entityState) {
		super();
		this.followUpEvaluationOrgCode = followUpEvaluationOrgCode;
		this.routineImpactAnalysys = routineImpactAnalysys;
		this.followUpEvaluationOrgRegion = followUpEvaluationOrgRegion;
		this.followUpEvaluationOrgLevel = followUpEvaluationOrgLevel;
		this.metadataCode = metadataCode;
		this.moduledata = moduledata;
		this.remarks = remarks;
		this.content = content;
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

	public String getRoutineImpactAnalysys() {
		return routineImpactAnalysys;
	}

	public void setRoutineImpactAnalysys(String routineImpactAnalysys) {
		this.routineImpactAnalysys = routineImpactAnalysys;
	}

	public String getFollowUpEvaluationOrgRegion() {
		return followUpEvaluationOrgRegion;
	}

	public void setFollowUpEvaluationOrgRegion(String followUpEvaluationOrgRegion) {
		this.followUpEvaluationOrgRegion = followUpEvaluationOrgRegion;
	}

	public String getFollowUpEvaluationOrgLevel() {
		return followUpEvaluationOrgLevel;
	}

	public void setFollowUpEvaluationOrgLevel(String followUpEvaluationOrgLevel) {
		this.followUpEvaluationOrgLevel = followUpEvaluationOrgLevel;
	}

	public long getMetadataCode() {
		return metadataCode;
	}

	public void setMetadataCode(long metadataCode) {
		this.metadataCode = metadataCode;
	}

	public String getModuledata() {
		return moduledata;
	}

	public void setModuledata(String moduledata) {
		this.moduledata = moduledata;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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