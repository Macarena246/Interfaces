/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1InterfazUser.crearCombobox;

/**
 *
 * @author Macarena
 */
public class Club {
    
    //Atributos:
    String nombreClub;
    int annoClub;
    String estadioClub;
    
    //Constructor por defecto.
    public Club(){
        
    }
    
    //Constructor con parámetros:
    public Club(String nombreclub , int annoClub, String estadioClub){
        nombreClub = this.nombreClub;
        annoClub = this.annoClub;
        estadioClub = this.estadioClub;
    }

    //Getters y Setters:
    
    //Devuelve el nombre del Club.
    public String getNombreClub() {
        return nombreClub;
    }

    //Devuelve el año del Club.
    public int getAnnoClub() {
        return annoClub;
    }

    //Devuelve el nombre del estadio del Club.
    public String getEstadioClub() {
        return estadioClub;
    }

    //Modifica el nombre del Club.
    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    //Modifica el año del Club.
    public void setAnnoClub(int annoClub) {
        this.annoClub = annoClub;
    }

    //Modifica el nombre del estadio del Club.
    public void setEstadioClub(String estadioClub) {
        this.estadioClub = estadioClub;
    }

    //Método toString que muestra la información:
    @Override
    public String toString() {
        return this.nombreClub;
    }
    
}
