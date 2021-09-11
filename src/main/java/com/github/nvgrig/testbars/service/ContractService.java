package com.github.nvgrig.testbars.service;

import com.github.nvgrig.testbars.model.Contract;
import com.github.nvgrig.testbars.repository.ContractRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {

    private final ContractRepository contractRepository;

    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> getAll() {
        return contractRepository.findAll();
    }
}
