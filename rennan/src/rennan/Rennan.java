
package rennan;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author rennan
 */
public class Rennan {

    public static double soma(double v1, double v2) {

        return v1 + v2;
    }

    public static double menos(double v1, double v2) {
        return v1 - v2;
    }

    public static double dividido(double v1, double v2) {
        return v1 / v2;
    }

    public static double mult(double v1, double v2) {
        return v1 * v2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Favor fazer uma operação por vez, não sou um gênio");
        do {            
            
        
        String seTadoido = JOptionPane.showInputDialog("Digite o calculo desejado");

        if (seTadoido.contains("+")) {
            StringTokenizer valor = new StringTokenizer(seTadoido);
            double valor1 = Double.parseDouble(valor.nextToken("+"));
            double valor2 = Double.parseDouble(valor.nextToken("+"));

            JOptionPane.showMessageDialog(null, soma(valor1, valor2) + " " + " To ficando bom");

        }

        else if (seTadoido.contains("-")) {
            StringTokenizer valor = new StringTokenizer(seTadoido);
            double esqueciComoUsaAmesmaEmTodas = Double.parseDouble(valor.nextToken("-"));
            double esqueciComoUsaAmesmaEmTodas2 = Double.parseDouble(valor.nextToken("-"));
            JOptionPane.showMessageDialog(null, menos(esqueciComoUsaAmesmaEmTodas, esqueciComoUsaAmesmaEmTodas2) + " " + " Até Diminuindo kk");
        }
        else if (seTadoido.contains("*")) {
            StringTokenizer valor = new StringTokenizer(seTadoido);
            double agoraEmult = Double.parseDouble(valor.nextToken("*"));
            double agoraEmult2 = Double.parseDouble(valor.nextToken("*"));
            JOptionPane.showMessageDialog(null, mult(agoraEmult, agoraEmult2) + " " + " To programando kkk");
        }
        else if (seTadoido.contains("/")) {
            StringTokenizer valor = new StringTokenizer(seTadoido);
            double valor1 = Double.parseDouble(valor.nextToken("/"));
            double valor2 = Double.parseDouble(valor.nextToken("/"));
            JOptionPane.showMessageDialog(null, dividido(valor1, valor2) + " " + " Arnaldo fala muito");
        } else {
            JOptionPane.showMessageDialog(null, " Qual foi meu patrão, ta bagunçando o rolê");
        }
        } while (true);
        

    }

}
