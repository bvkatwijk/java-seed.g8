package $package$;

import io.javalin.testtools.JavalinTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
	@Test
	void get_returns_correct_result() {
        JavalinTest.test(App.createServer(), (server, client) -> {
           var response = client.get("/");
            assertThat(response.code())
                .isEqualTo(200);
            assertThat(response.body().string())
                .contains("Hello world!");
        });
	}
}
