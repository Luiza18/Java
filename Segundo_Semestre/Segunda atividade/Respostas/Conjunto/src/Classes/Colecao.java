
package Classes;

import java.util.Random;

public class Colecao {
    private int [] numeros;
   private int cont;
   
    public Colecao (int tamVetor) {
        numeros = new int[tamVetor];
        cont = 0;
    }

    public Colecao () {
        numeros = new int[10];
        cont = 0;
    }

    public int[] getNumeros() {
        return numeros;
    }
    
     public boolean adiciona(int valor) { //finalizado
        if (cont  < numeros.length ) {
            numeros[cont++] = valor;
            return true;
        }
        return false;
    }
     
   @SuppressWarnings("empty-statement")
     public void preenche() { //finalizado
        while (adiciona(new Random().nextInt(10)));
    }
     
     public boolean existe(int valor){ //finalizado
         boolean tem = false;
         int i =0;
         
         while( i < cont){
             if(numeros[i] == valor){
                 tem = true;
                 break;
             }else{
                 i++;
             }
                     
         }
         
         return tem;
     }
     
     public String dados() { //finalizado
        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < cont; i++) {
            saida.append(numeros[i]).append("\t");
        }
        return saida.toString();
    }
}
