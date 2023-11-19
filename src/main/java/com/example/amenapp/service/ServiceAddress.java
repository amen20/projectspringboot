package com.example.amenapp.service;

import com.example.amenapp.entities.Address;
import com.example.amenapp.repositories.AddressRepository;
import com.example.amenapp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAddress implements IServiceAddress{

    @Autowired
    AddressRepository addressRepository;

    @Override
    public Address createAddress(Address a) {
        return addressRepository.save(a);
    }

    @Override
    public Address findAddressById(Integer id) {
        return addressRepository.findById(id).get();
    }

    @Override
    public List<Address> findAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public void deleteAddressById(Integer id) {
        addressRepository.deleteById(id);
    }
}
