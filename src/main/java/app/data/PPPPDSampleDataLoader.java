package app.data;

import app.model.*;
import app.model.dto.BankDetailsDTO;
import app.model.dto.PodaciPoreskeDeklaracijeDTO;
import app.model.dto.TaxApplicationDTO;
import app.model.dto.TaxIncomeDTO;
import app.model.dto.mapper.BankDetailsMapper;
import app.model.dto.mapper.TaxApplicationMapper;
import app.model.dto.mapper.TaxIncomeMapper;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class PPPPDSampleDataLoader {

    private final BankDetailsMapper bankDetailsMapper;
    private final TaxApplicationMapper taxApplicationMapper;
    private final List<TaxIncome> taxIncomeList = new ArrayList<>();
    private final List<TaxIncomeDTO> taxIncomeDTOList = new ArrayList<>();
    private final TaxIncomeMapper taxIncomeMapper;

    // BankDetailsDTO
    private BankDetailsDTO getBankDetailsDTO() {
        return bankDetailsMapper.bankDetailsToBankDetailsDTO(createBankDetails());
    }

    // TaxApplicationDTO
    private TaxApplicationDTO getTaxApplicationDTO() {
        return taxApplicationMapper.taxApplicationToTaxApplicationDTO(createTaxApplication());
    }

    // TaxIncomeDTO
    private TaxIncomeDTO getTaxIncomeDTO() {
        return taxIncomeMapper.taxIncomeToTaxIncomeDTO(createTaxIncome());
    }

    private BankDetails createBankDetails() {
        return new BankDetails(
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
    }

    private TaxApplication createTaxApplication() {
        return new TaxApplication(
                1L,
                "1",
                TaxApplicationType.GENERAL_APPLICATION,
                "2023-04",
                "K",
                LocalDate.now(),
                1,
                getTaxIncomeList(taxIncomeList),
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
    }

    private TaxIncome createTaxIncome() {
        return new TaxIncome(
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
    }

    private List<TaxIncome> getTaxIncomeList(List<TaxIncome> taxIncomeList) {
        createTaxIncomeList(taxIncomeList);
        return taxIncomeList;
    }

    static void createTaxIncomeList(List<TaxIncome> taxIncomeList) {
        for (int i = 0; i < 1000000; i++) {
            taxIncomeList.add(
                new TaxIncome(
                    (long) i,
                    "202105444",
                    1,
                    i,
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
                    0)
            );
        }
    }

    private List<TaxIncomeDTO> createTaxIncomeDTO() {
        for (int i = 1; i <= 1000000; i++) {
            taxIncomeDTOList.add(
                new TaxIncomeDTO(
                    i,
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
                    10
                )
            );
        }
        return taxIncomeDTOList;
    }

    public PodaciPoreskeDeklaracijeDTO getPodaciPoreskeDeklaracijeDTO() {

        return new PodaciPoreskeDeklaracijeDTO(
                getTaxApplicationDTO(),
                getBankDetailsDTO(),
                createTaxIncomeDTO()
        );
    }
}
