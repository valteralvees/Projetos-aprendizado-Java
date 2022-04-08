package com.mycompany.resolucaodetela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDeTela {

    public static void main(String[] args) {
        System.out.println("Saberemos agora a sua resolução de tela. ");
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int alt = (int) tela.getHeight();
        int lar = (int) tela.getWidth();
        System.out.println("Sua tela tem a resolução de " + lar + "x" + alt);
        
        
    }
}
