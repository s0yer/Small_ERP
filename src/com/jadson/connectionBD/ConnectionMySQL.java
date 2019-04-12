package com.jadson.connectionBD;

//Classes necessárias para uso de banco de dados

import java.security.KeyStore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Início da classe conexão

public class ConnectionMySQL {

    public boolean status = False;

    // método construtor de classe
    public conexaoMySQL(){

    }

    // método de conexão
    public static java.sql.Connection getConnectionMySQL(){

        Connection connection = null; // atributo do tipo conexão


        // carrega o JDBC , driver padrão
        try{
            String driverName = "com.myslq.jdbc.Driver";

            Class.forName(DriverName);

            // configuração da conexão com o BD
            String serverName = "localhost";    //caminho do servidor do BD
            String mydatabase =”mysql”;        //nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";        //nome de um usuário de seu BD
            String password = "123456";      //sua senha de acesso
            connection = DriverManager.getConnection(url, username, password);

            // testa a conexão
            if (connection != null) {

                status = true;
            } else {
                status = false;

            }

            return connection;
        }catch (SQLException e){
            // se não se conectar ao banco de dados
            System.out.println("It is not possible connect with the database..");
            return null;
        }
    }

    // método que retorna o status da conexção
    public boolean statusConnection(){
        return status;
    }

    // método que fecha sua conexão
    public static boolean closeConnection(){
        try{
            ConnectionMySQL.getConnectionMySQL().close();
            return true;
        }catch (SQLException e){
            return false;
        }
    }

    //método que reinicia a conexão
    public static java.sql.Connection restartConnection(){
        closeConnection();
        return ConnectionMySQL.getConnectionMySQL();
    }



}


