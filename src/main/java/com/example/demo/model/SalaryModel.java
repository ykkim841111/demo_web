package com.example.demo.model;

import io.micrometer.common.lang.NonNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SalaryModel {
	private int id;
	@NonNull @Builder.Default
	private String name = "NULL NAME";
	private String email;
}
