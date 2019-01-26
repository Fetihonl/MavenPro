package com.cybertek.com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        //this the path to the location of the file
        String path = "configuration.properties";

        try {

            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);



            fileInputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String property){
        return properties.getProperty(property);
    }
}
