/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.local.cursojava;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Carol
 */
public class HoraSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date rel = new Date();
        System.out.println("Informações gerais do sistema:\n");
        System.out.println("Data e horário atuais: ");
        System.out.println(rel.toString());
        System.out.println("O idioma do seu sistema é: ");
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do sistema é:\n" + d.width + " X " + d.height);
    }
    
}
