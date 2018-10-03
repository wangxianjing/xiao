package org.wong.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wong.info.dao.condition.QueryProductDetailCondition;
import org.wong.info.dao.dao.ProductDetailDAO;
import org.wong.info.dao.po.ProductDetail;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wong on 2018\8\19 0019
 */
@Service
public class ProductDetailService {
    @Autowired
    ProductDetailDAO productDetailDAO;

    public void save(ProductDetail productDetail) {
        productDetailDAO.save(productDetail);
    }

    public List<ProductDetail> queryByCondition(QueryProductDetailCondition condition) {
        return productDetailDAO.queryByCondition(condition);
    }

    public void update(ProductDetail productDetail) {
        productDetailDAO.update(productDetail);
    }
}

