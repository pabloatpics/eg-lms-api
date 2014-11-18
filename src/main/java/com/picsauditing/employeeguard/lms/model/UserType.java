package com.picsauditing.employeeguard.lms.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserType {

	EMPLOYEE("employee"),
	LMS_ADMIN("lmsAdmin"),
	PICS_ADMIN("picsAdmin");

	String type;

	UserType(String type) {
		this.type = type;
	}

	@JsonValue
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
