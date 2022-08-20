package com.dh.hotel.service;

import com.dh.hotel.dao.impl.FilialDaoH2;
import com.dh.hotel.model.Filial;

import java.sql.SQLException;

public class FilialService {

    private FilialDaoH2 filialDaoH2;

    public FilialService(FilialDaoH2 filialDaoH2){

        this.filialDaoH2=filialDaoH2;

    }

    public Filial salvar(Filial filial) throws SQLException {
        return filialDaoH2.salvar(filial);
    }



}
