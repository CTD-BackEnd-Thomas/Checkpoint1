package com.dh.hotel.dao.impl;

import com.dh.hotel.dao.ConfiguracaoJDBC;
import com.dh.hotel.dao.IDao;
import com.dh.hotel.model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilialDaoH2 implements IDao<Filial> {

    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger logger = Logger.getLogger(FilialDaoH2.class);

    @Override
    public Filial salvar(Filial filial) throws SQLException {
        logger.info("Registrando filial: "+filial.getNome());
        configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/filial;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
        Connection connection = configuracaoJDBC.getConnection();

        String query = String.format("INSERT INTO filial (nome, rua, numero, cidade, estado, eh5estrelas)" +
                        " values('%s','%s','%s','%s','%s','%s')",
                filial.getNome(),filial.getRua(),filial.getNumero(),filial.getCidade(),filial.getEstado(),filial.getEh5estrelas());

        try{
            Statement statement = connection.createStatement();
            statement.execute(query,Statement.RETURN_GENERATED_KEYS);

            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()){
                filial.setId(resultSet.getInt(1));
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }

        return filial;
    }
}