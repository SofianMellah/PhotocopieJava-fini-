package com.afpa.www.bean;

public class Impression {

    private int nombrePhotocopies;
    public Impression (int nombrePhotocopies){
        this.nombrePhotocopies = nombrePhotocopies;
    }
    public int getNombrePhotocopies() {
        return nombrePhotocopies;
    }

    public void setNombrePhotocopies(int nombrePhotocopies) {
        this.nombrePhotocopies = nombrePhotocopies;
    }

    public void calcul(){
        int p = this.nombrePhotocopies;
        if(p< 11) {
            System.out.println("Cela fera " + p * 0.1 + "€");
        }
        if(p > 10 && p < 31) {
            System.out.println("Cela fera " + ((p-10) * 0.09 + 1) + "€");
        }
        if(p > 30) {
            System.out.println("Cela fera " + ((p-30) * 0.08 + 2.8) + "€");
        }
    }
}

