package com.spring_boot.rest_api.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private Integer qtde;

  private Date dateCreated;

  //construtores

  //vazio
  public Product() {
  }
  //Date iremos criar de forma automática

  public Product(String name, Integer qtde) {
    this.name = name;
    this.qtde = qtde;
  }

  //Getters anda Setters
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getQtde() {
    return this.qtde;
  }

  public void setQtde(Integer qtde) {
    this.qtde = qtde;
  }

  public Date getDateCreated() {
    return this.dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  @Override
  public String toString() {
    return "{ id: " + this.id + " ,name: " + this.name + " , qtde: " + this.qtde + ", dateCreated: " + this.dateCreated + "}";
  }



  
}
