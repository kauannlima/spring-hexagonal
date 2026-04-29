package com.klima.hexagonal.config;

import com.klima.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.klima.hexagonal.adapters.out.InsertCustomerAdapter;
import com.klima.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.klima.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
