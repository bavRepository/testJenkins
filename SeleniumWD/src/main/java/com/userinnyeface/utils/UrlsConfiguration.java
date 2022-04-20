package com.userinnyeface.utils;

public class UrlsConfiguration {

    public static String getStartUrl() {
        return Environment.getCurrentCurrentJsonFile("config.json").getValue("/startUrl").toString();
    }
}