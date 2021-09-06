package com.dio.productcatalog.model;

@Document (indexName = "product", type= "catalog")
public class Product {
    private Long id;
    private String name;
    private Integer amount;

    public Long getId(){
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }
    public void String java.lang.String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

