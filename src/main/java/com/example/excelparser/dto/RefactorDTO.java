package com.example.excelparser.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefactorDTO {
    private String name;

    private String email; // 유니크
    //private String department;

    private String position;
    private List<String> duration;
}
