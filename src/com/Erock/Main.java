/*
 *       Copyright (C) 2022 ElectronRock - All Rights Reserved
 */

package com.Erock;

public class Main {

    public static void main(String[] args) {

        double sampleAMatrix[][] = {
                { 0, 0, 1 },
                { 1, 1, 1 },
                { 1, 0, 0 }
        };

        MatrixNxN matrixInstance = new MatrixNxN(sampleAMatrix);

        assert matrixInstance.at(0, 0) < 0;

        System.out.println("Done\n");
    }

}
