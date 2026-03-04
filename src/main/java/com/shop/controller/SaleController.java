package com.shop.controller;

import com.shop.Sale;
import com.shop.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping
    public String getSales(Model model) {
        List<Sale> sales = saleService.getSales();
        model.addAttribute("sales", sales);
        return "sales";
    }

    @GetMapping("/new")
    public String showSale(Model model) {
        Sale sale = new Sale();
        model.addAttribute("sale", sale);
        return "sale-form";
    }

    @PostMapping
    public String saveSale(@ModelAttribute("sale") Sale sale) {
        saleService.saveSale(sale);
        return "redirect:/sales";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") Long id, Model model) {
        Sale sale = saleService.getSaleById(id);
        model.addAttribute("sale", sale);
        return "sale-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteSale(@PathVariable("id") Long id) {
        saleService.deleteSale(id);
        return "redirect:/sales";
    }

}
