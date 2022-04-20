package com.userinnyeface.utils;

import aquality.selenium.core.logging.Logger;

import java.io.File;

public class FilePathManager {

    public static String getAbsolutePath(String relativePath){
        Logger.getInstance().info("Get absolute path to " + relativePath);
        return new File(relativePath).getAbsolutePath();
    }
}