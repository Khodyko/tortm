package by.tort.mojno.tortm.controller;

import by.tort.mojno.tortm.model.cake.Cream;
import by.tort.mojno.tortm.model.cake.response.ResponseCreamDTO;
import by.tort.mojno.tortm.model.common.CostMeasurementEnum;
import by.tort.mojno.tortm.service.CreamService;
import by.tort.mojno.tortm.util.mapper.CreamMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainMenuController {

//    Logger logger = (Logger) LoggerFactory.getLogger(MainMenuController.class);

    @Autowired
    private CreamMapper creamMapper;
    @Autowired
    private CreamService creamService;

    //Controller only for check
    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public ModelAndView getMainMenuInfo() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Cream> creamList = creamService.getAllCreams();
        if (creamList != null && creamList.size()>0) {
            ResponseCreamDTO responseCreamDTO= creamMapper.convert(creamList.getFirst());
            System.out.println(responseCreamDTO.getDescription());
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
