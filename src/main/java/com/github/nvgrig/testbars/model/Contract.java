package com.github.nvgrig.testbars.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "local_date", nullable = false)
    private LocalDate localDate;

    @Column(name = "number")
    private int number;

    @Column(name = "update_date", nullable = false)
    private LocalDate updateDate;

    public Contract() {
    }

    public Contract(Integer id, LocalDate localDate, int number, LocalDate updateDate) {
        this.id = id;
        this.localDate = localDate;
        this.number = number;
        this.updateDate = updateDate;
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

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", localDate=" + localDate +
                ", number=" + number +
                ", updateDate=" + updateDate +
                '}';
    }
}
