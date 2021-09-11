package com.github.nvgrig.testbars.repository;

import com.github.nvgrig.testbars.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
