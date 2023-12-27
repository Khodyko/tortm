package by.tort.mojno.tortm.model.common;

public enum CostMeasurementEnum {

    WEIGHT((byte) 1, "Продается по весу"),
    COUNT((byte) 2, "Продается поштучно"),
    WEIGHT_OF_PARENT((byte)3, "Продается по весу родителя.");

    CostMeasurementEnum(Byte id, String description) {
        this.id = id;
        this.description = description;
    }

    Byte id;
    String description;

}
