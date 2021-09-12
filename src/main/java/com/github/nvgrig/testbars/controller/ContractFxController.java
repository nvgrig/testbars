package com.github.nvgrig.testbars.controller;

import com.github.nvgrig.testbars.to.ContractTo;
import com.github.nvgrig.testbars.util.ContractUtil;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
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
        ObservableList<ContractTo> contractsTos = FXCollections.observableArrayList(
                ContractUtil.getTos(restController.getAll()));
        TableView<ContractTo> table = new TableView<>(contractsTos);
        table.setPrefWidth(500);
        table.setPrefHeight(400);

        TableColumn<ContractTo, String> dateColumn = new TableColumn<>("localDate");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("localDate"));
        table.getColumns().add(dateColumn);

        TableColumn<ContractTo, Integer> numberColumn = new TableColumn<>("number");
        numberColumn.setCellValueFactory(new PropertyValueFactory<>("number"));
        table.getColumns().add(numberColumn);

        TableColumn<ContractTo, String> updateDateColumn = new TableColumn<>("updateDate");
        updateDateColumn.setCellValueFactory(new PropertyValueFactory<>("updateDate"));
        table.getColumns().add(updateDateColumn);

        TableColumn<ContractTo, Boolean> isActualColumn = new TableColumn<>("isActual");
        isActualColumn.setCellValueFactory(c -> new SimpleBooleanProperty(c.getValue().isActual()));
        isActualColumn.setCellFactory(tc -> new CheckBoxTableCell<>());
        table.getColumns().add(isActualColumn);

        FlowPane root = new FlowPane(10, 10, table);

        Scene scene = new Scene(root, 300, 250);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Contracts list:");
        stage.show();
    }
}
