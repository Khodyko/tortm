package by.tort.mojno.tortm.util.mapper;

import by.tort.mojno.tortm.model.cake.Filling;
import by.tort.mojno.tortm.model.cake.response.ResponseFillingDTO;
import org.mapstruct.Mapper;

@Mapper
public interface FillingMapper {

    ResponseFillingDTO convert(Filling filling);
    Filling convert(ResponseFillingDTO filling);
}
