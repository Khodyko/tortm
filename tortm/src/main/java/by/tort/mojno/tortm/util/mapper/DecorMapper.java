package by.tort.mojno.tortm.util.mapper;

import by.tort.mojno.tortm.model.cake.Decor;
import by.tort.mojno.tortm.model.cake.response.ResponseDecorDTO;
import org.mapstruct.Mapper;

@Mapper
public interface DecorMapper {

    ResponseDecorDTO convert(Decor decor);

    Decor convert(ResponseDecorDTO decor);
}
