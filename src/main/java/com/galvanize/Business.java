package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {

    private final String name;
    private final ArrayList<Address> addresses;

    public Business(String name) {

        this.name = name;
        addresses = new ArrayList<Address>();
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);

    }

}
