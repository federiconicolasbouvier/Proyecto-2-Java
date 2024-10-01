/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bouvier.project2;

/**
 *
 * @author Bouvier, Federico Nicolás
 */
public class Project2 {
    /** 
     *
     * @param args 
     */
    public static void main(String[] args) {
        Project2GUI temperaturaCelsius = new Project2GUI();
        temperaturaCelsius.setVisible(true);
    }
}
/* Este código cumple la misma función SIN la interfaz gráfica (Project2GUI.java)
    double temperaturaCelsius, temperaturaFahrenheit; //Defino dos variables numéricas tipo decimal, una para cada temperatura 
    temperaturaCelsius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en grados Celsius:")); //Solicita al usuario la temperatura en grados Celsius, almacenando ese valor en una variable
    temperaturaFahrenheit = temperaturaCelsius * 9/5 + 32; //Calcula la temperatura en grados Fahrenheit, teniendo en cuenta el valor ingresado por el usuario
    JOptionPane.showMessageDialog(null, "Tras realizar la conversión, se obtienen "+temperaturaFahrenheit+" grados Fahrenheit.");//Muestra la temperatura en grados Fahrenheit, luego de realizar la conversión 
*/