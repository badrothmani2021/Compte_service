package com.example.compte_sevice.web;


import com.example.compte_sevice.dtos.VirementRequestDTO;
import com.example.compte_sevice.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    @Autowired
    private CompteService compteService;

    @PutMapping(path = "comptes/virement")
    public void virement(VirementRequestDTO request){
        compteService.virement(request.getCodesource(),request.getCodeDestination(),request.getMantant());

    }

}
