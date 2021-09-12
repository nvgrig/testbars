package com.github.nvgrig.testbars.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FxmlView
public class ContractFxController {
    @FXML
    private final ContractRestController restController;

    @Autowired
    public ContractFxController(ContractRestController restController) {
        this.restController = restController;
    }

    public void getAllContracts(ActionEvent actionEvent) {
    }
}
