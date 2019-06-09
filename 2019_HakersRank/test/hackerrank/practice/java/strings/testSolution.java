package hackerrank.practice.java.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class testSubstringComparisons {

	@Test
	void test() {
		//https://www.hackerrank.com/challenges/java-string-compare/problem
    	String s ="welcometojava";
    	int k =3;
        assertEquals(SubstringComparisons.getSmallestAndLargest(s, k),"ava\nwel");
	}

}
