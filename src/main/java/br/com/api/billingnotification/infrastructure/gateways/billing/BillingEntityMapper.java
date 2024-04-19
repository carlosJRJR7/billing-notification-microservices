package br.com.api.billingnotification.infrastructure.gateways.billing;

import br.com.api.billingnotification.domain.enterprise.entity.Billing;
import br.com.api.billingnotification.infrastructure.persistence.billing.BillingEntity;

public class BillingEntityMapper {
  BillingEntity toEntity(Billing billing) {
    return new BillingEntity(billing.idUser(), billing.value(), billing.status(), billing.installments(),
        billing.description(), billing.createdAt(), billing.dateReference());
  }

  Billing toDomain(BillingEntity billingEntity) {
    return new Billing(billingEntity.getIdBilling(), billingEntity.getIdUser(), billingEntity.getValue(),
        billingEntity.getStatus(), billingEntity.getInstallments(), billingEntity.getDescription(),
        billingEntity.getCreatedAt(), billingEntity.getDateReference());
  }
}
