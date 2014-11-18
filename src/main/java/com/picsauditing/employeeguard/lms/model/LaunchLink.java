package com.picsauditing.employeeguard.lms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LaunchLink {

	@JsonProperty("TrainingResourceId")
	private String trainingResourceId;

	@JsonProperty("launchUrl")
	private String launchLink;

	public String getTrainingResourceId() {
		return trainingResourceId;
	}

	public void setTrainingResourceId(String trainingResourceId) {
		this.trainingResourceId = trainingResourceId;
	}

	public String getLaunchLink() {
		return launchLink;
	}

	public void setLaunchLink(String launchLink) {
		this.launchLink = launchLink;
	}
}
