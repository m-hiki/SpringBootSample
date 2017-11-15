package common.defs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.Data;


@Component
@Data
public class Config {
    @Value("${spring.profiles.active}")
    private String activeProfile;
}
