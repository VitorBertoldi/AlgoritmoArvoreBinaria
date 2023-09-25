import java.util.Scanner;

public class Arvore<T extends Comparable> {

    private No<T> raiz;

    public Arvore() {
        this.raiz = null;

    }

    public void inserir(T valor) {
        No<T> novoNo = new No<T>(valor);
        if (raiz == null) {
            this.raiz = novoNo;
        } else {
            No<T> atual = this.raiz;
            while (true) {
                if (novoNo.getvalor().compareTo(atual.getvalor()) == -1) {
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(novoNo);
                        break;
                    }
                } else {
                    if (atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(novoNo);
                        break;
                    }
                }
            }
        }
    }

    public void imprimir(No<T> atual) {
        if (atual != null) {
            imprimir(atual.getEsquerda());
            System.out.println(atual.getvalor());
            imprimir(atual.getDireita());
        }

    }

    public boolean encontrar(T valor) {
        No<T> atual = this.raiz;
        No<T> pai = null;
        while (atual != null) {
            if (atual.getvalor().equals(valor)) {
                break;
            } else if (valor.compareTo(atual.getvalor()) == -1) {
                atual = atual.getEsquerda();
            } else {
                pai = atual;
                atual = atual.getDireita();
            }
        }
        if (atual != null) {
            System.out.println("Valor encontrado, deseja remover ? 1 --> S 2 --> N");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();
            if (opcao == 1) {
                if (atual.getDireita() != null) {
                    No<T> novoNo = atual.getDireita();
                    No<T> novoPai = atual;
                    while (novoNo.getEsquerda() != null) {
                        novoPai = novoNo;
                        novoNo = novoNo.getEsquerda();
                    }
                    novoNo.setEsquerda(atual.getEsquerda());
                    if (pai != null) {
                        if (atual.getvalor().compareTo(pai.getvalor()) == -1) {
                            pai.setEsquerda(novoNo);
                        } else {
                            pai.setDireita(novoNo);
                        }
                    } else {
                        this.raiz = novoNo;
                        novoPai.setEsquerda(null);
                        this.raiz.setDireita(novoPai);
                        this.raiz.setEsquerda(atual.getEsquerda());
                    }

                    if (novoNo.getvalor().compareTo(novoPai.getvalor()) == -1) {
                        novoPai.setEsquerda(null);
                    } else {
                        novoPai.setDireita(null);
                    }

                } else if (atual.getEsquerda() != null) {
                    No<T> novoNo = atual.getEsquerda();
                    No<T> novoPai = atual;
                    while (novoNo.getDireita() != null) {
                        novoPai = novoNo;
                        novoNo = novoNo.getDireita();
                    }
                    if (pai != null) {
                        if (atual.getvalor().compareTo(pai.getvalor()) == -1) {
                            pai.setEsquerda(novoNo);
                        } else {
                            pai.setDireita(novoNo);
                        }
                    } else {
                        this.raiz = novoNo;
                    }

                    if (novoNo.getvalor().compareTo(novoPai.getvalor()) == -1) {
                        novoPai.setEsquerda(null);
                    } else {
                        novoPai.setDireita(null);
                    }

                } else {
                    if (pai != null) {
                        if (atual.getvalor().compareTo(pai.getvalor()) == -1) {
                            pai.setEsquerda(null);
                        } else {
                            pai.setDireita(null);
                        }
                    } else {
                        this.raiz = null;
                    }
                }
            }else{
                System.out.println("Nao removido");
            }

            return true;

        }else {
            return false;
        }
    }

    public No<T> getRaiz() {
        return raiz;
    }
}
