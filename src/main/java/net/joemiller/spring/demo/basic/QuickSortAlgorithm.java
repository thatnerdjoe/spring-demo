package net.joemiller.spring.demo.basic;

import net.joemiller.spring.demo.basic.SortAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {
// Bean managed by Sprint


    public int[] sort(int[] numbers){
        // Dummy fxn, no logic
        return numbers;
    }
}
