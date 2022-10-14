package Classes;

public class OpereacoesComConjuntos {
          
    public Colecao uniao(Colecao conjunto1, Colecao conjunto2){ //finalizado  
     int tamanho = conjunto1.getNumeros().length + conjunto2.getNumeros().length;
     Colecao conjunto = new Colecao(tamanho);
     
     for(int i =0; i < conjunto1.getNumeros().length; i++){
         for(int j =0; j < conjunto2.getNumeros().length; j++){
                  if(!conjunto.existe(conjunto1.getNumeros()[i])){
                     conjunto.adiciona(conjunto1.getNumeros()[i]);                     
                  }
                  if(!conjunto.existe(conjunto2.getNumeros()[j])){
                     conjunto.adiciona(conjunto2.getNumeros()[j]);  
                  }   
            }
        }
    
     return conjunto;
    }
    
    public Colecao diferenca(Colecao conjunto1, Colecao conjunto2){ //finalizado
     int tamanho = conjunto1.getNumeros().length;
     Colecao conjunto = new Colecao(tamanho);
   
       for(int i =0; i < conjunto1.getNumeros().length; i++){
           if(!conjunto.existe(conjunto1.getNumeros()[i])){
               if(!conjunto2.existe(conjunto1.getNumeros()[i])){
                   conjunto.adiciona(conjunto1.getNumeros()[i]);
               }
           }
       }
       
     return conjunto; 
    }
    
    public Colecao interseccao(Colecao conjunto1, Colecao conjunto2){ //finalizado
     int tamanho = conjunto1.getNumeros().length + conjunto2.getNumeros().length;
     Colecao conjunto = new Colecao(tamanho);
     int k =0;
     
     for(int i =0; i < conjunto1.getNumeros().length; i++){
         for(int j =0; j < conjunto2.getNumeros().length; j++){
              if(conjunto1.getNumeros()[i] == conjunto2.getNumeros()[j]){
                  if(!conjunto.existe(conjunto1.getNumeros()[i])){
                     conjunto.adiciona(conjunto1.getNumeros()[i]);
                     k++; 
                  }
                }
            }
        }   
     
    return conjunto; 
    }   
}