package com.notificationapi.notificationapi.crossCutting.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilEmail {
    private static final String DEFAULT_VALUE_MAIL ="null.1234@uco.net.co";
    private static final String REGULAR_EXPRESION_EMAIL = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public static String getDefaultValueMail(){
        return DEFAULT_VALUE_MAIL;
    }

    public static boolean isValidEMail(String email){
        Matcher matcher = Pattern.compile(REGULAR_EXPRESION_EMAIL).matcher(email);
        return matcher.matches();
    }
}

