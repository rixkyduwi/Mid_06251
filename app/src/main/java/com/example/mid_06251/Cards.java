package com.example.mid_06251;

public class Cards {

    int img,harga,satuan;
    String name,deskripsi;
    int img2,harga2,satuan2;
    String name2,deskripsi2;

    public Cards(int img, String name, String deskripsi, int harga, int satuan,
                 int img2, String name2, String deskripsi2, int harga2, int satuan2) {
        this.img = img;
        this.name = name;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.satuan = satuan;
        this.img2 = img2;
        this.name2 = name2;
        this.deskripsi2 = deskripsi2;
        this.harga2 = harga2;
        this.satuan2 = satuan2;
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
    public int getImg2() {
        return img2;
    }

    public String getName2() {
        return name2;
    }

    public String getDeskripsi2() {
        return deskripsi2;
    }
    public int getharga(){
        return harga;
    }
    public int getsatuan(){
        return satuan;
    }
    public int getharga2(){
        return harga2;
    }
    public int getsatuan2(){
        return satuan2;
    }
}