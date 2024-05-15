package org.surikov.recipes.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.surikov.recipes.model.Recipes;

import java.util.List;

@Component
public class RecipesJDBCDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public RecipesJDBCDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Recipes> find(String word){
        List<Recipes> recipes = jdbcTemplate.query("SELECT * FROM recipes WHERE recipes.products LIKE concat('%', ?, '%')", new Object[]{word}, new RecipesRowMapper());
        if(recipes.isEmpty()){
            return null;
        } else {
            return recipes;
        }
    }

    public List<Recipes> findAll(){
        return jdbcTemplate.query("SELECT * FROM recipes", new RecipesRowMapper());
    }






}
