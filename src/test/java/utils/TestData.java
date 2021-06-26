package utils;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class TestData {
	
	public Properties properties;
	
	public TestData() throws IOException {
		Resource resource = new ClassPathResource("data/config.properties");
		properties = PropertiesLoaderUtils.loadProperties(resource);
	}


}
