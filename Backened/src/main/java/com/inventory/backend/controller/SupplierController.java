package com.inventory.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.backend.entity.Supplier;
import com.inventory.backend.service.SupplierService;

@RestController
@RequestMapping("/api/v1/suppliers")
public class SupplierController {
 private final SupplierService service;

    public SupplierController(SupplierService service) {
        this.service = service;
    }

    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return service.getAllSuppliers();

 
}
}