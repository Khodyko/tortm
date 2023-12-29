package by.tort.mojno.tortm.model.common.base.entity.forsale;

import by.tort.mojno.tortm.model.common.CostMeasurementEnum;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class BaseEntityForSaleByCount {
    @Column
    private final CostMeasurementEnum costMeasurement = CostMeasurementEnum.COUNT;
}
