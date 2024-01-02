package by.tort.mojno.tortm.util.mapper;

import by.tort.mojno.tortm.model.cake.Cake;
import by.tort.mojno.tortm.model.cake.response.ResponseCakeDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CakeMapper {

    ResponseCakeDTO cakeToResponseCakeDto(Cake cake);
    Cake ResponseCakeDtoToCake(ResponseCakeDTO cake);

    List<ResponseCakeDTO> mapToCake(List<Cake> cakes);
    List<Cake> mapToResponse(List<ResponseCakeDTO> cakes);
}
