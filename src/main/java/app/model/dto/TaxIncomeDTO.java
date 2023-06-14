package app.model.dto;

import app.model.IdentificatorType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PodaciOPrihodima")
public class TaxIncomeDTO {

    @XmlElement(name = "RedniBroj")
    private int redniBroj;
    @XmlElement(name = "VrstaIdentifikatoraPrimaoca")
    private IdentificatorType vrstaIdentifikatoraPrimaoca;
    @XmlElement(name = "IdentifikatorPrimaoca")
    private String identifikatorPrimaoca;
    @XmlElement(name = "Ime")
    private String ime;
    @XmlElement(name = "Prezime")
    private String prezime;
    @XmlElement(name = "SVP")
    private String svp;
    @XmlElement(name = "BrojKalendarskihDana")
    private int brojKalendarskihDana;
    @XmlElement(name = "BrojEfektivnihSati")
    private double brojEfektivnihSati;
    @XmlElement(name = "Bruto")
    private double bruto;
    @XmlElement(name = "OsnovicaPorez")
    private double osnovicaPorez;
    @XmlElement(name = "Porez")
    private double porez;
    @XmlElement(name = "OsnovicaDoprinosi")
    private double osnovicaDoprinosi;
    @XmlElement(name = "PIO")
    private double pio;
    @XmlElement(name = "ZDR")
    private double zdr;
    @XmlElement(name = "NEZ")
    private double nez;
    @XmlElement(name = "PIOBen")
    private double pioBen;
}
