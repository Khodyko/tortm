package by.tort.mojno.tortm.model.common.base.entity.forsale;

import by.tort.mojno.tortm.model.common.CostMeasurementEnum;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class BaseEntityForSaleByParentWeight extends BaseEntityForSale{
    @Column
    private final CostMeasurementEnum costMeasurement = CostMeasurementEnum.WEIGHT_OF_PARENT;

}
