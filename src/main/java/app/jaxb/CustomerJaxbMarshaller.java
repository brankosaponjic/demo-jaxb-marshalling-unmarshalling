package app.jaxb;

import app.model.customer.Customer;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.FileOutputStream;

import java.io.IOException;

public class CustomerJaxbMarshaller {

    public static void JaxbMarsh(Customer customer) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://pid.purs.gov.rs");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(customer, new FileOutputStream("src/main/java/app/data/customer.xml"));
        System.out.println("Marshalling done!");
    }
}
