package br.com.api.billingnotification.infrastructure.gateways.billing;

import org.springframework.transaction.annotation.Transactional;

import br.com.api.billingnotification.domain.application.gateways.BillingGateway;
import br.com.api.billingnotification.domain.enterprise.entity.Billing;
import br.com.api.billingnotification.infrastructure.persistence.billing.BillingEntity;
import br.com.api.billingnotification.infrastructure.persistence.billing.BillingRepository;

public class BillingRepositoryGateway implements BillingGateway {

  private final BillingEntityMapper billingEntityMapper;
  private final BillingRepository billingRepository;

  public BillingRepositoryGateway(BillingEntityMapper billingEntityMapper, BillingRepository billingRepository) {
    this.billingEntityMapper = billingEntityMapper;
    this.billingRepository = billingRepository;
  }

  @Override
  @Transactional
  public Billing createBilling(Billing billing) {
    BillingEntity billingEntity = billingEntityMapper.toEntity(billing);
    BillingEntity billingEntitySaved = billingRepository.save(billingEntity);

    return billingEntityMapper.toDomain(billingEntitySaved);
  }
}
