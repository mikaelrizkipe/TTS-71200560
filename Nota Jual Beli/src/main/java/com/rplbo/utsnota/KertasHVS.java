package com.rplbo.utsnota;

public class KertasHVS extends Barang {
    private int gram;

    public KertasHVS(String deskripsi, int harga, int berat, String kodeBarang, int gram) {
        super(deskripsi, kodeBarang, harga, berat);
        this.setGram(gram);
    }

    public int getGram() {
        return this.gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    @Override
    public void getInformasi(){
        System.out.println("Kode : "+this.getKodebarang());
        System.out.println("Harga : "+this.getHarga());
        System.out.println("Berat : "+this.getBerat());
        System.out.println("Deskripsi : "+this.getDeskripsi());
        System.out.println("Gram : "+this.getGram());
        System.out.println("-------------------------------------");
    }
}