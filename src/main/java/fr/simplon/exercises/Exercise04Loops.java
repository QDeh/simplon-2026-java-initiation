package fr.simplon.exercises;

/**
 * Exercice 4: Boucles
 * 
 * Objectif: Apprendre à utiliser les boucles for et while
 */
public class Exercise04Loops {

    /**
     * Calcule la somme des nombres de 1 à n
     * 
     * @param n le nombre maximum
     * @return la somme de 1 + 2 + ... + n
     */
    public int sumUpToN(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;

    }

    /**
     * Inverse un nombre (ex: 123 -> 321)
     * 
     * @param number le nombre à inverser
     * @return le nombre inversé
     */
    public int reverseNumber(int number) {
        int inverse = 0;
        while (number > 0) {

            int chiffre = number % 10;
            inverse = inverse * 10 + chiffre;
            number = number / 10;
        }
        return inverse;

    }

    /**
     * Calcule la factorielle d'un nombre (n!)
     * 
     * @param n le nombre
     * @return n! (n factorielle)
     */
    public int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;

    }

    /**
     * Compte le nombre de chiffres dans un nombre
     * 
     * @param number le nombre
     * @return le nombre de chiffres
     */
    public int countDigits(int number) {
        int compteur = 1;
        while (number / 10 > 0) {
            number = number / 10;
            compteur++;
        }
        return compteur;
    }

    /**
     * Vérifie si un nombre est premier
     * 
     * @param number le nombre à vérifier
     * @return true si le nombre est premier, false sinon
     */
    public boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Exercise04Loops exercise = new Exercise04Loops();
        exercise.countDigits(880);
    }
}
