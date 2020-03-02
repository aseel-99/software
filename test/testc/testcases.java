package testc;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calc.Calc1;

class testcases {

	@Test
	void test() {
		Calc1 test = new Calc1();
		int output = test.add(0, 4);
assertEquals(4,output);
	}

}
class testmult {

	@Test
	void test() {
		Calc1 test = new Calc1();
		int output = test.mult(0, 4);
assertEquals(0,output);
	}

}