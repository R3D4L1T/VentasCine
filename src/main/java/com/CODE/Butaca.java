
package com.CODE;

public class Butaca {
    private int numero;
    private String lugar;
    private int horario1,horario2,horario3,horario4,horario5; //1=ocupado, 0 desocupado

    public Butaca() {
    }
    
    public Butaca(int number, String location, int ocupado1, int ocupado2, int ocupado3, int ocpuado4, int ocupado5) {
        this.numero = number;
        this.lugar = location;
        this.horario1 = ocupado1;
        this.horario2 = ocupado2;
        this.horario3 = ocupado3;
        this.horario4 = ocpuado4;
        this.horario5 = ocupado5;
    }

    public int getNumber() {
        return numero;
    }

    public void setNumber(int number) {
        this.numero = number;
    }

    public String getLocation() {
        return lugar;
    }

    public void setLocation(String location) {
        this.lugar = location;
    }

    public int getOcupado1() {
        return horario1;
    }

    public void setOcupado1(int ocupado1) {
        this.horario1 = ocupado1;
    }

    public int getOcupado2() {
        return horario2;
    }

    public void setOcupado2(int ocupado2) {
        this.horario2 = ocupado2;
    }

    public int getOcupado3() {
        return horario3;
    }

    public void setOcupado3(int ocupado3) {
        this.horario3 = ocupado3;
    }

    public int getOcupado4() {
        return horario4;
    }

    public void setOcupado4(int ocupado4) {
        this.horario4 = ocupado4;
    }


    public int getOcupado5() {
        return horario5;
    }

    public void setOcupado5(int ocupado5) {
        this.horario5 = ocupado5;
    }
    
    
}
