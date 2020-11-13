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
    String Supervisores;
    String Campista;
    String Vida;

    public Campistas() {
    }

    public Campistas(String Supervisores, String Campista, String Vida) {
        this.Supervisores = Supervisores;
        this.Campista = Campista;
        this.Vida = Vida;
    }

    public Campistas(String Supervisores, String Campista, String Vida, String Nombre, int Edad, String Sexo, String Arma) {
        super(Nombre, Edad, Sexo, Arma);
        this.Supervisores = Supervisores;
        this.Campista = Campista;
        this.Vida = Vida;
    }

    public String getSupervisores() {
        return Supervisores;
    }

    public void setSupervisores(String Supervisores) {
        this.Supervisores = Supervisores;
    }

    public String getCampista() {
        return Campista;
    }

    public void setCampista(String Campista) {
        this.Campista = Campista;
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
