@XmlSchema(
        namespace = "http://pid.purs.gov.rs",
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix = "tns", namespaceURI = "http://pid.purs.gov.rs")
        }
)

package app.model.dto;

import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlNsForm;
import jakarta.xml.bind.annotation.XmlSchema;