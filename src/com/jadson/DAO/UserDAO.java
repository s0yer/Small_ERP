package com.jadson.DAO;

public interface UserDAO {
    user findByNameUser(String string);
    void updateLastAccess(Integer id, Date data);
}
