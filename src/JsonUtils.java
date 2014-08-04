import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtils {
    private static ObjectMapper sObjectMapper = new ObjectMapper();

    public static <T> T parseJson(String jsonString, Class<T> cls) {
        try {
            return sObjectMapper.readValue(jsonString, cls);
        } catch (IOException e) {
            System.out.println("JsonUtils - failed to parse JSON entity " + cls.getSimpleName());
            throw new RuntimeException(e);
        }
    }
}
