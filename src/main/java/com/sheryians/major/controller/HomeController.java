package com.sheryians.major.controller;
import com.sheryians.major.service.CategoryService;
import com.sheryians.major.service.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @GetMapping("/", "/home")
    public String home(Model model){
        return "index";
    }
    @GetMapping("/shop")
    public String shop(Model model){
        model.Attribute("categoríe", categoryService.getAllCategory());
        model.Attribute("products", productService.getAllProduct());

        return "shop";
    }
    @GetMapping("/shop/categories/{id}")
    public String shop(Model model, @PathVariable int id){
        model.Attribute("categoríe", categoryService.getAllCategory());
        model.Attribute("products", productService.getAllProductByCategoryId(id));

        return "shop";
    }
    @GetMapping("/shop/viewproduct/{id}")
    public String shop(Model model, @PathVariable int id){
        model.Attribute("products", productService.getProductById(id).get());

        return "viewProduct";
    }

}
