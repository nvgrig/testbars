package com.github.nvgrig.testbars.repository;

import com.github.nvgrig.testbars.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
