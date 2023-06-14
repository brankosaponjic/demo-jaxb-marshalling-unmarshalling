package app.model;

import app.jaxb.LocalDateAdapter;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TaxApplication {

//    @XmlTransient
    private Long id;

//    @XmlElement(name = "KlijentskaOznakaDeklaracije")
    private String clientDeclarationMark;
//    @XmlElement(name = "VrstaPrijave")
    private TaxApplicationType taxApplicationType;
//    @XmlElement(name = "ObracunskiPeriod")
    private String calculationDate;
//    @XmlElement(name = "OznakaZaKonacnu")
    private String finalMark;
//    @XmlElement(name = "DatumPlacanja")
//    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate paymentDate;
//    @XmlElement(name = "NajnizaOsnovica")
    private int lowestBasis;

//    @XmlTransient
    private List<TaxIncome> taxIncome;
//    @XmlTransient
    private int paymentCode;
//    @XmlTransient
    private LocalDate taxLiabilitiesDate;
//    @XmlTransient
    private Long jipd;
//    @XmlTransient
    private int isChangedJIPD;
//    @XmlTransient
    private String registrationNumber;
//    @XmlTransient
    private IncomeType incomeType;
//    @XmlTransient
    private LocalDate sendingDate;
//    @XmlTransient
    private int sendingOrderNumber;

//    @XmlTransient
    private TaxApplicationStatus status;
//    @XmlTransient
    private ChangeType changeType;
//    @XmlTransient
    private ChangeBasisType changeBasisType;

//    @XmlTransient
    private PUTaxApplicationStatus puStatus;
//    @XmlTransient
    private boolean isLocked;
//    @XmlTransient
    @Version
    private Integer version;
}
