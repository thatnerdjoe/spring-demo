package net.joemiller.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
// Bean managed by Spring
    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;
    // Dependency of the BinarySearchImpl bean

    /* Constructor Injection, recommended method for MANDATORY dependencies
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }
     */

    /* Setter Injection, not required to create setter methods
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
     */

    public int binarySearch(int[] numbers, int target){
        // Sorting the array
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // search the array
        // return the result
        return 3;
    }

}
