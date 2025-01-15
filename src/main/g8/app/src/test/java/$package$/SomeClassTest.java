package $package$;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeClassTest {
	@Test
	void someMethod_returnsResult() {
		assertEquals("result", new SomeClass().someMethod());
	}
}
