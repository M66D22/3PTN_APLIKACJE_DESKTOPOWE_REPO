/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author michaldondajewski
 */
public class ProductMenagement {
    private double buyPrice;
    private double sellPrice;
    private String productName;
    private double margin;
    private double count;
    private String supplier;

    public ProductMenagement(String productName) {
        this.productName = productName;
    }

    public ProductMenagement() {
    }

    public ProductMenagement(String productName, double buyPrice, double sellPrice, String supplier) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.productName = productName;
        this.supplier = supplier;
    }

    ProductMenagement(String element, double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return productName + ";" + buyPrice + ";" + sellPrice + ";" 
                + count + ";"+ margin + ";" + supplier;
    } 
}
