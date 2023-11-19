package com.example.amenapp.service;

import com.example.amenapp.entities.Address;
import java.util.List;

public interface IServiceAddress {
    public Address createAddress(Address a);
    public Address findAddressById(Integer id);
    public List<Address> findAllAddress();
    public void deleteAddressById(Integer id);
}
