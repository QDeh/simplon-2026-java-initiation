package fr.simplon.exercises;

/**
 * Exercice 7: Tableaux - Somme et moyenne
 * 
 * Objectif: Apprendre à calculer la somme et la moyenne des éléments d'un tableau
 */
public class Exercise07ArraysSumAverage {
    
    /**
     * Calcule la somme de tous les éléments d'un tableau
     * @param array le tableau
     * @return la somme de tous les éléments
     */
    public int sum(int[] array) {
        int somme = 0;
        for (int i = 0; i < array.length;i++){
            somme = somme + array[i];
        }
        return somme;

    }
    
    /**
     * Calcule la moyenne des éléments d'un tableau
     * @param array le tableau
     * @return la moyenne (arrondie à l'entier inférieur)
     */
    public double average(int[] array) {
        int somme = 0;
        for (int i = 0; i < array.length;i++){
            somme = somme + array[i];
        }
        int moyenne = somme / array.length;
        return moyenne;

    }
    
    /**
     * Compte combien d'éléments sont supérieurs à la moyenne
     * @param array le tableau
     * @return le nombre d'éléments supérieurs à la moyenne
     */
    public int countAboveAverage(int[] array) {
        int somme = 0;
        int compteur = 0;
        for (int i = 0; i < array.length;i++){
            somme = somme + array[i];
        }
        int moyenne = somme / array.length;
        for (int i = 0; i < array.length;i++){
            if (array[i] > moyenne){
                compteur++;
            }
        }
        return compteur;

    }
    
    /**
     * Calcule la somme des nombres pairs dans un tableau
     * @param array le tableau
     * @return la somme des nombres pairs
     */
    public int sumEvenNumbers(int[] array) {
        int somme = 0;
        for (int i = 0; i < array.length;i++){
            if (array[i] % 2 == 0){
                somme = somme + array[i];
            }
        }
        return somme;

    }
    
    /**
     * Calcule le produit de tous les éléments d'un tableau
     * @param array le tableau
     * @return le produit de tous les éléments
     */
    public int product(int[] array) {
        int produit = 1;
        for (int i = 0; i < array.length;i++){
                produit = produit * array[i];
        }
        return produit;
    }
}
