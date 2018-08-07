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
 * Description: 订单
 */
@Data
@ToString
@Entity(name = "order_t")
public class Order {

    @Id
    private String orderId;

    /**
     * 渠道id
     */
    private String chanId;

    private String chanUserId;

    /**
     * @see com.jerry.entity.enums.OrderType
     */
    private String orderType;

    private String productId;

    private BigDecimal amount;

    private String outerOrderId;

    /**
     * @see com.jerry.entity.enums.OrderStatus
     */
    private String orderStatus;

    private String memo;

    private Date createAt;

    private Date updateAt;
}
