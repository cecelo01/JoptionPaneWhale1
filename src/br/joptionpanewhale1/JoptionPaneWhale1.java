/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.joptionpanewhale1;
import javax.swing.JOptionPane;

/**
 *
 * @author Marce
 */
public class JoptionPaneWhale1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Hello Word", "Bem vindo", JOptionPane.INFORMATION_MESSAGE);  // msg
        
        int a, resu=0, cc=0, medi, par=0, impar=0;
        
        do{
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um valor: <br>(Valor 0 Inerrompe) </html>"));
            resu += a;
            cc++;
            if(a % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }while( a != 0);
        
        medi = resu / cc;
        
        
        JOptionPane.showMessageDialog(null, "<html> Resultado <hr> A soma dos valores e: "+resu
                                        + "<br>Valores digitados: "+ cc
                                        + "<br>Media dos valores: "+ medi
                                        + "<br>Total de pares: "+par
                                        + "<br>Total de impares: "+impar);
        
        
        
    }
    
}
