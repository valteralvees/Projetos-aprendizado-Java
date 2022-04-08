package com.mycompany.idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        System.out.println("Seja bem vindo. Veremos qual o idioma seu sistema está!");
        Locale loc = Locale.getDefault();
        String idioma = (loc.getDisplayLanguage());
        System.out.println("Seu sistema está em: " + idioma);
    } 
}
