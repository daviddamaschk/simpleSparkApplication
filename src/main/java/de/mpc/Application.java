package de.mpc;

import static spark.Spark.get;
import static spark.Spark.port;

public class Application {
    public static void main(String[] args) {
        port(9999);
        get("/hello/:name", (req, res) -> "Hello " + req.params(":name"));
    }
}
