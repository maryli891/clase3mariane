/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3mariane;

/**
 *
 * @author LC22
 */
public class Caballo 
{
    //Declaracion de atributos de Clase
  String altura;
  String color;
  String peso;
  String raza;
  int patas = 4, edad;
  
  //Metodo contructor
  public Caballo (String nuevoNombre)
  { 
      raza = nuevoNombre;
}
  //Metodos get y set de la clase
  public void relinchar()
  { 
 }
  //Metodo para obtener la raza del caballo
  public String obtenerRaza()
  { 
      //Sentencia obligatoria de retorno
      return raza;
   }
  public int obtenerEdad() 
  {
      return edad;
  }
  
  }