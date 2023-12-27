package by.tort.mojno.tortm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MainMenuController {

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public String getMainMenuInfo(){
        return "index";
    }
}
