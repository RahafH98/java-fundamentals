package linter.test;

import linter.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testLinterNoErrors() {
        // Test the linter on a file that contains no errors
        assertEquals(0, App.lintJavaScriptFile("/app/src/test/java/linter.test/test.js").size());
    }

    @Test
    public void testLinterOneError() {
        // Test the linter on a file that contains one error
        assertEquals(1, App.lintJavaScriptFile("/app/src/test/java/linter.test/test.js").size());
    }

    @Test
    public void testLinterFewErrors() {
        // Test the linter on a file that contains few errors
        assertEquals(2, App.lintJavaScriptFile("/app/src/test/java/linter.test/test.js").size());
    }

    @Test
    public void testLinterManyErrors() {
        // Test the linter on a file that contains many errors
        assertEquals(3, App.lintJavaScriptFile("/app/src/test/java/linter.test/test.js").size());
    }

    @Test
    public void testLinterEmptyFile() {
        // Test the linter on an empty file
        assertEquals(0, App.lintJavaScriptFile("/app/src/test/java/linter.test/empty.js").size()); // Create an empty.js file if needed
    }
}
