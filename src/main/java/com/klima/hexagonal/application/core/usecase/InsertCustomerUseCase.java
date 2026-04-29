package com.klima.hexagonal.application.core.usecase;

import com.klima.hexagonal.application.core.domain.Customer;
import com.klima.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.klima.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.klima.hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.klima.hexagonal.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(
    FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
    InsertCustomerOutputPort insertCustomerOutputPort,
    SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }
}
