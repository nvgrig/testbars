package com.github.nvgrig.testbars.controller;

import com.github.nvgrig.testbars.model.Contract;
import com.github.nvgrig.testbars.service.ContractService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = ContractRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class ContractRestController {

    protected final ContractService service;

    static final String REST_URL = "/contracts";

    public ContractRestController(ContractService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contract> getAll() {
        return service.getAll();
    }
}
