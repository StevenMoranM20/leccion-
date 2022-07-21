
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author STEVEN
 */
public class KFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // entrada
        int orden;
    String fecha;
    String nombre;
    String producto = null;
    int Cantidad;
    double  precio = 2.00;
    double subtotal;
           double iva = 0.16;
             double totalP;
         
    orden = Integer.parseInt(JOptionPane.showInputDialog("ingrese orden"));
    nombre = JOptionPane.showInputDialog("ingrese nombre");
    fecha = JOptionPane.showInputDialog("ingrese fecha");
   Cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad"));
    
    // proceso 
    totalP = precio * iva ;
       // salida 
        JOptionPane.showMessageDialog(null, "señor"+ nombre);
        JOptionPane.showMessageDialog(null, "su numero de orden es " + orden);
        JOptionPane.showMessageDialog(null, " la fecha es "+ fecha);
        JOptionPane.showMessageDialog(null, " el producto es " +producto);
        JOptionPane.showMessageDialog(null, " la cantidad del producto es " +Cantidad);
       JOptionPane.showMessageDialog(null, " el total al pagar es " +totalP);
        
        
    }
    
    
}
