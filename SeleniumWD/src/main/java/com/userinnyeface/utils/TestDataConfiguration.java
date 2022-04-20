package com.userinnyeface.utils;

import aquality.selenium.core.logging.Logger;

public class TestDataConfiguration {

    public static String getParameterValue(String key) {
        Logger.getInstance().info("Get parameter " + key + " value");
        return Environment.getCurrentCurrentJsonFile("testData.json").getValue("/" + key).toString();
    }
}