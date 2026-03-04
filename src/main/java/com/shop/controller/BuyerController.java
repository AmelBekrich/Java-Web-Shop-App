package com.shop.controller;

import com.shop.Buyer;
import com.shop.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/buyers")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @GetMapping
    public String getBuyers(Model model) {
        List<Buyer> buyers = buyerService.getBuyers();
        model.addAttribute("buyers", buyers);
        return "buyers";
    }

    @GetMapping("/new")
    public String showBuyer(Model model) {
        Buyer buyer = new Buyer();
        model.addAttribute("buyer", buyer);
        return "buyer-form";
    }

    @PostMapping
    public String saveBuyer(@ModelAttribute("buyer") Buyer buyer) {
        buyerService.saveBuyer(buyer);
        return "redirect:/buyers";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") Long id, Model model) {
        Buyer buyer = buyerService.getBuyerById(id);
        model.addAttribute("buyer", buyer);
        return "buyer-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteBuyer(@PathVariable("id") Long id) {
        buyerService.deleteBuyer(id);
        return "redirect:/buyers";
    }
}
