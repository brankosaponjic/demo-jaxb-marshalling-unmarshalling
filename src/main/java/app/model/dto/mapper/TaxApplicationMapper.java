package app.model.dto.mapper;

import app.model.TaxApplication;
import app.model.dto.TaxApplicationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaxApplicationMapper {

    TaxApplicationMapper INSTANCE = Mappers.getMapper(TaxApplicationMapper.class);

    @Mapping(source = "clientDeclarationMark", target = "klijentskaOznakaDeklaracije")
    @Mapping(source = "taxApplicationType", target = "vrstaPrijave")
    @Mapping(source = "calculationDate", target = "obracunskiPeriod")
    @Mapping(source = "finalMark", target = "oznakaZaKonacnu")
    @Mapping(source = "paymentDate", target = "datumPlacanja")
    @Mapping(source = "lowestBasis", target = "najnizaOsnovica")
    TaxApplicationDTO taxApplicationToTaxApplicationDTO(TaxApplication taxApplication);
}
