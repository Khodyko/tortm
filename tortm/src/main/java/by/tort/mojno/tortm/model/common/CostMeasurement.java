package by.tort.mojno.tortm.model.common;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class CostMeasurement {

    @Id
    private Long pid;

    @Column
    private String name;

    public CostMeasurement(CostMeasurementEnum costMeasurementEnum){
        pid= Long.valueOf(costMeasurementEnum.getId());
        name= costMeasurementEnum.getName();
    }


}
