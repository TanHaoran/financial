package com.jerry.entity.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/8/7
 * Time: 20:22
 * Description: 订单类型
 */
@Getter
public enum OrderType {

    APPLY("申购"),

    REDEEM("赎回");

    private String desc;

    OrderType(String desc) {
        this.desc = desc;
    }
}
