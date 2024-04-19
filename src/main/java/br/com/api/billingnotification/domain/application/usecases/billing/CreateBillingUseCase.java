package br.com.api.billingnotification.domain.application.usecases.billing;

import br.com.api.billingnotification.domain.application.gateways.BillingGateway;
import br.com.api.billingnotification.domain.enterprise.entity.Billing;

public class CreateBillingUseCase {
  private final BillingGateway billingGateway;

  public CreateBillingUseCase(BillingGateway billingGateway) {
    this.billingGateway = billingGateway;
  }

  public Billing createBilling(Billing billing) {
    return billingGateway.createBilling(billing);
  }
}
