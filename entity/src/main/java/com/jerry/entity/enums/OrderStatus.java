package com.jerry.entity.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/8/7
 * Time: 20:23
 * Description: 订单状态
 */
@Getter
public enum OrderStatus {

    INIT("初始化"),

    PROCESS("处理中"),

    SUCCESS("成功"),

    FAIL("失败");

    private String desc;

    OrderStatus(String desc) {
        this.desc = desc;
    }
}
