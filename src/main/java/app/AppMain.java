package app;

import app.data.PPPPDSampleDataLoader;
import app.jaxb.JaxbAiStreamingMarshaller;
import app.jaxb.StreamJAXBMarshaller;
import app.jaxb.StreamingMarshaller;
import app.jaxb.TaxApplicationJaxbMarshaller;
import app.model.dto.PodaciPoreskeDeklaracijeDTO;
import app.model.dto.mapper.BankDetailsMapper;
import app.model.dto.mapper.TaxApplicationMapper;
import app.model.dto.mapper.TaxIncomeMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.function.Consumer;

public class AppMain {
    public static void main(String[] args) throws JAXBException, IOException, XMLStreamException {
//        Customer customer = SampleDataLoader.getCustomer();
//        TaxApplicationXmlModel taxApplicationXmlModel = SampleDataLoader.getTaxApplicationXmlModel();
//
////        CustomerJaxbMarshaller.JaxbMarsh(customer);
////        TaxApplicationJaxbMarshaller.JaxbTaxAppMarshaller(taxApplicationXmlModel);

        PPPPDSampleDataLoader ppppdSampleDataLoader = new PPPPDSampleDataLoader(BankDetailsMapper.INSTANCE, TaxApplicationMapper.INSTANCE, TaxIncomeMapper.INSTANCE);
        ppppdSampleDataLoader.getPodaciPoreskeDeklaracijeDTO();

        PodaciPoreskeDeklaracijeDTO ppdDTO = ppppdSampleDataLoader.getPodaciPoreskeDeklaracijeDTO();

       /* try (OutputStream outputStream = new FileOutputStream("output.xml")) {
            StreamingMarshaller marshaller = new StreamingMarshaller(PodaciPoreskeDeklaracijeDTO.class);
            marshaller.open(outputStream);
            marshaller.write(PodaciPoreskeDeklaracijeDTO.class, "root", ppdDTO);
            marshaller.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        // PodaciPoreskeDeklaracijeDTO marshalling using StreamingMarshaller
       /* long start = System.currentTimeMillis();
        OutputStream outputStream = new FileOutputStream("src/main/java/app/data/PodaciPoreskeDeklaracije.xml");
        StreamingMarshaller streamingMarshaller = new StreamingMarshaller("PodaciPoreskeDeklaracije");
        streamingMarshaller.createMarshaller(PodaciPoreskeDeklaracijeDTO.class);
        streamingMarshaller.open(outputStream);
        streamingMarshaller.write(PodaciPoreskeDeklaracijeDTO.class, ppdDTO);
        streamingMarshaller.close();
        System.out.println("JAXB Streaming Marshalling of PodaciPoreskeDeklaracijeDTO is done!");
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");*/


        // PodaciPoreskeDeklaracijeDTO marshalling using TaxApplicationJaxbMarshaller.JaxbPPPPDDTOMarshaller()
//        TaxApplicationJaxbMarshaller.jaxbPPPPDDTOMarshaller(ppdDTO);

        // AI JAXB Streaming Marshaling
//        JaxbAiStreamingMarshaller.JaxbAiStreamingPPPPDDTOMarshaller(ppdDTO);


      /*  // Create a StreamJAXBMarshaller for YourObject
        StreamJAXBMarshaller<PodaciPoreskeDeklaracijeDTO> marshaller = new StreamJAXBMarshaller<>(PodaciPoreskeDeklaracijeDTO.class);

        // Marshal the object to an OutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        marshaller.marshal(ppdDTO, outputStream);

        // Get the XML data as a byte array
        outputStream.writeTo(new FileOutputStream("src/main/java/app/data/StreamJAXBMarshaller.xml"));*/

        // Last update of StreamJAXBMarshaller 13.06.2023.
        long start = System.currentTimeMillis();

        StreamJAXBMarshaller<PodaciPoreskeDeklaracijeDTO> marshaller = new StreamJAXBMarshaller<>(PodaciPoreskeDeklaracijeDTO.class);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String url = "src/main/java/app/data/ppdDTO.xml";
        marshaller.marshal(ppdDTO, outputStream, url);

        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }
}
