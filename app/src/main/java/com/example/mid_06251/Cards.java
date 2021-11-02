package com.example.mid_06251;

public class Cards {

    int img,harga,satuan;
    String name,deskripsi;

    public Cards(int img, String name, String deskripsi, int harga, int satuan) {
        this.img = img;
        this.name = name;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.satuan = satuan;
    }
    public int getImg() {
        return img;
    }
    public String getName() {
        return name;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public String getharga(){
        return String.valueOf(harga);
    }
    public String getsatuan(){
        return String.valueOf(satuan);
    }
}