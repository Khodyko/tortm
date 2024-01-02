package by.tort.mojno.tortm.util.mapper;

import by.tort.mojno.tortm.model.cake.Cream;
import by.tort.mojno.tortm.model.cake.response.ResponseCreamDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CreamMapper {

    ResponseCreamDTO convert(Cream cream);
    Cream convert(ResponseCreamDTO cream);
}
