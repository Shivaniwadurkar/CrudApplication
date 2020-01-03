package springbootservice;

import java.util.List;

import springbootmodel.Product;

public interface ProductService {

	Product save(Product product);

	List<Product> productList();

	public void delete(Integer id);

	Product updateProductInfo(Product product);

}
