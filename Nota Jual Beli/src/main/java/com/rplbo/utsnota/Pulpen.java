package com.rplbo.utsnota;

public class Pulpen extends Barang{
    private String warna;

    public Pulpen(String deskripsi, int harga, int berat, String kodeBarang, String warna) {
        super(deskripsi, kodeBarang, harga, berat);
        this.setWarna(warna);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void getInformasi(){
        System.out.println("Kode : " + this.getKodebarang());
        System.out.println("Harga : " + this.getHarga());
        System.out.println("Berat : " + this.getBerat());
        System.out.println("Deskripsi : " + this.getDeskripsi());
        System.out.println("Warna : " + this.getWarna());
        System.out.println("-------------------------------------");
    }
}