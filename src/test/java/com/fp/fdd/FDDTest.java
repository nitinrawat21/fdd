package com.fp.fdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class FDDTest {

	@Test
	public void testIfFddIsAwesome() {
		FDD fddInstance = new FDD();
		
		assertTrue(fddInstance.isFDDAwesome());
	}

}
