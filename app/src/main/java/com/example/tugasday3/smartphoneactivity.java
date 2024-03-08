package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class smartphoneactivity extends AppCompatActivity {
    private String nama, descripsion;
    private Integer price, image;

    public smartphoneactivity(String nama, String descripsion, Integer price, Integer image) {
        this.nama = nama;
        this.descripsion = descripsion;
        this.price = price;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDescripsion() {
        return descripsion;
    }

    public void setDescripsion(String descripsion) {
        this.descripsion = descripsion;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}