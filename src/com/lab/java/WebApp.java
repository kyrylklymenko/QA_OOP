package com.lab.java;

public class WebApp extends BaseApp {

    String pagesPath; // Relative path to html pages of the app

    String browser; // Browser and version

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getOSversion() {
        return OSversion;
    }

    @Override
    public void run() {

    }

    @Override
    public void someParticularLogic() {

    }

    @Override
    public void runTests() {

    }

    @Override
    public void dbConnect() {

    }

    @Override
    public String getAuthToken() {
        return null;
    }

    public void loadPages(){
        System.out.println("Loading pages from" + pagesPath);
    }
}
