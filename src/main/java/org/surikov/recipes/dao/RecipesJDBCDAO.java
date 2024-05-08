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

    public Recipes find(int id){
        List<Recipes> recipes = jdbcTemplate.query("SELECT * FROM recipes WHERE id=?", new Object[]{id}, new RecipesRowMapper());
        if(recipes.isEmpty()){
            return null;
        } else {
            return recipes.get(0);
        }
    }

    public Recipes find(String word){
        List<Recipes> recipes = jdbcTemplate.query("SELECT * FROM recipes", new RecipesRowMapper());
        if(recipes.isEmpty()){
            return null;
        } else {
            return recipes.get(0);
        }
    }

    public Recipes findAll(){
        List<Recipes> recipes = jdbcTemplate.query("SELECT * FROM recipes", new RecipesRowMapper());
        if(recipes.isEmpty()){
            return null;
        } else {
            return recipes.get(0);
        }
    }






}
