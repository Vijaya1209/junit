package com.assignments.testcases;

public class MaxMinFinderTest {
	 @Test
	    public void findMinOfGivenArray() {

	        MaxMinFinder minMaxFinder = new MaxMinFinder();
	        int[] sampleArray1 = {2, 5, 1, 7};
	        int[] resultArray = minMaxFinder.findMinMax(sampleArray1);

	        Asserts.assertEquals(1, resultArray[1]);


	    }

	    @Test
	    public void findMaxOfGivenArray() {

	    	MaxMinFinder minMaxFinder = new MaxMinFinder();
	        int[] sampleArray1 = {2, 5, 1, 7};
	        int[] resultArray = minMaxFinder.findMinMax(sampleArray1);

	        assertEquals(7, resultArray[0]);


	    }

	    @Test(expected = NoSuchElementException.class)
	    public void throwExceptionWhenArrayIsEmpty() {

	    	MaxMinFinder minMaxFinder = new MaxMinFinder();
	        int[] array = {};
	        minMaxFinder.findMinMax(array);


	    }

	    @Test
	    public void findMinOfGivenArrayForQ2() {

	    	MaxMinFinder minMaxFinder = new MaxMinFinder();
	        int[] sampleArray1 = {2, 5, 1, 7};

	        MaxMinFinder.MinMaxResult minMaxObject = minMaxFinder.findMinMaxObject(sampleArray1);


	        assertEquals(1, minMaxObject.getMinValue());


	    }

	    @Test
	    public void findMaxOfGivenArrayForQ2() {

	    	MaxMinFinder minMaxFinder = new MaxMinFinder();
	        int[] sampleArray1 = {2, 5, 1, 7};

	        MaxMinFinder.MinMaxResult minMaxObject = minMaxFinder.findMinMaxObject(sampleArray1);


	        assertEquals(7, minMaxObject.getMaxValue());


	    }

	    @Test(expected = NoSuchElementException.class)
	    public void throwExceptionWhenArrayIsEmptyInQ2() {

	    	MaxMinFinder minMaxFinder = new MaxMinFinder();
	        int[] array = {};
	        minMaxFinder.findMinMaxObject(array);


	    }
}
