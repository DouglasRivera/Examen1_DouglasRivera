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
public class JaksonVirgens extends Personas {
   
    int Cantidad_Desaparecidos;

    public JaksonVirgens() {
    }

    public JaksonVirgens(int Cantidad_Desaparecidos) {
        this.Cantidad_Desaparecidos = Cantidad_Desaparecidos;
    }

    public JaksonVirgens(int Cantidad_Desaparecidos, String Nombre, int Edad, String Sexo, String Arma) {
        super(Nombre, Edad, Sexo, Arma);
        this.Cantidad_Desaparecidos = Cantidad_Desaparecidos;
    }

    public int getCantidad_Desaparecidos() {
        return Cantidad_Desaparecidos;
    }

    public void setCantidad_Desaparecidos(int Cantidad_Desaparecidos) {
        this.Cantidad_Desaparecidos = Cantidad_Desaparecidos;
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
