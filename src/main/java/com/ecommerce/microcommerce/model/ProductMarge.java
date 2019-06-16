package com.ecommerce.microcommerce.model;

public class ProductMarge {

    private Product product;
    int marge;

    public ProductMarge(Product product) {
        this.product = product;
        this.marge = this.product.getPrix() - this.product.getPrixAchat();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getMarge() {
        return marge;
    }

    public void setMarge(int marge) {
        this.marge = marge;
    }
}
