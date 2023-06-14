package app.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {

    private int id;

    private int payerType;
    private int payerIdentifierType;
    private String taxCode;
    private double monthlyFundHours;
    private String idNumber;
    private String name;
    private String municipalityCode;
    private String phoneNumber;
    private String address;
    private String email;

    private String city;
    private int numberOfEmployees;
    private String employeeIdNumber;
    @Version
    private Integer version;
}
