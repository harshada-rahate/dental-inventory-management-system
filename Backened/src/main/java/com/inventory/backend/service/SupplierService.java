package com.inventory.backend.service;

import org.springframework.stereotype.Service;
import com.inventory.backend.entity.Supplier;
import com.inventory.backend.repository.SupplierRepository;
import java.util.List;

@Service
public class SupplierService {
  private final SupplierRepository repository;

    public SupplierService(SupplierRepository repository) {
        this.repository = repository;
    }

    public List<Supplier> getAllSuppliers() {
        return repository.findAll();
    }

    public Supplier saveSupplier(Supplier supplier) {
        return repository.save(supplier);
    }






}
