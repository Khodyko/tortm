package by.tort.mojno.tortm.model.cake.response;

import by.tort.mojno.tortm.model.cake.Cream;
import by.tort.mojno.tortm.model.cake.Decor;
import by.tort.mojno.tortm.model.cake.Filling;
import by.tort.mojno.tortm.model.common.CostMeasurementEnum;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ResponseCakeDTO {
    private Long pid;
    private String name;
    private String description;
    private CostMeasurementEnum costMeasurement;
    private Long costPerMeasureCoins;
    private String imgHref;

    private List<ResponseCreamDTO> creams = new ArrayList<>();


    private List<ResponseFillingDTO> fillings = new ArrayList<>();

    private List<ResponseDecorDTO> decors = new ArrayList<>();

    private ResponseCreamDTO defaultCream;

    private ResponseFillingDTO defaultFilling;

    private ResponseDecorDTO defaultDecor;



}
