package com.Manav.SimpleWebApp.Service;

import com.Manav.SimpleWebApp.Repo.ProductRepo;
import com.Manav.SimpleWebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
    //List<Product> products = new ArrayList<>(  Arrays.asList(new Product(101,"ihone",30000),
     //                                     new Product(102,"samsung",59999)));
    public List<Product> getProducts(){
        return  repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElseGet(() -> new Product());
    }
    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageDate(imageFile.getBytes());
        return repo.save(product);
    }
    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException, IOException {
        product.setImageDate(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return repo.save(product);
    }
    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

    public List<Product> getAllProducts() {

        return null;
    }

    public List<Product> searchProducts(String keyword) {
        return repo.searchProducts(keyword);
    }
}
