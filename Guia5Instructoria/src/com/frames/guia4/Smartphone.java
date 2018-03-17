
package com.frames.guia4;

public class Smartphone {
    
    private double tamPantalla;
    private double capacidadBateria;
    private String refMarca;
    private double precio;
    private double pixelajeCamaraPrincipal;
    private double pixelajeCamaraFrontal;
    private double tiempoGarantia;
    private double cpu;
    private double gpu;
    private double ram;
    
    
    public int bateriaPantalla(double tamPantalla,double capacidadBateria){
        this.tamPantalla=tamPantalla;
        this.capacidadBateria=capacidadBateria;
        if (tamPantalla>0 && tamPantalla<=4) {
            if (capacidadBateria>0 && capacidadBateria<=1200) {
                return 3;
            }else if(capacidadBateria>1200 && capacidadBateria<=2400){
                return 4;
            }else if(capacidadBateria>2400 && capacidadBateria<=3100){
                return 5;
            }else if (capacidadBateria>3100) {
                return 6;
            }
            
        }else if (tamPantalla>0 && tamPantalla<=5) {
            if (capacidadBateria>0 && capacidadBateria<=1200) {
                return 1;
            }else if(capacidadBateria>1200 && capacidadBateria<=2400){
                return 2;
            }else if(capacidadBateria>2400 && capacidadBateria<=3100){
                return 3;
            }else if (capacidadBateria>3100) {
                return 4;
            }
        }else{
            return 0;
        }
        return 0;
    }
    
    public int referenciaMarca(String refMarca){
        if (refMarca.equalsIgnoreCase("nexus") || refMarca.equalsIgnoreCase("lenovo")  || refMarca.equalsIgnoreCase("huawei") || refMarca.equalsIgnoreCase("sony") || refMarca.equalsIgnoreCase("apple")) {
            return 4;
        }else if(refMarca.equalsIgnoreCase("samsumg") || refMarca.equalsIgnoreCase("alcatel") || refMarca.equalsIgnoreCase("lg")){
            return 3;
        }else{
            return 2;
        }
    }
    
    public int rangoPrecio(double precio){
        this.precio=precio;
        if (precio<100) {
            return 2;
        }else if (precio>=100 && precio<=350) {
            return 3;
        }else if (precio>350) {
            return 4;
        }else{
            return 0;
        }
    }
    
    public int pixelaje(double pixelajePrincipal,double pixelajeFrontal){
        this.pixelajeCamaraPrincipal=pixelajePrincipal;
        this.pixelajeCamaraFrontal=pixelajeFrontal;
        if (pixelajeCamaraPrincipal>0 && pixelajeCamaraPrincipal<=5) {
            if (pixelajeCamaraFrontal>0 && pixelajeCamaraFrontal<2) {
                return 1;
            }else if (pixelajeCamaraFrontal>2) {
                return 2;
            }
        }else if (pixelajeCamaraPrincipal>5 && pixelajeCamaraPrincipal<=8) {
            if (pixelajeCamaraFrontal>0 && pixelajeCamaraFrontal<2) {
                return 1;
            }else if (pixelajeCamaraFrontal>2 && pixelajeCamaraFrontal<=3 ) {
                return 2;
            }else if (pixelajeCamaraFrontal>3) {
                return 3;
            }
        }else if (pixelajeCamaraPrincipal>8) {
            if (pixelajeCamaraFrontal>0 && pixelajeCamaraFrontal<2) {
                return 1;
            }else if (pixelajeCamaraFrontal>2 && pixelajeCamaraFrontal<5 ) {
                return 2;
            }else if (pixelajeCamaraFrontal>5) {
                return 3;
            }
        }else{
            return 0;
        }
        return 0;
    }
    
    public int getGarantia(double garantia){
        if (garantia>0 && garantia<=3) {
            return 1;
        }else if (garantia>3 && garantia<6) {
            return 2;
        }else if (garantia>6) {
            return 4;
        }else{
            return 0;
        }
    }
    
    
    public int getCpu(int nucleos){
        if (nucleos==2) {
            return 0;
        }else if (nucleos==4) {
            return 1;
        }else if (nucleos==6) {
            return 2;
        }else if (nucleos==8) {
            return 3;
        }else{
            return 0;
        }
    }
    
    public int getRam(double ram){
        this.ram=ram;
        if (ram>0 && ram<=1) {
            return 0;
        }else if (ram>1 && ram<2) {
            return 2;
        }else if (ram>2 && ram<4) {
            return 4;
        }else if (ram>4) {
            return 6;
        }else{
            return 0;
        }
    }
}


