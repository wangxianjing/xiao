import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wong.info.dao.dao.ProductDetailDAO;
import org.wong.info.dao.po.ProductDetail;

/**
 * Created by wong on 2018\8\18 0018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:context/context-mybatis.xml",
        "classpath:context/context-dao.xml",
})
public class ProductDetailDAOTest {
    @Autowired
    ProductDetailDAO productDetailDAO;

    @Test
    public void  testSave() {
        ProductDetail productDetail = new ProductDetail();
        productDetail.setDetail("MBA");
        productDetailDAO.save(productDetail);
    }
}
