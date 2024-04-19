package br.com.api.billingnotification.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.api.billingnotification.domain.application.gateways.BillingGateway;
import br.com.api.billingnotification.domain.application.usecases.billing.CreateBillingUseCase;
import br.com.api.billingnotification.infrastructure.controllers.billing.BillingDTOMapper;
import br.com.api.billingnotification.infrastructure.gateways.billing.BillingEntityMapper;
import br.com.api.billingnotification.infrastructure.gateways.billing.BillingRepositoryGateway;
import br.com.api.billingnotification.infrastructure.persistence.billing.BillingRepository;

@Configuration
public class BillingConfig {
  @Bean
  CreateBillingUseCase createBillingUseCase(BillingGateway billingGateways) {
    return new CreateBillingUseCase(billingGateways);
  }

  @Bean
  BillingGateway billingGateway(BillingRepository billingRepository, BillingEntityMapper billingEntityMapper) {
    return new BillingRepositoryGateway(billingEntityMapper, billingRepository);
  }

  @Bean
  BillingEntityMapper billingEntityMapper() {
    return new BillingEntityMapper();
  }

  @Bean
  BillingDTOMapper billingDTOMapper() {
    return new BillingDTOMapper();
  }
}
