/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Ibrahim
 */
public class Ordre {
    private int id_ordre;
    private String reference;
    private String client_name;
    private float totalHT;
    private float totalTTC;
    private int nbrProduct;
    private String date;

    public int getId_ordre() {
        return id_ordre;
    }

    public String getReference() {
        return reference;
    }

    public String getClient_name() {
        return client_name;
    }

    public float getTotalHT() {
        return totalHT;
    }

    public float getTotalTTC() {
        return totalTTC;
    }

    public int getNbrProduct() {
        return nbrProduct;
    }

    public String getDate() {
        return date;
    }

    public void setId_ordre(int id_ordre) {
        this.id_ordre = id_ordre;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public void setTotalHT(float totalHT) {
        this.totalHT = totalHT;
    }

    public void setTotalTTC(float totalTTC) {
        this.totalTTC = totalTTC;
    }

    public void setNbrProduct(int nbrProduct) {
        this.nbrProduct = nbrProduct;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Ordre(String reference, String client_name, float totalHT, float totalTTC, int nbrProduct, String date) {
        this.reference = reference;
        this.client_name = client_name;
        this.totalHT = totalHT;
        this.totalTTC = totalTTC;
        this.nbrProduct = nbrProduct;
        this.date = date;
    }

    public Ordre(int id_ordre, String reference, String client_name, float totalHT, float totalTTC, int nbrProduct, String date) {
        this.id_ordre = id_ordre;
        this.reference = reference;
        this.client_name = client_name;
        this.totalHT = totalHT;
        this.totalTTC = totalTTC;
        this.nbrProduct = nbrProduct;
        this.date = date;
    }

    public Ordre(String client_name) {
        this.client_name = client_name;
    }
    
}
