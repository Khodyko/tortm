package by.tort.mojno.tortm.model.cake;

import by.tort.mojno.tortm.model.common.CostMeasurement;
import by.tort.mojno.tortm.model.common.CostMeasurementEnum;
import by.tort.mojno.tortm.model.common.base.entity.forsale.BaseEntityForSale;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Filling extends BaseEntityForSale {

    @ManyToOne
    private final CostMeasurement costMeasurement= new CostMeasurement(CostMeasurementEnum.WEIGHT_OF_PARENT);

    @ManyToMany
    @JoinTable(name = "cake_filling",
            joinColumns = {@JoinColumn(name = "cake_pid", referencedColumnName = "pid")},
            inverseJoinColumns = {@JoinColumn(name = "filling_pid", referencedColumnName = "pid")})
    private List<Cake> cakes = new ArrayList<>();

}
