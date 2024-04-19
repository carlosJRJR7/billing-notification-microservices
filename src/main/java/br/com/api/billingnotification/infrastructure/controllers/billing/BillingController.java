package br.com.api.billingnotification.infrastructure.controllers.billing;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.billingnotification.domain.application.usecases.billing.CreateBillingUseCase;
import br.com.api.billingnotification.domain.enterprise.entity.Billing;

@RestController
@RequestMapping("/billing")
public class BillingController {

  private final CreateBillingUseCase createBillingUseCase;
  private final BillingDTOMapper billingDTOMapper;

  public BillingController(CreateBillingUseCase createBillingUseCase, BillingDTOMapper billingDTOMapper) {
    this.createBillingUseCase = createBillingUseCase;
    this.billingDTOMapper = billingDTOMapper;
  }

  @PostMapping
  public DataBillingResponse createBilling(@RequestBody DataBillingRequest dataBillingRequest) {
    Billing billingRequest = billingDTOMapper.toBilling(dataBillingRequest);
    Billing billingObj = createBillingUseCase.createBilling(billingRequest);
    DataBillingResponse billingResponse = billingDTOMapper.toResponse(billingObj);
    return billingResponse;
  }
}
