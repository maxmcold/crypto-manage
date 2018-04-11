package com.mdv;

public class Configuration {
    private static Configuration ourInstance = new Configuration();

    public static Configuration getInstance() {
        return ourInstance;
    }

    private Configuration() {

    }
    public String getAPIkey(){
        return "JAyrMTHa1BSl2icB";
    }
    public String getAPISecret(){
        return "6koKGVXy8g5JSSl5kzlmk9AK1HlxCXR4";
    }
}
