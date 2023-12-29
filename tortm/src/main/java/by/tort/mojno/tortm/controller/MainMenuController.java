package by.tort.mojno.tortm.controller;

import by.tort.mojno.tortm.model.cake.Cream;
import by.tort.mojno.tortm.service.CreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainMenuController {

    private final CreamService creamService;

    public MainMenuController(CreamService creamService) {
        this.creamService = creamService;
    }

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public ModelAndView getMainMenuInfo(){
        ModelAndView modelAndView=new ModelAndView("index");
        List<Cream> creamList= creamService.getAllCreams();
        System.out.println(creamList.getFirst().getDescription());
        modelAndView.addObject("creams",creamList);
        return modelAndView;
    }
}
