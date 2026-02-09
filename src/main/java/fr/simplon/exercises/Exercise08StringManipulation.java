package fr.simplon.exercises;

/**
 * Exercice 8: Manipulation de chaînes de caractères
 * 
 * Objectif: Apprendre à manipuler les String
 */
public class Exercise08StringManipulation {

    /**
     * Inverse une chaîne de caractères
     * 
     * @param str la chaîne à inverser
     * @return la chaîne inversée
     */
    public String reverseString(String str) {
        String inverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            inverse += str.charAt(i);
        }
        return inverse;
    }

    /**
     * Vérifie si une chaîne est un palindrome
     * 
     * @param str la chaîne à vérifier
     * @return true si c'est un palindrome, false sinon
     */
    public boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2 + 1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    /**
     * Compte le nombre de voyelles dans une chaîne
     * 
     * @param str la chaîne
     * @return le nombre de voyelles (a, e, i, o, u)
     */
    public int countVowels(String str) {
        int compteur = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                compteur++;
            } else if (str.charAt(i) == 'e') {
                compteur++;
            } else if (str.charAt(i) == 'i') {
                compteur++;
            } else if (str.charAt(i) == 'o') {
                compteur++;
            } else if (str.charAt(i) == 'u') {
                compteur++;
            }
        }
        return compteur;

    }

    /**
     * Compte le nombre de mots dans une chaîne
     * 
     * @param str la chaîne
     * @return le nombre de mots (séparés par des espaces)
     */
    public int countWords(String str) {
        int compteur = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                compteur++;
            }
        }
        return compteur;
    }

    /**
     * Met la première lettre de chaque mot en majuscule
     * 
     * @param str la chaîne
     * @return la chaîne avec chaque mot commençant par une majuscule
     */
    public String capitalizeWords(String str) {
        String capitalized = "";
        capitalized += Character.toUpperCase(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {   
            capitalized += str.charAt(i);
            if (str.charAt(i) == ' ') {
                capitalized += Character.toUpperCase(str.charAt(i + 1));
                i++;
            }
        }
        return capitalized;
    }
}
