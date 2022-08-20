package com.dh.hotel.service;


import com.dh.hotel.dao.impl.FilialDaoH2;
import com.dh.hotel.model.Filial;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class FilialServiceTest {


    FilialService filialService;

    Filial filial;

    final static Logger logger = Logger.getLogger(FilialServiceTest.class);

    @BeforeEach
    void doBefore(){
        filialService = new FilialService(new FilialDaoH2());

    }

    @Test
    public void guardarFilial() throws SQLException {

        logger.info("Iniciando Testes...");



        filial = new Filial("Maraba", "Rua França", "111", "Fortaleza", "Ceará", 0);
        filialService.salvar(filial);
        Assertions.assertTrue(filial.getId() > 0);


        filial = new Filial("Sarauna", "Rua Matos Castro", "23", "Florianópolis", "Santa Catarina", 1);
        filialService.salvar(filial);
        Assertions.assertTrue(filial.getId() > 0);


        filial = new Filial("Supreme", "Rua Luiz de Abreu", "2", "Mogui", "São Paulo", 1);
        filialService.salvar(filial);
        Assertions.assertTrue(filial.getId() > 0);


        filial = new Filial("Tryvision", "Rua Canoas", "587", "Canoas", "Rio Grande do Sul", 1);
        filialService.salvar(filial);
        Assertions.assertTrue(filial.getId() > 0);


        filial = new Filial("New Olimpus", "Rua Tucanos", "787", "Colombo", "Paraná", 1);
        filialService.salvar(filial);
        Assertions.assertTrue(filial.getId() > 0);

        logger.info("Todos os testes realizados...");

    }
}
