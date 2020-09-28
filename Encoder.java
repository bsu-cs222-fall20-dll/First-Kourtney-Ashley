import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Encoder {
    public String systemEncoder (String inputWikipediaPage) {
        return URLEncoder.encode(inputWikipediaPage, StandardCharsets.UTF_8);
    }
}
