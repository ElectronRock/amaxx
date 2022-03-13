/*
 *       Copyright (C) 2022 ElectronRock - All Rights Reserved
 */

package com.Erock;

public class MatrixNxN {

    private double[][] matrixImpl;
    private int sizeN;

    public MatrixNxN(double[][] matrix) {
        sizeN = (int)Math.sqrt(matrix.length);
        matrixImpl = matrix.clone();
    }

    public MatrixNxN(int size) {
        sizeN = size;
        matrixImpl = new double[size][size];
    }

    public double det() {
        return 0.0;
    }

    public MatrixNxN inv() {
        return new MatrixNxN(0);
    }

    public MatrixNxN transpose() {
        return new MatrixNxN(0);
    }

    public void set(int i, int j, double value) {

    }

    public double at(int i, int j){
        return matrixImpl[i][j];
    }
}
