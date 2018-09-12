package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTest;

class JunitTest {

	@Test
	void test() {
		OperatorTest ot = new OperatorTest();
		assertEquals(5,ot.addition(3,2),"");
		assertEquals(-1,ot.subtraction(2,3),"");
		assertEquals(6,ot.mulltiplication(2,3),"");
		assertEquals(5,ot.division(10,2),"");
		assertEquals(5,ot.modulas(17,2),"");
		assertEquals(34,ot.bitnot(12));
		assertEquals(34,ot.bitor(12,14),"");
	}

}
