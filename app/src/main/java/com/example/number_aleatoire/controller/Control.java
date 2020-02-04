package com.example.number_aleatoire.controller;

import com.example.number_aleatoire.model.RandomNum;

public final class Control {

    private static Control instance =null;
    private RandomNum randomNum;

    private Control(){
        super();
    }

    // singleton permet de creer qu'une seule instance
    public static final Control getInstance(){
        if(Control.instance == null){
            Control.instance = new Control();
        }
        return Control.instance;
        }

        public void creergeneNumber(){
            randomNum = new RandomNum();
        }

}
