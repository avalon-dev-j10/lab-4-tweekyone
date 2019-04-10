package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Arrays;

public class Sorting implements Sort{

    @Override
    public void sort(Object[] array) {
        if(array != null && array.length != 0){
            Arrays.sort(array);
        }
    }

    @Override
    public void sort(Comparable[] array) {
        if (array != null && array.length != 0){
            boolean sorted = false;
            Comparable tmp;
            
            while(!sorted){
                sorted = true;
                for (int i = 0; i < array.length - 1; i++){
                    int result = array[i].compareTo(array[i+1]);
                    if (result > 0){
                        sorted = false;
                            
                        tmp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = tmp;
                        }
                }
            }
        }
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        if (array != null && array.length != 0){
            boolean sorted = false;
            Object tmp;
            
            while(!sorted){
                sorted = true;
                for (int i = 0; i < array.length - 1; i++){
                    int result = comparator.compare(array[i], array[i+1]);
                    if (result < 0){
                        sorted = false;
                            
                        tmp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = tmp;
                        }
                }
            }
        }
    }
    
}
