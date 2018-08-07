package com.jerry.manager.service;

import com.jerry.entity.Product;
import com.jerry.entity.enums.ProductStatus;
import com.jerry.manager.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/8/7
 * Time: 20:41
 * Description:
 */
@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product product) {
        log.debug("创建产品，参数{}", product);
        // 数据校验
        checkProduct(product);

        // 设置默认值
        setDefault(product);

        Product result = repository.save(product);

        log.debug("创建产品，结果{}", result);

        return result;
    }

    /**
     * 产品数据校验
     * 1. 非空数据
     * 2. 收益率要在0~30以内
     * 3. 投资步长需为整数
     *
     * @param product
     */
    private void checkProduct(Product product) {
        // 1. 非空数据
        Assert.notNull(product.getId(), "编号不可为空");

        // 2. 收益率要在0~30以内
        Assert.isTrue(BigDecimal.ZERO.compareTo(product.getRewardRate()) < 0
                && BigDecimal.valueOf(30).compareTo(product.getRewardRate()) >= 0, "收益率范围错误");

        // 3. 投资步长需为整数
        Assert.isTrue(BigDecimal.valueOf(product.getStepAmount().longValue())
                .compareTo(product.getStepAmount()) == 0, "投资步长需为整数");
    }

    /**
     * 设置默认值
     * 创建时间、更新时间、投资步长、锁定期、状态
     *
     * @param product
     */
    private void setDefault(Product product) {
        // 创建时间
        if (product.getCreateAt() == null) {
            product.setCreateAt(new Date());
        }
        // 更新时间
        if (product.getUpdateAt() == null) {
            product.setUpdateAt(new Date());
        }
        // 投资步长
        if (product.getStepAmount() == null) {
            product.setStepAmount(BigDecimal.ZERO);
        }
        // 锁定期
        if (product.getLockTerm() == null) {
            product.setLockTerm(0);
        }
        // 状态
        if (product.getStatus() == null) {
            product.setStatus(ProductStatus.AUDITING.name());
        }
    }

}
