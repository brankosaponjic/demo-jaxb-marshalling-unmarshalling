package app.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaxIncome {

//    @XmlTransient
    private Long id;
//    @XmlTransient
    private String clientDeclarationMark; // 'Poreska oznaka deklaracije' - KlijentskaOznakaDeklaracije - ime kolone iz ProCreditCore.dbo.PU_PPPPD_Detalji
//    @XmlTransient
    private int status;

//    @XmlElement(name = "RedniBroj")
    private int orderNumber;
//    @XmlElement(name = "VrstaIdentifikatoraPrimaoca")
    private IdentificatorType identificatorType;// 1-LK, 2-Strana LK, 4-Pasos, Izbeglicka, 5-Diplomatska LK, 6-Diplomatski pasos, 7-Drugo, 8-Registracija firme, 9-Ostalo
//    @XmlElement(name = "IdentifikatorPrimaoca")
    private String clientIdentificator;
//    @XmlElement(name = "Ime")
    private String firstName;
//    @XmlElement(name = "Prezime")
    private String lastName;
//    @XmlElement(name = "SVP")
    private String svp;
//    @XmlElement(name = "BrojKalendarskihDana")
    private int numberOfCalendarDays; // BrojKalendarskihDana - ProCreditCore.dbo.PU_PPPPD_Detalji
//    @XmlElement(name = "BrojEfektivnihSati")
    private double numberOfEffectiveHours; // BrojEfektivnihSati - ProCreditCore.dbo.PU_PPPPD_Detalji
//    @XmlElement(name = "Bruto")
    private double incomeAmountGross; // PodaciOPrihodimaBruto
//    @XmlElement(name = "OcnovicaPorez")
    private double incomeAmountTaxBase; // PodaciOPrihodimaOcnovicaPorez
//    @XmlElement(name = "Porez")
    private double incomeAmountTax; // PodaciOPrihodimaPorez
//    @XmlElement(name = "OsnovicaDoprinosi")
    private double incomeAmountContributionBase; // PodaciOPrihodimaOsnovicaDoprinosi
//    @XmlElement(name = "PIO")
    private double incomeAmountPio; // PodaciOPrihodimaPIO
//    @XmlElement(name = "ZDR")
    private double incomeAmountZdr; // PodaciOPrihodimaZDR
//    @XmlElement(name = "NEZ")
    private double incomeAmountNez; // PodaciOPrihodimaNEZ
//    @XmlElement(name = "PIOBen")
    private double incomeAmountPioBen; // PodaciOPrihodimaPIOBen

//    @XmlTransient
    private double monthlyFundHours; // MesecniFondSati
//    @XmlTransient
    private String municipalityCode;
//    @XmlTransient
    private String svpType;
//    @XmlTransient
    private String taxCode;
//    @XmlTransient
    private InterestType interestType;
//    @XmlTransient
    private IncomeType incomeType;
//    @XmlTransient
    private TaxApplication taxApplication;

//    private String Mfp1Mark;
//    private String Mfp1MarkValue;
//    private String Mfp2Mark;
//    private String Mfp2MarkValue;
//    private String Mfp3Mark;
//    private String Mfp3MarkValue;
//    private String Mfp4Mark;
//    private String Mfp4MarkValue;
//    private String Mfp5Mark;
//    private String Mfp5MarkValue;
//    private String Mfp6Mark;
//    private String Mfp6MarkValue;
//    private String Mfp7Mark;
//    private String Mfp7MarkValue;
//    private String Mfp8Mark;
//    private String Mfp8MarkValue;
//    private String Mfp9Mark;
//    private String Mfp9MarkValue;
//    private String Mfp10Mark;
//    private String Mfp10MarkValue;
//    private String Mfp11Mark;
//    private String Mfp11MarkValue;
//    private String Mfp12Mark;
//    private String Mfp12MarkValue;
//    @XmlTransient
    @Version
    private Integer version;
}
