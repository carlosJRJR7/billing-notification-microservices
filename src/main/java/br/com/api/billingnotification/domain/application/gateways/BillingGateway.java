package br.com.api.billingnotification.domain.application.gateways;

import br.com.api.billingnotification.domain.enterprise.entity.Billing;

public interface BillingGateway {
  Billing createBilling(Billing billing);
}
