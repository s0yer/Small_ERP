package com.jadson.DAO;

public class UserDaoImplem implements UserDAO {
    private JdbcTemplate jdbcTemplate;

    public user findByNameUser(String nameUser){
        try{
            return jdbcTemplate.queryForObject(
                    "select * from user where userName = ?",
                    new UserRowMapper(),
                    nameUser);
            )catch(EmptyResultDataAccessException e){
                return null;
            }
        }
    }

    public void updateLastAccess(Integer id, Date data){
        jdbcTemplate.update(
                "update user set last_access = ? where id = ?", data, id);
    }
}
