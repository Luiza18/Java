package Classes;

import java.util.Random;

public class ArraysDeNumeros {

    private int[] colecao;
    private int count;

    public ArraysDeNumeros(int tamVetor) {
        colecao = new int[tamVetor];
        count = 0;
    }

    public ArraysDeNumeros() {
        colecao = new int[10];
        count = 0;
    }

    public int[] getColecao() {
        return colecao;
    }

    public boolean adicionar(int valor) { //finalizado
        if (count < colecao.length) {
            colecao[count++] = valor;
            return true;
        }
        return false;
    }

    @SuppressWarnings("empty-statement")
    public void preencher() { //finalizado
        while (adicionar(new Random().nextInt(10)));
    }

    public String toString() {
        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < count; i++) {
            saida.append(colecao[i]).append("\t");
        }
        return saida.toString();
    }

    public int somar() { //finalizado
        int resultado = 0;

        for (int i = 0; i < count; i++) {
            resultado += colecao[i];
        }
        return resultado;
    }

    public void inverter() { //finalizado
        int i = 0;
        int j = count - 1;

        while (i < (count / 2)) {
            int aux = colecao[i];
            colecao[i] = colecao[j];
            colecao[j] = aux;
            i++;
            j--;
        }
    }

    public void ordenar() {  //finalizado
        int aux;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (colecao[i] > colecao[j]) {
                    aux = colecao[i];
                    colecao[i] = colecao[j];
                    colecao[j] = aux;
                }
            }
        }
    }

    public boolean buscaBinaria(int numeroBuscado) { //finalizado
        int meio;
        int inicio = 0;
        int fim = count - 1;
        boolean achou = false;

        ordenar();

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (colecao[meio] == numeroBuscado) {
                achou = true;
                break;
            }

            if (colecao[meio] > numeroBuscado) {
                fim = meio - 1;
            }

            if (colecao[meio] < numeroBuscado) {
                inicio = meio + 1;
            }

        }
        return achou;
    }

    public int tamanhoPosicao(int numero) {
        int tamanho = 0;
        int i = 0;

        do {
            if (colecao[i] == numero) {
                tamanho++;
            }
            i++;
        } while (i < count);

        return tamanho;
    }

    public int[] posicao(int numero) {
        int tamanho = tamanhoPosicao(numero);
        int[] vetor = new int[tamanho];
        int i = 0;

        while (i < tamanho) {
            if (colecao[i] == numero) {
                vetor[i] = colecao[i];
            } else {
                i++;
            }
        }
        return vetor;
    }

    public void substituir(int numeroInicial, int numeroFinal) { //finalizado
        for (int i = 0; i < count; i++) {
            if (colecao[i] == numeroInicial) {
                colecao[i] = numeroFinal;
            }
        }
    }

    public boolean divisiveis(int divisor) { //finalizado
        boolean resposta = false;
        int i = 0;

        do {
            if (colecao[i] % divisor == 0) {
                resposta = true;
            }

            i++;
        } while (i < count);

        return resposta;
    }

    public String histograma() { //finalizado
        StringBuilder desenho = new StringBuilder();
        for (int i = 0; i < count; i++) {
            desenho.append(i).append("\t");
            desenho.append(colecao[i]).append("\t");

            for (int j = 1; j <= colecao[i]; j++) {
                desenho.append("=");
            }

            desenho.append("\n");
        }

        return "Posições \t Valores \t Histograma\n" + desenho.toString();
    }

    public ArraysDeNumeros pares() {
        ArraysDeNumeros resultado = new ArraysDeNumeros(count);

        for (int i = 0; i < count; i++) {
            if (colecao[i] % 2 == 0) {
                resultado.adicionar(colecao[i]);
            }
        }

        return resultado;
    }

    public int repete(int numero) { //finalizado
        int numRepitidos = 0;

        for (int i = 0; i < count; i++) {
            if (colecao[i] == numero) {
                numRepitidos++;
            }
        }

        return numRepitidos;
    }

    public boolean existe(int numero) {
        boolean achou = false;
        for (int i = 0; i < count; i++) {
            if (numero == colecao[i]) {
                achou = true;
            }
        }
        return achou;
    }

    public void addUltimo(int numero) {
        colecao[colecao.length - 1] = numero;
    }

    public ArraysDeNumeros repeticoes() {
        ArraysDeNumeros resultado = new ArraysDeNumeros(count + 1);
        int cont_1 = repete(colecao[0]);
        resultado.adicionar(colecao[0]);
        resultado.addUltimo(cont_1);
        for (int i = 1; i < count; i++) {
            int cont_2 = repete(colecao[i]);
            if (cont_2 > cont_1) {
                resultado.adicionar(colecao[i]);
                resultado.addUltimo(cont_2);
                cont_1 = cont_2;
            } else if (cont_1 == cont_2) {
                if (!resultado.existe(colecao[i])) {
                    resultado.adicionar(colecao[i]);
                }
            }
        }
        return resultado;
    }
}
