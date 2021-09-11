package com.github.nvgrig.testbars.util;

import com.github.nvgrig.testbars.model.Contract;
import com.github.nvgrig.testbars.to.ContractTo;

import java.time.LocalDate;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class ContractUtil {

    public static final long DAYS_STILL_UPDATED = 60;

    public static List<ContractTo> getTos(List<Contract> contractList) {
        return contractList.stream()
                .map(contract -> createTo(contract, checkisUpdated(contract)))
                .toList();
    }

    private static boolean checkisUpdated(Contract contract) {
        return DAYS.between(contract.getUpdateDate(), LocalDate.now()) < DAYS_STILL_UPDATED;
    }

    private static ContractTo createTo(Contract contract, boolean isUpdated) {
        return new ContractTo(contract.getId(), contract.getLocalDate(), contract.getNumber(),
                contract.getUpdateDate(), isUpdated);
    }
}
