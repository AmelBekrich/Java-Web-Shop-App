package com.shop.service;

import com.shop.Buyer;
import com.shop.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getBuyers() {
        return buyerRepository.findAll();
    }

    public void saveBuyer(Buyer buyer) {
        buyerRepository.save(buyer);
    }

    public void deleteBuyer(Long id) {
        buyerRepository.deleteById(id);
    }

    public Buyer getBuyerById(Long id) {
        return buyerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Wrong id! " +id));
    }


}
