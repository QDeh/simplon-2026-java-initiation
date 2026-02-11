package fr.simplon.exercises;

/**
 * Exercice 16: Tri par insertion (Insertion Sort)
 * 
 * Objectif: Apprendre l'algorithme de tri par insertion, similaire au tri de
 * cartes
 */
public class Exercise16InsertionSort {

    Exercise12SwappingElements exercise12 = new Exercise12SwappingElements();
    Exercise13SimpleSearch exercise13 = new Exercise13SimpleSearch();

    /**
     * Trie un tableau en utilisant l'algorithme de tri par insertion
     * 
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int cellValue = array[i];
            int positionValue = i - 1;
            while (positionValue >= 0 && cellValue < array[positionValue]) {
                array[positionValue + 1] = array[positionValue];
                positionValue--;
            }
            array[positionValue + 1] = cellValue;
        }
        return array;
    }

    /*
        public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int cellValue = array[i];
            int positionValue = -1;

            for (int j = i - 1; j >= 0; j--) {
                if (cellValue < array[j]) {
                    positionValue = j;
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }

            if (positionValue >= 0) {
                array[positionValue] = cellValue;
            }
        }
        return array;
    }

     */
    
    /**
     * Trie un tableau en ordre décroissant avec le tri par insertion
     * 
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] insertionSortDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int cellValue = array[i];
            int positionValue = i - 1;
            while (positionValue >= 0 && cellValue > array[positionValue]) {
                array[positionValue + 1] = array[positionValue];
                positionValue--;
            }
            array[positionValue + 1] = cellValue;
        }
        return array;
    }

    /**
     * Compte le nombre de décalages effectués pendant le tri par insertion
     * 
     * @param array le tableau à trier
     * @return le nombre de décalages effectués
     */
    public int countShifts(int[] array) {
        int compt = 0;
        for (int i = 1; i < array.length; i++) {
            int cellValue = array[i];
            int positionValue = i - 1;
            while (positionValue >= 0 && cellValue < array[positionValue]) {
                array[positionValue + 1] = array[positionValue];
                compt++;
                positionValue--;
            }
            array[positionValue + 1] = cellValue;
        }
        return compt;
    }

    /**
     * Insère un élément à sa place dans un tableau déjà trié
     * 
     * @param sortedArray le tableau trié
     * @param element     l'élément à insérer
     * @return un nouveau tableau avec l'élément inséré à la bonne place
     */
    public int[] insertIntoSorted(int[] sortedArray, int element) {
        int[] appendedArray = new int[sortedArray.length + 1];
        for (int i = 0; i < sortedArray.length; i++) {
            appendedArray[i] = sortedArray[i];
        }
        appendedArray[appendedArray.length - 1] = element;
        insertionSort(appendedArray);
        return appendedArray;
    }
}
