package fr.simplon.exercises;

/**
 * Exercice 11: Tableaux à deux dimensions
 * 
 * Objectif: Apprendre à manipuler des tableaux à deux dimensions (matrices)
 */
public class Exercise11TwoDimensionalArrays {

    /**
     * Crée une matrice remplie de zéros
     * 
     * @param rows nombre de lignes
     * @param cols nombre de colonnes
     * @return une matrice rows x cols remplie de 0
     */
    public int[][] createMatrix(int rows, int cols) {
        return new int[rows][cols];

    }

    /**
     * Calcule la somme de tous les éléments d'une matrice
     * 
     * @param matrix la matrice
     * @return la somme de tous les éléments
     */
    public int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

    /**
     * Trouve le maximum dans une matrice
     * 
     * @param matrix la matrice
     * @return la valeur maximale
     */
    public int findMaxInMatrix(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max ){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Transpose une matrice (lignes ↔ colonnes)
     * 
     * @param matrix la matrice à transposer
     * @return la matrice transposée
     */
    public int[][] transpose(int[][] matrix) {
        int[][] inverse = createMatrix(matrix[0].length,matrix.length);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                    inverse[i][j] = matrix[j][i];
            }
        }
        return inverse;
    }

    /**
     * Retourne la diagonale principale d'une matrice carrée
     * 
     * @param matrix la matrice carrée
     * @return un tableau contenant les éléments de la diagonale
     */
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j){
                    diagonal[i] = matrix[i][j];
                }
            }
        }
        return diagonal;
    }

}
