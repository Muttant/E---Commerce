package com.sheryians.major.controller;
import com.sheryians.major.model.Category;
import com.sheryians.major.service.CategoryService;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
@Controller
public class AdminController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/admin")
    public String adminHome(){
        return "adminHome";
    }
    @GetMapping("/admin.categories")
    public String getCat(Model model){
        model.addttribute("categories", categoryService.getAllCategory());
        return "categories";
    }
    @GetMapping("/admin.categories/add")
    public String getCatAdd(Model model){
        model.addAttribute("category", new Category());
        return "categoriesAdd";
    }
    @PostMapping("/admin.categories/add")
    public String postCatAdd(@ModelAttribute("category")Category category){
        categoryService.addCategory(category);
        return "redirect:/admin/categories";
    }
}
