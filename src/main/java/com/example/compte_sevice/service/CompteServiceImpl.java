package com.example.compte_sevice.service;


import com.example.compte_sevice.entities.Compte;
import com.example.compte_sevice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompteServiceImpl implements CompteService {
    @Autowired
    private CompteRepository compteRepository;
    @Override
    public void virement(Long codesource, Long codedestination, double mantant) {

    Compte c1=compteRepository.getById(codesource);
    Compte c2=compteRepository.getById(codedestination);
    c1.setSolde(c1.getSolde()-mantant);
    c2.setSolde(c2.getSolde()+mantant);


    }
}
