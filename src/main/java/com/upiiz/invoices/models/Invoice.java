package com.upiiz.invoices.models;

import java.util.Date;

public class Invoice {
    private Long invoice_id;
    private String invoice_date;
    private int customer_id;
    private Float amount;

    public Invoice(Long invoice_id, String invoice_date, int customer_id, Float amount) {
        this.invoice_id = invoice_id;
        this.invoice_date = invoice_date;
        this.customer_id = customer_id;
        this.amount = amount;
    }

    public Invoice(){

    }

    public Long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Long invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(String invoice_date) {
        this.invoice_date = invoice_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
