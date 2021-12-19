package com.example.compte_sevice.dtos;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Data
public class VirementRequestDTO {
    @Autowired
    private Long codesource;
    private Long codeDestination;
    private double mantant;

}
