package com.rplbo.utsnota;

public class BukuTulis extends Barang{
    private String merk;

    public BukuTulis(String kodeBarang, int harga, int berat, String deskripsi, String merk) {
        super(deskripsi, kodeBarang, harga, berat);
        this.setMerk(merk);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Override
    public void getInformasi(){
        System.out.println("Kode : " + this.getKodebarang());
        System.out.println("Harga : " + this.getHarga());
        System.out.println("Berat : " + this.getBerat());
        System.out.println("Deskripsi : " + this.getDeskripsi());
        System.out.println("Merk : " + this.getMerk());
        System.out.println("-------------------------------------");
    }
}