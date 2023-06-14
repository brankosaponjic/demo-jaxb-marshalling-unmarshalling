package app.model.dto.mapper;

import app.model.TaxIncome;
import app.model.dto.TaxIncomeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaxIncomeMapper {

    TaxIncomeMapper INSTANCE = Mappers.getMapper(TaxIncomeMapper.class);

    @Mapping(source = "orderNumber", target = "redniBroj")
    @Mapping(source = "identificatorType", target = "vrstaIdentifikatoraPrimaoca")
    @Mapping(source = "clientIdentificator", target = "identifikatorPrimaoca")
    @Mapping(source = "firstName", target = "ime")
    @Mapping(source = "lastName", target = "prezime")
    @Mapping(source = "svp", target = "svp")
    @Mapping(source = "numberOfCalendarDays", target = "brojKalendarskihDana")
    @Mapping(source = "numberOfEffectiveHours", target = "brojEfektivnihSati")
    @Mapping(source = "incomeAmountGross", target = "bruto")
    @Mapping(source = "incomeAmountTaxBase", target = "osnovicaPorez")
    @Mapping(source = "incomeAmountTax", target = "porez")
    @Mapping(source = "incomeAmountContributionBase", target = "osnovicaDoprinosi")
    @Mapping(source = "incomeAmountPio", target = "pio")
    @Mapping(source = "incomeAmountZdr", target = "zdr")
    @Mapping(source = "incomeAmountNez", target = "nez")
    @Mapping(source = "incomeAmountPioBen", target = "pioBen")
    TaxIncomeDTO taxIncomeToTaxIncomeDTO(TaxIncome taxIncome);
}
