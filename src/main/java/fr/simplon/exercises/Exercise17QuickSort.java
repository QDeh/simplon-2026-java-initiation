package fr.simplon.exercises;

/**
 * Exercice 17: Tri rapide (Quick Sort)
 * 
 * Objectif: Apprendre l'algorithme de tri rapide
 */
public class Exercise17QuickSort {

    Exercise12SwappingElements exercise12 = new Exercise12SwappingElements();
    Exercise13SimpleSearch exercise13 = new Exercise13SimpleSearch();

    /**
     * Trie un tableau en utilisant l'algorithme de tri par insertion
     * 
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] quickSort(int[] array, int fromIndex, int toIndex) {
        if (fromIndex >= toIndex) {
            return array;
        }
        int pivot = toIndex;
        int indiceSwap = fromIndex - 1;
        for (int i = fromIndex; i < toIndex; i++) {
            if (array[i] <= array[pivot]) {
                indiceSwap++;
                exercise12.swap(array, indiceSwap, i);
            }
        }
        exercise12.swap(array, pivot, indiceSwap + 1);
        quickSort(array, fromIndex, indiceSwap);
        quickSort(array, indiceSwap + 2, toIndex);
        return array;
    }

    /**
     * Trie un tableau en ordre décroissant avec le tri par insertion
     * 
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] quickSortDescending(int[] array, int fromIndex, int toIndex) {
        if (fromIndex >= toIndex) {
            return array;
        }
        int pivot = toIndex;
        int indiceSwap = fromIndex - 1;
        for (int i = fromIndex; i < toIndex; i++) {
            if (array[i] >= array[pivot]) {
                indiceSwap++;
                exercise12.swap(array, indiceSwap, i);
            }
        }
        exercise12.swap(array, pivot, indiceSwap + 1);
        quickSortDescending(array, fromIndex, indiceSwap);
        quickSortDescending(array, indiceSwap + 2, toIndex);
        return array;
    }
}
