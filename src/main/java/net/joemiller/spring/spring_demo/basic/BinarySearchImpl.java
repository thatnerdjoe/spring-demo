package net.joemiller.spring.spring_demo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlgorithm quickSortAlgorithm;
    // Dependency of the BinarySearchImpl bean
    //EXAMPLE: Autowiring by-name (Overridden if @Primary is used on dependency)

    /*
    EXAMPLE: Autowiring with @Qualifer
    @Qualifier("quickSortAlgorithm")
    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;
    */

    /*
    EXAMPLE: Autowiring by-type (Overridden if @Primary is used on dependency)
    @Autowired
    private BubbleSortAlgorithm sortAlgorithm;
    */

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
        int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
        System.out.println(quickSortAlgorithm);

        // search the array
        // return the result
        return 3;
    }

}
