package app.jaxb;

import app.model.dto.PodaciPoreskeDeklaracijeDTO;
import app.model.xmlmodel.TaxApplicationXmlModel;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TaxApplicationJaxbMarshaller {

    public static void jaxbTaxAppMarshaller(TaxApplicationXmlModel ta) throws JAXBException, IOException {
        long start = System.currentTimeMillis();
        JAXBContext context = JAXBContext.newInstance(TaxApplicationXmlModel.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://pid.purs.gov.rs");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(ta, new FileOutputStream("src/main/java/app/data/taxApplication.xml"));
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        System.out.println("Marshalling TaxApplication is done!");
    }

    public static void jaxbPPPPDDTOMarshaller(PodaciPoreskeDeklaracijeDTO pppdDTO) throws JAXBException, IOException {
        long start = System.currentTimeMillis();
        JAXBContext context = JAXBContext.newInstance(PodaciPoreskeDeklaracijeDTO.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://pid.purs.gov.rs");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(pppdDTO, new FileOutputStream("src/main/java/app/data/pppdDTOJaxbMarshaller.xml"));
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        System.out.println("Marshalling of pppdDTOJaxbMarshaller is done!");
    }
}
