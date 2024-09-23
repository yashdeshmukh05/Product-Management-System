package com.pheonix.productManagementSystem.Product;

import com.pheonix.productManagementSystem.Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {

    // only for admin
    public Product createProduct(CreateProductRequest req) throws ProductException;

    public String deleteProduct(Long productId) throws ProductException;

    public Product updateProduct(Long productId,Product product)throws ProductException;

    // public List<Product> getAllProducts();

    // for user and admin both
    public Product findProductById(Long id) throws ProductException;

    public List<Product> findProductByCategory(String category);

    public List<Product> searchProduct(String query);

    //	public List<Product> getAllProduct(List<String>colors,List<String>sizes,int minPrice, int maxPrice,int minDiscount, String category, String sort,int pageNumber, int pageSize);
    public Page<Product> getAllProduct(String category, List<String>colors, List<String> sizes, Integer minPrice, Integer maxPrice, Integer minDiscount,String sort, String stock, Integer pageNumber, Integer pageSize);

    public List<Product> getAllProducts();

    // public List<Product> findAllProducts();





}

