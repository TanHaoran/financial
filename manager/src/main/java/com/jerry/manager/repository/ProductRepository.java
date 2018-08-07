package com.jerry.manager.repository;

import com.jerry.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created with IntelliJ IDEA.
 * User: Jerry
 * Date: 2018/8/7
 * Time: 20:38
 * Description: 产品管理
 */
public interface ProductRepository extends JpaRepository<Product, String>, JpaSpecificationExecutor<Product> {
}
