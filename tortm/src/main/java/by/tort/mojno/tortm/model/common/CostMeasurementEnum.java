package by.tort.mojno.tortm.model.common;

public enum CostMeasurementEnum {

    WEIGHT((byte) 1, "WEIGHT"),
    COUNT((byte) 2, "COUNT"),
    WEIGHT_OF_PARENT((byte)3, "WEIGHT_OF_PARENT");

    CostMeasurementEnum(Byte id, String name) {
        this.id = id;
        this.name = name;
    }

    Byte id;
    String name;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
