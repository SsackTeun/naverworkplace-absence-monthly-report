package com.example.excelparser.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HolidayDto {
    private ResultHeader resultHeader;
    private ResultBody body;
}