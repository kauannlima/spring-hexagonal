package com.klima.hexagonal.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "customers")

public class CustomerEntity {

    @Id
    private String id;
    private String name;
    private AddressEntity address;
    private String cpf;
    @Field("isValidCpf")
    private Boolean validCpf;
}
