package com.mrding.one.utils;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by mrding on 15-11-18.
 */
public class PropertyUtils {

    private static Logger logger = Logger.getLogger(PropertyUtils.class);

    private static final String ONE_DYNAMIC = "one-dynamic.properties";

    private static PropertyUtils instance = new PropertyUtils();

    private Properties props;

    private PropertyUtils() {
        load();
    }

    public static PropertyUtils getInstance() {
        return instance;
    }

    public void load() {
        if (props == null) {
            props = new Properties();
        }
        try {
            props.load(new FileInputStream(this.getClass().getResource("/").getPath() + ONE_DYNAMIC));
        } catch (Exception e) {
            logger.error("Excpetion when load one-dynamic.properties", e);
        }
    }

    public String getProperty(String key) {
        return props.getProperty(key);
    }
    public String getProperty(String key, String defaultValue) {
        return props.getProperty(key, defaultValue);
    }

    public void refresh() {
        load();
    }

}
