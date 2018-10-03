package org.wong.info.dao.dao;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wong.info.dao.condition.QueryProductDetailCondition;
import org.wong.info.dao.constant.UnsetValue;
import org.wong.info.dao.mapper.ProductDetailMapper;
import org.wong.info.dao.po.ProductDetail;
import org.wong.info.dao.po.ProductDetailExample;

import java.util.List;

/**
 * Created by wong on 2018\8\18 0018
 */
@Service
public class ProductDetailDAO {
    @Autowired
    private ProductDetailMapper productDetailMapper;

    public void save(ProductDetail productDetail) {
        productDetailMapper.insert(productDetail);
    }

    public List<ProductDetail> queryByCondition(QueryProductDetailCondition condition) {
        ProductDetailExample example = new ProductDetailExample();
        ProductDetailExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(condition.getTitle())) {

        }
        if (UnsetValue.UnSetInt != condition.getCategory()) {
            criteria.andProductCatgotyEqualTo(condition.getCategory());
        }
        if (UnsetValue.UnSetInt != condition.getPriceLevel()) {
            criteria.andPriceLevelEqualTo(condition.getPriceLevel());
        }
        if (UnsetValue.UnSetInt != condition.getState()) {
            criteria.andProductStateEqualTo(condition.getState());
        }
        if (UnsetValue.UnSetInt != condition.getType()) {
            criteria.andProductTypeEqualTo(condition.getType());
        }
        return productDetailMapper.selectByExample(example);
    }

    public void update(ProductDetail productDetail) {
        productDetailMapper.updateByPrimaryKey(productDetail);
    }
}
