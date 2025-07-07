package utils;

import org.json.JSONArray;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class TestDataReader {
    public static JSONArray getTestData(String path) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(path)));
            return new JSONArray(content);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
