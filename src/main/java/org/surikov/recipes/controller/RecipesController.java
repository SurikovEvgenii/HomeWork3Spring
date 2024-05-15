package org.surikov.recipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.surikov.recipes.dao.RecipesJDBCDAO;

@Controller
public class RecipesController {

    private RecipesJDBCDAO recipesJDBCDAO;

    @Autowired
    public RecipesController(RecipesJDBCDAO recipesJDBCDAO) {
        this.recipesJDBCDAO = recipesJDBCDAO;
    }

    @GetMapping("/recipes")
    public String recipes(Model model, @RequestParam(name = "word", required = false) String word) throws ClassNotFoundException {
        if(word == null){
            model.addAttribute("recipes", recipesJDBCDAO.findAll());
            return "recipes";
        } else {
            model.addAttribute("recipes", recipesJDBCDAO.find(word));
            return "recipes";
        }
    }
}
