/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.local.cursojava;

import javax.swing.JOptionPane;
/**
 *
 * @author Carol
 */
public class exerRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, cont = 0, pares = 0, impares = 0, cemmais = 0;
        float media;
        
        do {
             n =  Integer.parseInt(JOptionPane.showInputDialog("<html>Informe um número: <br><em>(Digite 0 para interromper)</em></html>"));
             s += n;
            if (n != 0) {
                if (n % 2 == 0){
                 pares++;
             } else {
                 impares++;
             }
             if (n > 100) {
                 cemmais++;
             }
            
            cont++;
            }
                 
        }while (n != 0);
        media = (float)s / (float)cont;
        JOptionPane.showInputDialog("<html>Resultado final:<br>----------------" +
                "<br>Soma dos valores digitados: " + s +
                "<br>Quantidade de números pares digitados: " + pares + 
                "<br>Quantidade de números ímpares digitados: " + impares +
                "<br>Quantidade de números maiores que cem digitados: " + cemmais +
                "<br>Média dos valores digitados: " + media);
        
      
     
    }
    
}
