package net.joemiller.spring.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary - already specified with name in BinarySearchImpl
@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
// Bean managed by Sprint


    public int[] sort(int[] numbers){
        // Dummy fxn, no logic
        return numbers;
    }
}
