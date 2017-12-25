package com.trinhha.scrumboard.scrumboardserver.util;

public class Constants {
    public static String STR__NEW_LINE = "\n";
    public static String STR__REQUEST_SUCCESS = "Success";

    public static String getSuccessMessage(String className) {
        return className + " " + STR__REQUEST_SUCCESS;
    }
}
