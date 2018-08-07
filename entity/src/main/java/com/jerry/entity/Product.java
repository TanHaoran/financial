package com.jerry.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/8/7
 * Time: 20:04
 * Description: 产品
 */
@Data
@ToString
@Entity
public class Product {

    @Id
    private String id;

    private String name;

    /**
     * @see com.jerry.entity.enums.ProductStatus
     */
    private String status;

    /**
     * 起投金额
     */
    private BigDecimal thresholdAmount;

    /**
     * 投资步长
     */
    private BigDecimal stepAmount;

    /**
     * 锁定期
     */
    private Integer lockTerm;

    /**
     * 收益率，因为要与其他数相乘，所以使用BigDecimal
     */
    private BigDecimal rewardRate;

    private String memo;

    private Date createAt;

    private Date updateAt;

    private String createUser;

    private String updateUser;
}
