package com.shop.service;

import com.shop.Sale;
import com.shop.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> getSales() {
        return saleRepository.findAll();
    }

    public void saveSale(Sale sale) {
        saleRepository.save(sale);
    }

    public Sale getSaleById(Long id) {
        return saleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Wrong id! " +id));
    }

    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }


}
