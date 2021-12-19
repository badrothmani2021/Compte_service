package com.example.compte_sevice;

import com.example.compte_sevice.entities.Compte;
import com.example.compte_sevice.enums.TypeCompte;
import com.example.compte_sevice.repositories.CompteRepository;
import com.example.compte_sevice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CompteSeviceApplication  {

	public static void main(String[] args) {

		SpringApplication.run(CompteSeviceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compterepository){

		return args -> {
		compterepository.save(new Compte(null,9800,new Date(), TypeCompte.courant));
		compterepository.save(new Compte(null,12000,new Date(), TypeCompte.epargne));
		compterepository.save(new Compte(null,1000,new Date(), TypeCompte.courant));
		compterepository.save(new Compte(null,12800,new Date(), TypeCompte.epargne));

		compterepository.findAll().forEach(cp->{
			System.out.println(cp.getType());
			System.out.println(cp.getSolde());

		   	});

		};
	}


}
