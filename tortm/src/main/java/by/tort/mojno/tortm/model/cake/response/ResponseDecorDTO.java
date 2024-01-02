package by.tort.mojno.tortm.model.cake.response;

import by.tort.mojno.tortm.model.common.CostMeasurementEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseDecorDTO {
    private Long pid;
    private String name;
    private String description;
    private CostMeasurementEnum costMeasurement;
    private Long costPerMeasureCoins;
    private String imgHref;
}
