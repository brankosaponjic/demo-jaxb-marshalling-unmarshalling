package app.model.customer;

import jakarta.xml.bind.annotation.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "birthday")
public class Birthday {
    @XmlAttribute(name = "formatDate")
    private String formatDate;
    @XmlValue
    private String value;
}
