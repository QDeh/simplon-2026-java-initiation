package fr.simplon.exercises;

/**
 * Exercice 10: Opérations sur les ensembles
 * 
 * Objectif: Apprendre les opérations mathématiques sur les ensembles (union,
 * intersection, différence)
 */
public class Exercise10SetOperations {

    /**
     * Vérifie si une valeur est présente dans un tableau (sur une portion)
     * 
     * @param array le tableau à parcourir
     * @param value la valeur recherchée
     * @return true si la valeur est trouvée dans les length premiers éléments
     */
    public boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Union de deux tableaux (tous les éléments uniques des deux tableaux)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant tous les éléments uniques des deux tableaux
     */
    public int[] union(int[] array1, int[] array2) {
        int[] doubleArray = new int[array1.length + array2.length];
        int comptArray1 = 0;
        int comptArray2 = 0;
        for (int i = 0; i < array1.length; i++) {
            if (!contains(doubleArray, array1[i])) {
                doubleArray[comptArray1] = array1[i];
                comptArray1++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (!contains(doubleArray, array2[i])) {
                doubleArray[comptArray1 + comptArray2] = array2[i];
                comptArray2++;
            }
        }
        int[] unionArray = new int[comptArray1 + comptArray2];
        for (int i = 0; i < comptArray1 + comptArray2; i++) {
            unionArray[i] = doubleArray[i];
        }
        return unionArray;

    }

    /**
     * Intersection de deux tableaux (éléments présents dans les deux tableaux)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans les deux tableaux
     */
    public int[] intersection(int[] array1, int[] array2) {
        int[] doubleArray = new int[Math.max(array1.length, array2.length)];
        int compt = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    doubleArray[compt] = array1[i];
                    compt++;
                    break;
                }
            }
        }
        int[] intersectionArray = new int[compt];
        for (int i = 0; i < compt; i++) {
            intersectionArray[i] = doubleArray[i];
        }
        return intersectionArray;
    }

    /**
     * Différence de deux tableaux (éléments de array1 qui ne sont pas dans array2)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments de array1 absents de array2
     */
    public int[] difference(int[] array1, int[] array2) {
        int[] temp = new int[array1.length];
        int compt = 0;
        for (int i = 0; i < array1.length; i++) {
            if (!contains(array2, array1[i])) {
                temp[compt] = array1[i];
                compt++;
            }
        }
        int[] diffArray = new int[compt];
        for (int i = 0; i < compt; i++) {
            diffArray[i] = temp[i];
        }
        return diffArray;
    }

    /**
     * Différence symétrique (éléments présents dans un seul des deux tableaux)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans un seul tableau
     */
    public int[] symmetricDifference(int[] array1, int[] array2) {
        int[] tempArray1 = difference(array1, array2);
        int[] tempArray2 = difference(array2, array1);
        int[] symDiff = new int[tempArray1.length + tempArray2.length];
        for (int i = 0; i < tempArray1.length; i++) {
            symDiff[i] = tempArray1[i];
        }
        for (int i = 0; i < tempArray2.length; i++) {
            symDiff[i+tempArray1.length] = tempArray2[i];
        }
        return symDiff;
    }

    /**
     * Vérifie si array1 est un sous-ensemble de array2
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return true si tous les éléments de array1 sont dans array2
     */
    public boolean isSubset(int[] array1, int[] array2) {
        int[] subset = difference(array1, array2);
        return subset.length == 0;
    }

    /**
     * Supprime les doublons d'un tableau
     * 
     * @param array le tableau
     * @return un tableau contenant uniquement les éléments uniques
     */
    public int[] removeDuplicates(int[] array) {
        int[] temp = new int[array.length];
        int compt = 0;
            for (int i = 0; i < array.length;i++){
                if (!contains(temp, array[i])){
                    temp[compt] = array[i];
                    compt++;
                }
            }
        int[] duplicateLess = new int[compt];
        for (int i = 0; i<compt;i++){
            duplicateLess[i] = temp[i];
        }
        return duplicateLess;
    }

    /**
     * Compte le nombre d'éléments uniques dans un tableau
     * 
     * @param array le tableau
     * @return le nombre d'éléments uniques
     */
    public int countUnique(int[] array) {
        return removeDuplicates(array).length ;

    }
}
