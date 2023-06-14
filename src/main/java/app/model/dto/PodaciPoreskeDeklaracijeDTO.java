package app.model.dto;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PodaciPoreskeDeklaracije", namespace = "http://pid.purs.gov.rs") // (name = "tns:PodaciPoreskeDeklaracije", namespace = "http://pid.purs.gov.rs")
public class PodaciPoreskeDeklaracijeDTO {

    @XmlElement(name = "PodaciOPrijavi", namespace = "http://pid.purs.gov.rs")
    public TaxApplicationDTO taxApplicationDTO;
    @XmlElement(name = "PodaciOIsplatiocu", namespace = "http://pid.purs.gov.rs")
    public BankDetailsDTO bankDetailsDTO;
    @XmlElementWrapper(name = "DeklarisaniPrihodi", namespace = "http://pid.purs.gov.rs")
    @XmlElement(name = "PodaciOPrihodima", namespace = "http://pid.purs.gov.rs")
    public List<TaxIncomeDTO> taxIncomeDTOList;
}
