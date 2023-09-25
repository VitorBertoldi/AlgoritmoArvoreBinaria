// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(6);
        arvore.inserir(4);
        arvore.inserir(65);
        arvore.inserir(45);
        arvore.inserir(15);
        arvore.inserir(9);

        arvore.imprimir(arvore.getRaiz());
        arvore.encontrar(10);

        arvore.imprimir(arvore.getRaiz());

        }
    }