package by.tort.mojno.tortm.controller;

import by.tort.mojno.tortm.model.cake.Cream;
import by.tort.mojno.tortm.model.common.CostMeasurementEnum;
import by.tort.mojno.tortm.service.CreamService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainMenuController {

//    Logger logger = (Logger) LoggerFactory.getLogger(MainMenuController.class);

    private final CreamService creamService;

    public MainMenuController(CreamService creamService) {
        this.creamService = creamService;
    }

    //Controller only for check
    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public ModelAndView getMainMenuInfo() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Cream> creamList = creamService.getAllCreams();
        if (creamList != null && creamList.size()>0) {
            System.out.println(creamList.getFirst().getDescription());
        }
        modelAndView.addObject("creams", creamList);
        return modelAndView;
    }

    //Controller only for check
    @GetMapping(value = "/cream")
    @ResponseStatus(value = HttpStatus.OK)
    public ModelAndView addCream() {
        ModelAndView modelAndView = new ModelAndView("index");
        Cream cream = new Cream();
        cream.setDescription("классный торт");
        cream.setCostMeasurement(CostMeasurementEnum.WEIGHT_OF_PARENT);
        creamService.addCream(cream);
        return modelAndView;
    }
}
