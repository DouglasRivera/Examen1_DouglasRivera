/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_douglasrivera;

/**
 *
 * @author famii
 */
public class Armas {
    String TipoArma;
    int Porcentaje;

    public Armas() {
    }

    public Armas(String TipoArma, int Porcentaje) {
        this.TipoArma = TipoArma;
        this.Porcentaje = Porcentaje;
    }

    public String getTipoArma() {
        return TipoArma;
    }

    public void setTipoArma(String TipoArma) {
        this.TipoArma = TipoArma;
    }

    public int getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(int Porcentaje) {
        this.Porcentaje = Porcentaje;
    }
    
}
