package app.jaxb;

import app.model.dto.PodaciPoreskeDeklaracijeDTO;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class JaxbAiStreamingMarshaller {

    public static void JaxbAiStreamingPPPPDDTOMarshaller(PodaciPoreskeDeklaracijeDTO pppdDTO) throws JAXBException, IOException, XMLStreamException {
    long start = System.currentTimeMillis();

    /*JAXBContext context = JAXBContext.newInstance(PodaciPoreskeDeklaracijeDTO.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://pid.purs.gov.rs");


    XMLOutputFactory outputFactory = XMLOutputFactory.newFactory();
    XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileOutputStream("src/main/java/app/data/ppdDTOJaxbAiStreamingMarshaller.xml"), "UTF-8");

    marshaller.marshal(pppdDTO, writer);
    writer.close();

    long end = System.currentTimeMillis();
    NumberFormat formatter = new DecimalFormat("#0.00000");
    System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    System.out.println("AI Streaming marshaling of pppdDTOJaxbMarshaller is done!");*/


        // Create a StreamingMarshaller
        StreamingMarshaller streamingMarshaller = new StreamingMarshaller(PodaciPoreskeDeklaracijeDTO.class);
        Marshaller marshaller = streamingMarshaller.getMarshaller(PodaciPoreskeDeklaracijeDTO.class);
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://pid.purs.gov.rs");
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Open the output stream
        FileOutputStream outputStream = new FileOutputStream("src/main/java/app/data/ppdDTOJaxbAiStreamingMarshaller.xml");
        streamingMarshaller.open(outputStream);

        // Write the pppdDTO object to the output stream
        streamingMarshaller.write(PodaciPoreskeDeklaracijeDTO.class, pppdDTO);

        // Close the output stream
        streamingMarshaller.close();

        long end = System.currentTimeMillis();
        double executionTime = (end - start) / 1000.0;
        System.out.println("Execution time is " + executionTime + " seconds");
        System.out.println("AI Streaming marshaling of pppdDTOJaxbMarshaller is done!");

    }

    /*
        // Create a StreamingMarshaller
        StreamingMarshaller streamingMarshaller = new StreamingMarshaller(PodaciPoreskeDeklaracijeDTO.class);

        // Open the output stream
        FileOutputStream outputStream = new FileOutputStream("src/main/java/app/data/ppdDTOJaxbAiStreamingMarshaller.xml");
        streamingMarshaller.open(outputStream);

        // Write the pppdDTO object to the output stream
        streamingMarshaller.write(PodaciPoreskeDeklaracijeDTO.class, pppdDTO);

        // Close the output stream
        streamingMarshaller.close();

        long end = System.currentTimeMillis();
        double executionTime = (end - start) / 1000.0;
        System.out.println("Execution time is " + executionTime + " seconds");
        System.out.println("AI Streaming marshaling of pppdDTOJaxbMarshaller is done!");

*/

}
