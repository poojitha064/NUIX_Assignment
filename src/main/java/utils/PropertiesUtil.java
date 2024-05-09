package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Helps to read data from test data files
 */
public class PropertiesUtil {

    /**
     * Gets value of the given key from the file provided
     * @param fileName file from which property to be fetched
     * @param propertyName name of the property to fetch
     * @return string value of property fetched
     * @throws IOException
     */
    public static String getData(String fileName, String propertyName) throws IOException {
        try {
            Properties prop = new Properties();
            File configFile = new File("src/test/resources/" + fileName+".properties");
            InputStream stream = new FileInputStream(configFile);
            prop.load(stream);
            return (String) prop.get(propertyName);
        }catch(IOException e){
            throw e;
        }

    }

}
