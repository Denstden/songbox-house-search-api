package songbox.house.domain.dto;

import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Map;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class ClientConfiguration {

    Proxy proxy;
    Map<String, String> cookies;

    @Data
    @FieldDefaults(level = PRIVATE, makeFinal = true)
    public static class Proxy {
        String host;
        int port;
    }
}
