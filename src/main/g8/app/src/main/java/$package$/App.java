package $package$;

import io.javalin.Javalin;
import $package$.SomeClass;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("[Start] Creating server");
        createServer().start(8080);
        log.info("[Done ] Creating server");
    }

    public static Javalin createServer() {
        var app = Javalin.create(config -> {
            config.staticFiles.enableWebjars();
            config.staticFiles.add("/public");
        });

        app.get("/", ctx -> ctx.html(new SomeClass().someMethod()));

        return app
            .before(it -> MDC.put("time", "" + System.nanoTime()))
            .after(it -> log.info(
                "{} [{} ms] {} {}",
                it.status(),
                (System.nanoTime() - Long.parseLong(MDC.get("time"))) / 1000000,
                it.method(),
                it.path()));
    }
}
