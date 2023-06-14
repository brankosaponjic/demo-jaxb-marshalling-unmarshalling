package app.model.xmlmodel;

import app.model.BankDetails;
import app.model.TaxApplication;
import app.model.TaxIncome;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "PodaciPoreskeDeklaracije", namespace = "http://pid.purs.gov.rs")
public class TaxApplicationXmlModel {
//    @XmlElement(name = "PodaciOPrijavi", namespace = "http://pid.purs.gov.rs")
    public TaxApplication taxApplication;
//    @XmlElement(name = "PodaciOIsplatiocu", namespace = "http://pid.purs.gov.rs")
    public BankDetails bankDetails;
//    @XmlElementWrapper(name = "DeklarisaniPrihodi", namespace = "http://pid.purs.gov.rs")
//    @XmlElement(name = "PodaciOPrihodima", namespace = "http://pid.purs.gov.rs")
    public List<TaxIncome> taxIncomes;
}
