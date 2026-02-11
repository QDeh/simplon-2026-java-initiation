package fr.simplon.exercises;

/**
 * Exercice 13: Recherche dans un tableau
 * 
 * Objectif: Apprendre à rechercher des éléments dans un tableau
 */
public class Exercise13SimpleSearch {

    Exercise12SwappingElements exercise12 = new Exercise12SwappingElements();
    Exercise06ArraysMaxMin exercise06 = new Exercise06ArraysMaxMin();

    /**
     * Vérifie si le tableau est trié en ordre croissant
     * 
     * @param array le tableau
     * @return true si le tableau est trié, false sinon
     */
    public boolean isSorted(int[] array) {
        return exercise12.countInversions(array) == 0;

    }

    /**
     * Recherche linéaire: trouve l'index d'une valeur dans un tableau
     * 
     * @param array  le tableau
     * @param target la valeur à chercher
     * @return l'index de la valeur, ou -1 si non trouvée
     */
    public int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Recherche binaire: trouve l'index d'une valeur dans un tableau TRIÉ
     * 
     * @param array  le tableau trié
     * @param target la valeur à chercher
     * @return l'index de la valeur, ou -1 si non trouvée
     */

    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == target) {
                return middle;
            }
            if (array[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    /**
     * Trouve tous les indices où une valeur apparaît
     * 
     * @param array  le tableau
     * @param target la valeur à chercher
     * @return un tableau contenant tous les indices où la valeur apparaît
     */
    public int[] findAllIndices(int[] array, int target) {
        int[] temp = new int[array.length];
        int compt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                temp[compt] = i;
                compt++;
            }
        }
        int[] indices = new int[compt];
        for (int i = 0; i < compt; i++) {
            indices[i] = temp[i];
        }
        return indices;
    }

    /**
     * Trouve le deuxième plus grand élément d'un tableau
     * 
     * @param array le tableau
     * @return le deuxième plus grand élément
     */
    public int findSecondMax(int[] array) {
        int max = exercise06.findMax(array);
        int[] temp = new int[array.length];
        int compt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != max) {
                temp[compt] = array[i];
                compt++;
            }
        }
        int[] arrayWithoutMax = new int[compt];
        for (int i = 0; i < compt; i++) {
            arrayWithoutMax[i] = temp[i];
        }
        return exercise06.findMax(arrayWithoutMax);
    }
}
