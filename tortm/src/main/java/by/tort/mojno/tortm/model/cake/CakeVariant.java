package by.tort.mojno.tortm.model.cake;

import by.tort.mojno.tortm.model.common.base.entity.forsale.BaseEntityForSaleByWeight;

import java.util.List;

public class CakeVariant extends BaseEntityForSaleByWeight {

    private List<Cream> creamVariants;

    private List<Filling> fillingVariants;

    private List<Decor> decorVariants;

    private Boolean isHeight;

    private Cream defaultCream;

    private Filling defaultFilling;

    private Decor defaultDecor;

}
