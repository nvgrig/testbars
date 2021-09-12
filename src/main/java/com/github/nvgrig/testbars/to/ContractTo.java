package com.github.nvgrig.testbars.to;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class ContractTo {
    protected Integer id;

    private SimpleStringProperty localDate;

    private SimpleIntegerProperty number;

    private SimpleStringProperty updateDate;

    private SimpleBooleanProperty isActual;

    public ContractTo() {
    }

    public ContractTo(Integer id, LocalDate localDate, int number, LocalDate updateDate, boolean isActual) {
        this.id = id;
        this.localDate = new SimpleStringProperty(localDate.toString());
        this.number = new SimpleIntegerProperty(number);
        this.updateDate = new SimpleStringProperty(updateDate.toString());
        this.isActual = new SimpleBooleanProperty(isActual);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocalDate() {
        return localDate.get();
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate.set(localDate.toString());
    }

    public int getNumber() {
        return number.get();
    }

    public void setNumber(int number) {
        this.number.set(number);
    }

    public String getUpdateDate() {
        return updateDate.get();
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate.set(updateDate.toString());
    }

    public boolean isActual() {
        return isActual.get();
    }

    public void setActual(boolean actual) {
        isActual.set(actual);
    }

    @Override
    public String toString() {
        return "ContractTo{" +
                "id=" + id +
                ", localDate=" + localDate +
                ", number=" + number +
                ", updateDate=" + updateDate +
                ", isActual=" + isActual +
                '}';
    }
}
