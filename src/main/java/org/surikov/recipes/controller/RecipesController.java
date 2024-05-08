package org.surikov.recipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.surikov.recipes.dao.RecipesJDBCDAO;

@Controller
@RequestMapping("/recipes")
public class RecipesController {

    private RecipesJDBCDAO recipesJDBCDAO;

    @Autowired
    public RecipesController(RecipesJDBCDAO recipesJDBCDAO) {
        this.recipesJDBCDAO = recipesJDBCDAO;
    }

    @GetMapping()
    public String index(Model model) throws ClassNotFoundException {
        model.addAttribute("recipes", recipesJDBCDAO.findAll());
        return "recipes";
    }
}
