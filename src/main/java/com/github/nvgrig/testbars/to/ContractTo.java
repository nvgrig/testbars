package com.github.nvgrig.testbars.to;

import java.time.LocalDate;

public class ContractTo {
    protected Integer id;

    private LocalDate localDate;

    private int number;

    private LocalDate updateDate;

    private boolean isActual;

    public ContractTo() {
    }

    public ContractTo(Integer id, LocalDate localDate, int number, LocalDate updateDate, boolean isActual) {
        this.id = id;
        this.localDate = localDate;
        this.number = number;
        this.updateDate = updateDate;
        this.isActual = isActual;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public boolean isActual() {
        return isActual;
    }

    public void setActual(boolean actual) {
        isActual = actual;
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
