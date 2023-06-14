package app.model.dto;

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
@XmlRootElement(name = "PodaciOIsplatiocu")
public class BankDetailsDTO {

    @XmlElement(name = "TipIsplatioca")
    private int tipIsplatioca;
    @XmlElement(name = "VrstaIdentifikatoraIsplatioca")
    private int vrstaIdentifikatoraIsplatioca;
    @XmlElement(name = "PoreskiIdentifikacioniBroj")
    private String pib;
    @XmlElement(name = "MesecniFondSati")
    private double mesecniFondSati;
    @XmlElement(name = "MaticniBrojisplatioca")
    private String maticniBrojisplatioca;
    @XmlElement(name = "NazivPrezimeIme")
    private String nazivPrezimeIme;
    @XmlElement(name = "SedistePrebivaliste")
    private String sedistePrebivaliste;
    @XmlElement(name = "Telefon")
    private String telefon;
    @XmlElement(name = "UlicaIBroj")
    private String ulicaIBroj;
    @XmlElement(name = "eMail")
    private String email;

}
