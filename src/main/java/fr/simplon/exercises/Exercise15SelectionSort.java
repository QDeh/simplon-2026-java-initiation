package fr.simplon.exercises;

/**
 * Exercice 15: Tri par sélection (Selection Sort)
 * 
 * Objectif: Apprendre un algorithme de tri efficace basé sur la sélection du
 * minimum
 */
public class Exercise15SelectionSort {

    Exercise12SwappingElements exercise12 = new Exercise12SwappingElements();

    /**
     * Trie un tableau en utilisant l'algorithme de tri par sélection
     * 
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] selectionSort(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            exercise12.swap(array, minIndex, i);
        }
        return array;

    }

    /**
     * Trie un tableau en ordre décroissant avec le tri par sélection
     * 
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] selectionSortDescending(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            exercise12.swap(array, maxIndex, i);
        }
        return array;

    }

    /**
     * Trouve les k plus petits éléments d'un tableau (non triés entre eux)
     * 
     * @param array le tableau
     * @param k     le nombre d'éléments à trouver
     * @return un tableau contenant les k plus petits éléments
     */
    public int[] findKSmallest(int[] array, int k) {
        int[] kSmallest = new int[k];
        int minIndex = 0;
        for (int i = 0; i < k; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            kSmallest[i] = array[minIndex];
            exercise12.swap(array, minIndex, i);
        }
        return kSmallest;

    }

    /**
     * Compte le nombre de comparaisons effectuées pendant le tri par sélection
     * 
     * @param array le tableau à trier
     * @return le nombre de comparaisons
     */
    public int countComparisons(int[] array) {
        int minIndex = 0;
        int compt = 0;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            exercise12.swap(array, minIndex, i);
            compt++;
        }
        return compt;

    }
}
