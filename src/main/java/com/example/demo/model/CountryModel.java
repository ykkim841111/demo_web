package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class CountryModel {
	private int id;
	@NonNull @Builder.Default private String continent = "No CONTINENT";
	@NonNull @Builder.Default private String country = "No Country";
}
