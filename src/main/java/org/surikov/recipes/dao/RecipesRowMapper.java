package org.surikov.recipes.dao;

import org.surikov.recipes.model.Recipes;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
public class RecipesRowMapper implements RowMapper<Recipes> {
    @Override
    public Recipes mapRow(ResultSet rs, int rowNum) throws SQLException {
        Recipes recipes = new Recipes();
        recipes.setId(rs.getInt(1));
        recipes.setName(rs.getString(2));
        recipes.setDescription(rs.getString(3));
        recipes.setShortDescription(rs.getString(4));
        recipes.setProducts(rs.getString(5));
        return recipes;
    }
}
