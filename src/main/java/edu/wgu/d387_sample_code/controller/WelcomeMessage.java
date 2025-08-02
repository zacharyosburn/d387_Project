package edu.wgu.d387_sample_code.controller;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage implements Runnable{

    private Locale locale;
    private String message;
    public WelcomeMessage(Locale locale) {
        this.locale = locale;
    }

    public String getMessage() {
        ResourceBundle rb = ResourceBundle.getBundle("translation", locale);
        return rb.getString("welcome");
    }

    @Override
    public void run() {
        try{
            ResourceBundle rb = ResourceBundle.getBundle("translation", locale);
            this.message = rb.getString("welcome");
        }
        catch(Exception e){
            e.printStackTrace();
            this.message = "Couldn't load WelcomeMessage: " + message;
        }
    }

}
