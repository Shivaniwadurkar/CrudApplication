package springbootcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootmodel.Product;
import springbootservice.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/upload")
	public Product upload() {
		return new Product();
	}

	@PostMapping("/upload/product")
	public Product upload(@RequestBody Product product) {
		return productService.save(product);

	}

	@GetMapping("/list")
	public List<Product> listOfProducts() {
		return productService.productList();
	}

	@DeleteMapping("/delete_product")
	public void deleteProduct(@PathVariable("id") Integer id) {
		productService.delete(id);
	}

	@PutMapping("/update_product")
	public Product updateProduct(@RequestBody Product product) {

		return productService.updateProductInfo(product);
 }

}