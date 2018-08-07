package com.jerry.entity.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/8/7
 * Time: 20:15
 * Description: 产品状态
 */
@Getter
public enum ProductStatus {

    AUDITING("审核"),

    IN_SELL("销售中"),

    LOCKED("暂停销售"),

    FINISHED("已结束");

    private String desc;

    ProductStatus(String desc) {
        this.desc = desc;
    }
}
