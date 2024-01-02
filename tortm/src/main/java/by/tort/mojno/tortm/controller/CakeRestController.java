package by.tort.mojno.tortm.controller;

import by.tort.mojno.tortm.model.cake.Cake;
import by.tort.mojno.tortm.model.cake.response.ResponseCakeDTO;
import by.tort.mojno.tortm.model.cake.response.ResponseCreamDTO;
import by.tort.mojno.tortm.model.cake.response.ResponseDecorDTO;
import by.tort.mojno.tortm.model.cake.response.ResponseFillingDTO;
import by.tort.mojno.tortm.model.common.CostMeasurementEnum;
import by.tort.mojno.tortm.service.CakeService;
import by.tort.mojno.tortm.util.mapper.CakeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cake")
public class CakeRestController {

    @Autowired
    private CakeService cakeService;

    @Autowired
    private CakeMapper cakeMapper;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public List<ResponseCakeDTO> getAllCakes() {
        List<ResponseCakeDTO> responseCakeDTOList=cakeService.getAllCakes();

        System.out.println("cake " + responseCakeDTOList.getFirst().getDescription());
        System.out.println("cream " + responseCakeDTOList.getFirst().getDefaultCream().getDescription());
        return responseCakeDTOList;
    }
}
