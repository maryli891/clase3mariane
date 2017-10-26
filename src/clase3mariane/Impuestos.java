/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3mariane;
import java.util.Scanner;//
/**
 *
 * @author LC22
 */
public class Impuestos 
{
 public Impuestos() //Constructor
 {
 
 }
 public static void main(String[] args)
 {
  int sueldo;
  Scanner escaner = new Scanner(System.in);
  System.out.print("Ingrese su Salario");
  sueldo = escaner.nextInt();
  
  if(sueldo>600000)
  {
   System.out.println("Debe Pagar Impuestos");
  }
 }
}
