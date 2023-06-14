package app.model.dto;

import app.jaxb.LocalDateAdapter;
import app.model.TaxApplicationType;
import app.model.TaxIncome;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PodaciOPrijavi")
public class TaxApplicationDTO {

    @XmlElement(name = "KlijentskaOznakaDeklaracije")
    private String klijentskaOznakaDeklaracije;
    @XmlElement(name = "VrstaPrijave")
    private TaxApplicationType vrstaPrijave;
    @XmlElement(name = "ObracunskiPeriod")
    private String obracunskiPeriod;
    @XmlElement(name = "OznakaZaKonacnu")
    private String oznakaZaKonacnu;
    @XmlElement(name = "DatumPlacanja")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate datumPlacanja;
    @XmlElement(name = "NajnizaOsnovica")
    private int najnizaOsnovica;

}
