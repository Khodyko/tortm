package by.tort.mojno.tortm.model.common.base.entity.forsale;

import by.tort.mojno.tortm.model.common.CostMeasurement;
import by.tort.mojno.tortm.model.common.CostMeasurementEnum;
import by.tort.mojno.tortm.model.common.PersistantObject;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntityForSale extends PersistantObject<Long> {

    @Column
    private String name;

    @Column
    private String description;

    @ManyToOne
    private final CostMeasurement costMeasurement= new CostMeasurement(CostMeasurementEnum.WEIGHT);

    @Column
    private Long costPerMeasureCoins;

    @Column
    private String imgHref;



}
