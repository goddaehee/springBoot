package gdh.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {
	"classpath:properties/application-${spring.profiles.active}.yml"
	,"classpath:properties/common.yml"
	}, factory = YamlPropertySourceFactory.class, ignoreResourceNotFound = true)
public class PropertyConfig {
}
