package linter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<String> lintJavaScriptFile(String filePath) throws IOException {
        List<String> errorMessages = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(App.class.getResourceAsStream(filePath)))) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty() && !line.endsWith("{") && !line.endsWith("}") && !line.contains("if") && !line.contains("else") && !line.endsWith(";")) {
                    errorMessages.add("Line " + lineNumber + ": Missing semicolon.");
                }

                lineNumber++;
            }
        }

        return errorMessages;
    }

    public static void main(String[] args) {
        String filePath = "/gates.js";

        try {
            List<String> errorMessages = lintJavaScriptFile(filePath);
            if (errorMessages.isEmpty()) {
                System.out.println("No errors found.");
            } else {
                for (String errorMessage : errorMessages) {
                    System.out.println(errorMessage);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
