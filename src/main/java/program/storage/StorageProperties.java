package program.storage;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
@Data
public class StorageProperties {

    /**
     * Папка, де будуть зберігатися файли
     */
    private String location = "uploaded";

}
