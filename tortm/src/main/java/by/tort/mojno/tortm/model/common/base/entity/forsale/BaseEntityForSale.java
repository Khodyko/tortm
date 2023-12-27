package by.tort.mojno.tortm.model.common.base.entity.forsale;

import by.tort.mojno.tortm.model.common.CostMeasurementEnum;
import by.tort.mojno.tortm.model.common.PersistantObject;

abstract class BaseEntityForSale extends PersistantObject<Long> {

    String name;

    String description;

    CostMeasurementEnum costMeasurement;

    Long costPerMeasureCoins;

    String imgHref;

}
