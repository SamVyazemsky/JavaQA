import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class HttpBinExample {

    @Test
    public void testGetInfo() {
        Response response1 =
                given()
                        .when()
                        .get("http://httpbin.org/get?a=1")
                        .then()
                        .statusCode(200)
//                        .body("headers.Connection", equalTo("close"))
                        .body("args.a", equalTo("1"))
                        .extract()
                        .response();
    }
}
