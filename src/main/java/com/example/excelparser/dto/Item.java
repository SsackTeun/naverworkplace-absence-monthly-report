package com.example.excelparser.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {
    private String dateKind;
    private String dateName;
    private String isHoliday;
    private String locdate;
    private String seq;
}