/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3mariane;
//import java.util.Scanner;
//Paquete para implementar Ventanas Graficas de usuario
import javax.swing.JOptionPane;//Paquete nuevo
/**
 *
 * @author LC22
 */
public class ImpuestosGUI 
{
 
 public static void main(String[] args)
 {
  int sueldo;
  //Scanner escaner = new Scanner(System.in);
  //System.out.print("Ingrese su Salario");
  // Convertimos el string a entero antes de guardarlo
  sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
  //sueldo = escaner.nextInt();
  
  if(sueldo>600000)
  {
   //System.out.println("Debe Pagar Impuestos");
      JOptionPane.showMessageDialog(null,"Debe pagar Impuestos");
  }
 }
}

