package com.sofiatejerina.android.testui;
import android.util.Patterns;

class Playground {
    public static String probando() {
        String host = null;
        String DOMAIN_NAME = "google.com";
        if (!Patterns.DOMAIN_NAME.matcher(host).matches() || host == null) {
            return "falso";
        }
        return "verdadero";
    }
}
