package com.example.demo.Service;

import com.example.demo.Model.Inventory;
import com.example.demo.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;



    public List<Inventory> findAllInventory() {
        return inventoryRepository.findAll();
    }
}
