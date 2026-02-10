package fr.simplon.exercises;

/**
 * Exercice 9: Tableaux - Transformations
 * 
 * Objectif: Apprendre à créer de nouveaux tableaux à partir de tableaux
 * existants
 */
public class Exercise09ArrayTransformations {

    /**
     * Double tous les éléments d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec tous les éléments doublés
     */
    public int[] doubleElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * array[i];
        }
        return array;
    }

    /**
     * Filtre les nombres pairs d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau contenant seulement les nombres pairs
     */
    public int[] filterEvenNumbers(int[] array) {
        int[] evenArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[count] = array[i];
                count++;
            }
        }
        int[] filteredArray = new int[count];
        for (int i = 0; i < count; i++) {
            filteredArray[i] = evenArray[i];
        }
        return filteredArray;
    }

    /**
     * Copie un tableau dans l'ordre inverse
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec les éléments dans l'ordre inverse
     */
    public int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;

    }

    /**
     * Concatène deux tableaux
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un nouveau tableau contenant d'abord les éléments de array1, puis
     *         ceux de array2
     */
    public int[] concatenate(int[] array1, int[] array2) {
        int[] concatenatedArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            concatenatedArray[i] = array1[i];
        }
        for (int i = array1.length; i < concatenatedArray.length; i++) {
            concatenatedArray[i] = array2[i - array1.length];
        }
        return concatenatedArray;
    }

    /**
     * Extrait une sous-partie d'un tableau
     * 
     * @param array le tableau source
     * @param start l'index de début (inclus)
     * @param end   l'index de fin (exclus)
     * @return un nouveau tableau contenant les éléments de start à end-1
     */
    public int[] slice(int[] array, int start, int end) {
        int[] slicedArray = new int[end - start];
        for (int i = 0; i < array.length; i++) {
            if(i >= start && i < end){
                slicedArray[i - start] = array[i];
            }
        }
        return slicedArray;
    }
}
