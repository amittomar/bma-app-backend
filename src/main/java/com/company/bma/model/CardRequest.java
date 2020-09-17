/*
	 * Swagger BookMark Mangement Application
	 * This is a BookMark Management Application.   You can create short url of your bookmark and you can manage bookmark by various groups. 
	 *
	 * OpenAPI spec version: 1.0.0
	 * Contact: rakesh8693@gmail.com
	 *
	 * NOTE: This class is auto generated by the swagger code generator program.
	 * https://github.com/swagger-api/swagger-codegen.git
	 * Do not edit the class manually.
	 */
package com.company.bma.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CardRequest {
	@NonNull
	private Integer surlId;
	@NonNull
	private String title;
	@NonNull
	private String description;
	@NonNull
	private String icon;
}
