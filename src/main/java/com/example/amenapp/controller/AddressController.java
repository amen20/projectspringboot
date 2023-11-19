package com.example.amenapp.controller;


import com.example.amenapp.entities.Address;
import com.example.amenapp.service.IServiceAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/address/")
public class AddressController {

    @Autowired
    IServiceAddress isa;

    @GetMapping("")
    public List<Address> getall() {
        return isa.findAllAddress();
    }

    @GetMapping("/{id}")
    public Address getparid(@PathVariable int id) {
        return isa.findAddressById(id);
    }

    @PostMapping("/add")
    public Address add(@RequestBody Address a) {
        return isa.createAddress(a);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        isa.deleteAddressById(id);
    }
}
