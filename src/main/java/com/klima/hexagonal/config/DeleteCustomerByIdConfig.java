package com.klima.hexagonal.config;

import com.klima.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.klima.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.klima.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.klima.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.klima.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.klima.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
