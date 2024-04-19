package br.com.api.billingnotification.infrastructure.persistence.billing;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<BillingEntity, Long> {

}
