package app.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    public DateTimeFormatter dateFormat() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd"); // ("dd.MM.yyyy"), ("yyyy-MMM-dd")
    }

    @Override
    public LocalDate unmarshal(String v) {
        DateTimeFormatter formatter = dateFormat();
        return LocalDate.parse(v, formatter);
    }

    @Override
    public String marshal(LocalDate v) {
        return v.format(dateFormat());
    }

//    public LocalDate unmarshal(String inputDate) {
//        return inputDate != null ? DateTimeFormatter.ISO_LOCAL_DATE.parse(inputDate, LocalDate::from) : null ;
//    }
//
//    public String marshal(LocalDate inputDate) {
//        return inputDate != null ? DateTimeFormatter.ISO_LOCAL_DATE.format(inputDate) : null;
//    }
}
