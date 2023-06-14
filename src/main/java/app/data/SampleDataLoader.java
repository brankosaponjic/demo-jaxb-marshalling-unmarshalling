package app.data;

import app.model.*;
import app.model.customer.Address;
import app.model.customer.Birthday;
import app.model.customer.Customer;
import app.model.xmlmodel.TaxApplicationXmlModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SampleDataLoader {

    public static Customer getCustomer() {
        return new Customer(
                1,
                "Petar",
                "Petrovic",
                "petar.petrovic@email.com",
                new Address("M.Milankovica","17","Beograd"),
                new Birthday("dd-MM-yyyy","14-05-1970"),
                List.of(
                        new Order(1,"Pasta za zube",4.7),
                        new Order(2,"Cetkica za zube",3.5),
                        new Order(3,"Tecni sapun",2.8),
                        new Order(4,"Ubrusi",1.9),
                        new Order(5,"Peskir",9.3)
                ));
    }

    public static TaxApplicationXmlModel getTaxApplicationXmlModel() {
        BankDetails bank = new BankDetails(
                1,
                1,
                1,
                "1000000215",
                33.5,
                "17335677",
                "ProCredit Banka",
                "011",
                "+381 11 20 77 906",
                "info@procreditbank.rs",
                "Bulevar Milutina Milankovica 17",
                "Belgrade",
                10,
                "1903977715176",
                1
        );
        TaxIncome ti1 = new TaxIncome(
                1L,
                "202105201",
                1,
                1,
                IdentificatorType.JEDAN,
                "1234321",
                "Sara",
                "Komp",
                "SVP 1",
                20,
                10.5,
                55555,
                30000,
                200,
                2000,
                0.0,
                0.0,
                0.0,
                10,
                23.2,
                "011",
                "101100000",
                "123456",
                InterestType.NEKI_TIP,
                IncomeType.OTHER_INCOME,
                new TaxApplication(),
                0);
        TaxIncome ti2 = new TaxIncome(
                2L,
                "2024563201",
                1,
                2,
                IdentificatorType.JEDAN,
                "22334321",
                "Jovan",
                "Ahmedoski",
                "SVP 2",
                19,
                9.5,
                55550,
                25000,
                180,
                1900,
                0.0,
                0.0,
                0.0,
                10,
                21.2,
                "011",
                "101101000",
                "1133456",
                InterestType.NEKI_TIP,
                IncomeType.EARNINGS,
                new TaxApplication(),
                0);
        TaxIncome ti3 = new TaxIncome(
                3L,
                "202100001",
                1,
                1,
                IdentificatorType.JEDAN,
                "1211111",
                "Marko",
                "Mitar",
                "SVP 3",
                20,
                10.5,
                55555,
                30000,
                200,
                2000,
                0.0,
                0.0,
                0.0,
                10,
                23.2,
                "011",
                "101100110",
                "127776",
                InterestType.NEKI_TIP,
                IncomeType.INTERESTS,
                new TaxApplication(),
                0);
        TaxIncome ti4 = new TaxIncome(
                4L,
                "202105444",
                1,
                4,
                IdentificatorType.JEDAN,
                "1234393",
                "Banji",
                "Jump",
                "SVP 4",
                20,
                10.5,
                55555,
                30000,
                200,
                2000,
                0.0,
                0.0,
                0.0,
                10,
                23.2,
                "011",
                "101100001",
                "123009",
                InterestType.NEKI_TIP,
                IncomeType.EARNINGS,
                new TaxApplication(),
                0);
        List<TaxIncome> taxIncomeList = new ArrayList<>();
//        taxIncomeList.add(ti1);
//        taxIncomeList.add(ti2);
//        taxIncomeList.add(ti3);
//        taxIncomeList.add(ti4);
        PPPPDSampleDataLoader.createTaxIncomeList(taxIncomeList);
        TaxApplication taxApplication = new TaxApplication(
                1L,
                "1",
                TaxApplicationType.GENERAL_APPLICATION,
                "2023-04",
                "K",
                LocalDate.now(),
                1,
                taxIncomeList,
                1,
                LocalDate.now(),
                13174131L,
                0,
                "1317",
                IncomeType.OTHER_INCOME,
                LocalDate.now().minusDays(7),
                32,
                TaxApplicationStatus.READY_TO_SEND,
                ChangeType.CHANGE,
                ChangeBasisType.COURT_ORDER,
                PUTaxApplicationStatus.READY_TO_SEND,
                false,
                0
        );
        return new TaxApplicationXmlModel(
                taxApplication,
                bank,
                taxApplication.getTaxIncome()
        );
    }
}
