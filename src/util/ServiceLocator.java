package util;

import java.io.BufferedOutputStream;
import java.util.Locale;
import java.util.ResourceBundle;


public class ServiceLocator {

    private static ResourceBundle bundle;
    private static BufferedOutputStream writer;
    private static Locale locale = new Locale("en", "EN");

    public static ResourceBundle getResourceBundle() {
        if (ServiceLocator.bundle == null || !ServiceLocator.bundle.getLocale().equals(locale)){
            ServiceLocator.bundle = ResourceBundle.getBundle("util.lang.language", locale);
        }
        return bundle;
    }

    public static void setWriter(BufferedOutputStream writer) {
        if (ServiceLocator.writer != null) {
            ServiceLocator.writer = writer;
        }
    }

    public static void setLocale(String language, String country) {
        ServiceLocator.locale = new Locale(language, country);
    }

    public static Locale getLocale() {
        return locale;
    }


}