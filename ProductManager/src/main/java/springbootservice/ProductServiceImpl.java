package springbootservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootmodel.Product;
import springbootrepository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product save(Product product) {

		return productRepo.save(product);
	}

	@Override
	public List<Product> productList() {
		return productRepo.findAll();
	}

	@Override
	public void delete(Integer id) {
		productRepo.deleteById(id);
		System.out.println("product deleted succesfully");
	}

	@Override
	public Product updateProductInfo(Product product) {
		return productRepo.save(product);
	}

}
