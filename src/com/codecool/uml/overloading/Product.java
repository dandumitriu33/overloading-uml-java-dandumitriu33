package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Locale;

public class Product {
    private static int counter=0;
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;

    public Product() {
        counter++;
        id = counter;
        this.name = "undefined";
        this.defaultPrice = 9999.99F;
        this.defaultCurrency = Currency.getInstance(Locale.US);
        this.productCategory = null;
        this.supplier = null;
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        counter++;
        id = counter;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        productCategory = null;
        supplier = null;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return this.defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return this.defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String toString() {
        return "id: " + this.id + ", name: " + this.name + ", default price: " + this.defaultPrice +
                " " + this.defaultCurrency + ", category: " + this.productCategory + ", supplier: " +
                this.supplier;
    }

}
