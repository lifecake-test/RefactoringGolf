package com.develogical.golf.hole5;

import java.util.Iterator;

public class Hole5Before {

    class FibonacciSequence extends NumberSequence {

        @Override
        public int term(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Sequence undefined for negative index");
            }
            if (n < 2) {
                return 1;
            }
            return term(n - 2) + term(n - 1);
        }

    }

    class TriangularNumberSequence extends NumberSequence {

        @Override
        public int term(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Sequence undefined for negative index");
            }
            return (n + 2) * (n + 1) / 2;
        }
    }

    public void generate() {
        new FibonacciSequence().term(3);
        new TriangularNumberSequence().term(3);
    }

}