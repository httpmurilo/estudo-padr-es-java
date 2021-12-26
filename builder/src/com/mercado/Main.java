package com.mercado;

import com.mercado.model.Mochila;

public class Main {

    public static void main(String[] args) {
	//construtor com muitos parametros
        Mochila mochila = new Mochila("Adidas","Verde","Escolar","Escolar","1","2",
                "20","2","1","10 kilos","sem","na ecola",2,2);
        System.out.println(mochila);
    }
}
