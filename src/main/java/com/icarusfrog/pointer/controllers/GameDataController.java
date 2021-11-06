package com.icarusfrog.pointer.controllers;

import com.icarusfrog.pointer.models.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameDataController {

    @GetMapping("/games/{id}")
    public Game getGame(@PathVariable("id") String id) {
        Game game = new Game();
        game.setId(id);
        return game;
    }
}
