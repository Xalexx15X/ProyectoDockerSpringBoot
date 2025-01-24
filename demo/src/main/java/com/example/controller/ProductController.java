package com.example.controller;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

import org.springframework.ui.Model;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/products")
public class ProductController {
    
    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String findAll(Model model) {
        List<Product> products = this.repository.findAll();
        model.addAttribute("products", products);
        return "product-list";
    }

    @GetMapping("/new")
    public String getForm(Model model) {
        model.addAttribute("product", new Product());
        return "product-form";
    }

    @PostMapping 
    public String save(@ModelAttribute("product") Product product) {
        this.repository.save(product);
        return "redirect:/products";
    }

    @GetMapping("/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<Product> producto = this.repository.findById(id);
        if (producto.isPresent()) {
            model.addAttribute("product", producto.get());
            return "product-form";
        } else {
            return "redirect:/products";
        }
    }

    @GetMapping("/{id}/delete") 
    public String delete(@PathVariable Long id) {
        this.repository.deleteById(id);
        return "redirect:/products";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable Long id, Model model) {
        Optional<Product> producto = this.repository.findById(id);
        if (producto.isPresent()) {
            model.addAttribute("product", producto.get());
            return "product-show";
        } else {
            return "redirect:/products";
        }
    }
}