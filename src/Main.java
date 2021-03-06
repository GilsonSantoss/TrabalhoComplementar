import quick.QuickSort;
import bubble.BubbleSort;
import insertion.InsertionSort;
import selection.SelectionSort;
import merge.MergeSort;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        QuickSort       quick       = new QuickSort();
        SelectionSort   selection   = new SelectionSort();
        InsertionSort   insertion   = new InsertionSort();
        MergeSort       merge       = new MergeSort();
        BubbleSort      bubble      = new BubbleSort();
        Scanner in = new Scanner(System.in);

        //Lista para teste de caso
        String[] nomes = {"Maria Clara","Esther","Clara","Marina","Duarte","Gabriela","Rafael","Gabriel","Lourenco","Mauricio","Sarah","Ana Julia","Sabrina","Martim"};

        System.out.println("Lista nao Ordenada de nomes aleatorios!");
        listaNomes(nomes);

        
        int op = 0;
        while(op == 0){

            System.out.println("Selecine o algoritmo que deseja efetuar a ordenacao!\n"+
                                "1 - Quick Sort\n"+
                                "2 - Selection Sort\n"+
                                "3 - Merge Sort\n"+
                                "4 - Insertion Sort\n"+
                                "5 - Bubble Sort\n"+
                                "0 - Sair");

            //Seleciona o algoritmo de ordenação
            op = in.nextInt();
            System.out.print("\r\n");

            //Executa o algoritmo escolhido
            switch(op){
                case 1:
                    System.out.println("Quick Sort selecionado!");
                    quick.quickSort(nomes,0,nomes.length -1);
                break;
                case 2:
                    System.out.println("Selection Sort selecionado!");
                    selection.seletcionSort(nomes);
                break;
                case 3:
                    System.out.println("Merge Sort selecionado!");
                    merge.mergeSort(nomes,0,nomes.length -1);
                break;
                case 4:
                    System.out.println("Insertion Sort selecionado!");
                    insertion.insertionSort(nomes,nomes.length);
                break;
                case 5:
                    System.out.println("Bubble Sort selecionado!");
                    bubble.bubbleSort(nomes);
                break;
                case 0:
                    op = 1;
                break;
                default:
                    System.out.println("Valor digitado esta fora dos padroes do codigo.");
                    op = 0;
                break;
            }
        }

        listaNomes(nomes);
        
    }

    private static void listaNomes(String[] n){
        //Resultado da lista após ordenação
        for(String nome : n){
            System.out.print(nome + ", ");
        }
        System.out.println("\n");
    }
}

