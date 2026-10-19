package uk.ac.westminster.products_api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.Model.DigitalProduct;
import uk.ac.westminster.products_api.Model.PhysicalProduct;
import uk.ac.westminster.products_api.Model.Product;
import uk.ac.westminster.products_api.Services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id).orElse(null);
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @PostMapping("/addDigitalProduct")
    public Product addDigitalProduct(@RequestBody DigitalProduct product){return productService.addProduct(product);}

    @PostMapping("/addPhysicalProduct")
    public Product addPhysicalProduct(@RequestBody PhysicalProduct product){return productService.addProduct(product);}

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable Long id){productService.deleteProduct(id);}

    @GetMapping("/search/{name}")
    public List<Product> findByName(@PathVariable String name){
        return productService.findByName(name);
    }
}
