package $package$;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeClassTest {
	@Test
	void someMethod_returnsResult() {
        JavalinTest.test(new App().createServer(), (server, client) -> {
           var response = client.get("/");
            assertThat(response.code())
                .isEqualTo(200);
            assertThat(response.body().string())
                .contains("Hello, world!"));
        });
	}
}
