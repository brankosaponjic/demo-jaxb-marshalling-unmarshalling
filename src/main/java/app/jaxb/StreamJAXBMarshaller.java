package app.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class StreamJAXBMarshaller<T> {

    private final JAXBContext jaxbContext;

    public StreamJAXBMarshaller(Class<T> clazz) throws JAXBException {
        this.jaxbContext = JAXBContext.newInstance(clazz);
    }

    public synchronized <T> void marshal(T object, OutputStream outputStream, String url) throws JAXBException, IOException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://pid.purs.gov.rs");
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StreamResult result = new StreamResult(byteArrayOutputStream);
        marshaller.marshal(object, result);
//        marshaller.marshal(object, outputStream);

        // Write the XML data to the file
        try (FileOutputStream fileOutputStream = new FileOutputStream(url)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        } finally {
            outputStream.flush();
            outputStream.close();
        }
        System.out.println("ppdDTO has been exported to XML format");
    }
}
