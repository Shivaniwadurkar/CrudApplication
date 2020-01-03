package springbootrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootmodel.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
