package br.com.api.billingnotification.infrastructure.controllers.billing;

import java.time.LocalDateTime;

import br.com.api.billingnotification.domain.enterprise.entity.Billing;

public class BillingDTOMapper {

  DataBillingResponse toResponse(Billing billing) {
    return new DataBillingResponse(billing.idBilling(), billing.idUser(), billing.value(), billing.status(),
        billing.installments(), billing.description(), billing.createdAt(), billing.dateReference());
  }

  Billing toBilling(DataBillingRequest dataBillingRequest) {
    return new Billing(dataBillingRequest.id(), dataBillingRequest.idUser(), dataBillingRequest.value(),
        dataBillingRequest.status(), dataBillingRequest.installments(), dataBillingRequest.description(),
        LocalDateTime.now(), dataBillingRequest.dateReference());
  }
}
