package com.example.compte_sevice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types = Compte.class)
public interface Compteproj1 {
    Long getcode();
    double getSolde();

}
