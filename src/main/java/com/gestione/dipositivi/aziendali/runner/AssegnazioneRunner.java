package com.gestione.dipositivi.aziendali.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.gestione.dipositivi.aziendali.repository.RuoliDao;
import com.gestione.dipositivi.aziendali.service.AssegnazioneService;

@Component
public class AssegnazioneRunner implements ApplicationRunner {
    @Autowired
    AssegnazioneService service;
    @Autowired
    RuoliDao ruoliDao;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
	System.out.println("Run...");

	service.creaDispositivo();
	System.out.println("Dispositivo Creato!!");
	service.creaDipendente();
	System.out.println("Dipendente Creato!!");

    }

}