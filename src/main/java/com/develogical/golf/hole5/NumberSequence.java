package com.develogical.golf.hole5;

import java.util.Iterator;

/**
 * Created by ape04 on 19/01/2016.
 */
public abstract class NumberSequence {
    public abstract int term(int n);

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private int currentIndex = 0;

            public boolean hasNext() {
                return true;
            }

            public Integer next() {
                int result = term(currentIndex);
                currentIndex++;
                return result;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
