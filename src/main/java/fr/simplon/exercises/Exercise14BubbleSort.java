package fr.simplon.exercises;

/**
 * Exercice 14: Tri à bulles (Bubble Sort)
 * 
 * Objectif: Apprendre l'algorithme de tri le plus simple
 */
public class Exercise14BubbleSort {

    Exercise12SwappingElements exercise12 = new Exercise12SwappingElements();
    Exercise13SimpleSearch exercise13 = new Exercise13SimpleSearch();

    /**
     * Trie un tableau en utilisant l'algorithme de tri à bulles
     * 
     * @param array le tableau à trier
     * @return le tableau trié (modifier le tableau en place)
     */
    public int[] bubbleSort(int[] array) {
        while (!exercise13.isSorted(array)) {
            exercise12.bubblePass(array);
        }
        return array;
    }

    /**
     * Trie un tableau en ordre décroissant avec le tri à bulles
     * 
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] bubbleSortDescending(int[] array) {
        int[] descendingArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            descendingArray[i] = array[array.length - 1 - i];
        }
        bubbleSort(descendingArray);
        for (int i = 0; i < array.length; i++) {
            array[i] = descendingArray[array.length - 1 - i];
        }
        return array;
    }

    /**
     * Compte le nombre d'échanges effectués pendant le tri à bulles
     * 
     * @param array le tableau à trier
     * @return le nombre d'échanges effectués
     */
    public int countSwaps(int[] array) {
        int count = 0;
        while (!exercise13.isSorted(array)) {
            for (int i = 0; i < array.length - 1; i++) {
                if (!exercise12.isInOrder(array, i)) {
                    exercise12.swap(array, i, i + 1);
                    i++;
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Trie uniquement les k premiers éléments d'un tableau avec le tri à bulles
     * 
     * @param array le tableau
     * @param k     le nombre d'éléments à trier
     * @return le tableau avec les k premiers éléments triés
     */
    public int[] partialBubbleSort(int[] array, int k) {
        int minIndex = 0;
        for (int i = 0; i < k; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            exercise12.shiftLeft(array, minIndex, i);
        }
        return array;
    }

}
