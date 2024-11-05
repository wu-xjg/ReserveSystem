package com.example.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class House {
    private String hId;

    private String jId;

    private String hClass;

    private Date hTime;

    private BigDecimal hMoney;

    private String hStatus;
}
