package app.model.customer;

import app.model.Order;
import jakarta.xml.bind.annotation.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "customer", namespace = "http://pid.purs.gov.rs")
public class Customer {
    @XmlElement(name = "id", namespace = "http://pid.purs.gov.rs")
    private int id;
    @XmlElement(name = "firstname", namespace = "http://pid.purs.gov.rs")
    private String firstname;
    @XmlElement(name = "lastname", namespace = "http://pid.purs.gov.rs")
    private String lastname;
    @XmlElement(name = "email", namespace = "http://pid.purs.gov.rs")
    private String email;
    @XmlElement(name = "address", namespace = "http://pid.purs.gov.rs")
    private Address address;
    @XmlElement(name = "birthday", namespace = "http://pid.purs.gov.rs")
    private Birthday birthday;
    @XmlElementWrapper(name="orderList", namespace = "http://pid.purs.gov.rs")
    @XmlElement(name = "order", namespace = "http://pid.purs.gov.rs")
    private List<Order> orderList;
}
