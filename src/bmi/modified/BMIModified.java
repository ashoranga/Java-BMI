/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.modified;

import javax.swing.JOptionPane;

/**
 *
 * @author Ashoranga
 */
public class BMIModified {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String hightVal,weightVal;
        hightVal= JOptionPane.showInputDialog("Hight in m");
        weightVal= JOptionPane.showInputDialog("Weight in Kg");
      double Hight,Weight,BMI;
        Hight = Double.parseDouble(hightVal);
        Weight = Double.parseDouble(weightVal);
        BMI = (Weight/(Hight*Hight));
        
      System.out.println("BMI is - "+BMI);
      
      if (BMI<=18.5){
      JOptionPane.showMessageDialog(null, "BMI = " + BMI + "  Underweight");
      }
      if ((BMI>18.5)&&(BMI<25)){
          JOptionPane.showMessageDialog(null,"BMI = " + BMI + "  Healthy");
      }
      if ((BMI>=25)&&(BMI<=30)){
          JOptionPane.showMessageDialog(null,"BMI = " + BMI + "  Over Weight");
      }
      if (BMI>30){
          JOptionPane.showMessageDialog(null,"BMI = " + BMI + "  Obese");      } // TODO code application logic here
    }
}
