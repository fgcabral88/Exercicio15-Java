
package funcao01;

public class Fatorial {
    
    // Atributos:
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    // Método setValor:
   public void setValor(int n){
        num = n;
        int f = 1;
        String s = "";
 
        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += "1 =";
        fat = f;
        formula = s;
    }
    
    // Método getFatorial:
    public int getFatorial(){
        return fat;
    }
    
    // Método getFormula:
    public String getFormula(){
        return formula;
    }
}
