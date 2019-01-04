package com.libedi.demo;

import lombok.Getter;

@Getter
public enum TestEnum {
	USER("user"), ADMIN("admin");
	
	private final String name;
	private TestEnum(final String name) {
		this.name = name;
	}
	
}
