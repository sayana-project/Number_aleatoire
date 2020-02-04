package com.example.number_aleatoire.model;


public final class RandomNum {

    public  String getSave_rnum() {
        return save_rnum;
    }

    private int random_number;
    private  String save_rnum= "savenumber";

    private static int min=1;
    private static int max=100;

    private int rnum;

    public static int getMin() {
        return min;
    }

    public static int getMax() {
        return max;
    }



    public int generateRnum() {
        GeneRand();
        return rnum;
    }

    // meme nom que que la classe pour creer le nombre aleatoire

    private void GeneRand(){

        this.rnum = (int) (Math.random() *( getMin()- getMax()));
    }


}

