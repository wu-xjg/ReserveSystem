package com.example.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {
    private String oId;

    private String uId;

    private String jId;

    private String hId;

    private Date oTime;

    private BigDecimal oMoney;

    private Integer oStatus;

    private String oEvaluate;
}
