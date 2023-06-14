package app.model.dto.mapper;

import app.model.BankDetails;
import app.model.dto.BankDetailsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BankDetailsMapper {

    BankDetailsMapper INSTANCE = Mappers.getMapper(BankDetailsMapper.class);

    @Mapping(source = "payerType", target = "tipIsplatioca")
    @Mapping(source = "payerIdentifierType", target = "vrstaIdentifikatoraIsplatioca")
    @Mapping(source = "taxCode", target = "pib")
    @Mapping(source = "monthlyFundHours", target = "mesecniFondSati")
    @Mapping(source = "idNumber", target = "maticniBrojisplatioca")
    @Mapping(source = "name", target = "nazivPrezimeIme")
    @Mapping(source = "municipalityCode", target = "sedistePrebivaliste")
    @Mapping(source = "phoneNumber", target = "telefon")
    @Mapping(source = "address", target = "ulicaIBroj")
    @Mapping(source = "email", target = "email")
    BankDetailsDTO bankDetailsToBankDetailsDTO(BankDetails bankDetails);
}
