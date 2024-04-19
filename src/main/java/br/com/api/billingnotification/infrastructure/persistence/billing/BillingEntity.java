package br.com.api.billingnotification.infrastructure.persistence.billing;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BILLING")
public class BillingEntity {

  @Id
  private Long idBilling;
  private Long idUser;
  private Double value;
  private String status;
  private Long installments;
  private String description;
  private LocalDateTime createdAt;
  private LocalDateTime dateReference;

  public BillingEntity() {
  }

  public BillingEntity(Long idUser, Double value, String status, Long installments, String description,
      LocalDateTime createdAt, LocalDateTime dateReference) {
    this.idUser = idUser;
    this.value = value;
    this.status = status;
    this.installments = installments;
    this.description = description;
    this.createdAt = createdAt;
    this.dateReference = dateReference;
  }

  public Long getIdBilling() {
    return idBilling;
  }

  public void setIdBilling(Long idBilling) {
    this.idBilling = idBilling;
  }

  public Long getIdUser() {
    return idUser;
  }

  public void setIdUser(Long idUser) {
    this.idUser = idUser;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Long getInstallments() {
    return installments;
  }

  public void setInstallments(Long installments) {
    this.installments = installments;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getDateReference() {
    return dateReference;
  }

  public void setDateReference(LocalDateTime dateReference) {
    this.dateReference = dateReference;
  }
}
