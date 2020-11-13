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
public class Campistas extends Personas {
    String Vida;
    String TipoCampista;

    public Campistas() {
    }

    public Campistas( String TipoCampista, String Vida) {
        this.TipoCampista = TipoCampista;
        this.Vida = Vida;
    }

    public Campistas( String TipoCampista, String Vida, String Nombre, int Edad, String Sexo, String Arma) {
        super(Nombre, Edad, Sexo, Arma);
        this.TipoCampista = TipoCampista;
        this.Vida = Vida;
    }

    public String getTipoCampista() {
        return TipoCampista;
    }

    public void setTipoCampista(String TipoCampista) {
        this.TipoCampista = TipoCampista;
    }


    public String getVida() {
        return Vida;
    }

    public void setVida(String Vida) {
        this.Vida = Vida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String Arma) {
        this.Arma = Arma;
    }
    
}
