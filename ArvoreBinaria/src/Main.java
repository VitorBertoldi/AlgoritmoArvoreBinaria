// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(6);
        arvore.inserir(4);
        arvore.inserir(35);
        arvore.inserir(55);
        arvore.inserir(25);
        arvore.inserir(15);
        arvore.inserir(9);

<<<<<<< HEAD
        arvore.imprimirArvore();
        arvore.encontrar(6);
=======
        arvore.imprimir(arvore.getRaiz());
        arvore.encontrar(10);
>>>>>>> parent of 1ce87fe (Add metodo impressao)

        arvore.imprimir(arvore.getRaiz());

        }
    }