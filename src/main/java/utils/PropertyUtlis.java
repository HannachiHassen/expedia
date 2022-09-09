package utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import constants.FrameworkConstants;
import enums.ConfigProperties;

public final class PropertyUtlis {

	private PropertyUtlis() {

	}

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();

	static {
		//try with resources
		try (FileInputStream file = new FileInputStream(FrameworkConstants.getConfigFilePath()); BufferedInputStream bfis=new BufferedInputStream(file)){
			property.load(file);

		   for (Map.Entry<Object, Object> entry : property.entrySet()) {
			    CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim()); //remove the trailing and leading spaces		
		   }
		}catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	} 	

		public static String get(ConfigProperties key) throws Exception {
			if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
				throw new Exception("Property name "+ key +" is not found. Please check config.properties");
			}
			return CONFIGMAP.get(key.name().toLowerCase());
		}

}
